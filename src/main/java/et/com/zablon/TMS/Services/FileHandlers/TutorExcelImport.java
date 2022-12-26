package et.com.zablon.TMS.Services.FileHandlers;

import et.com.zablon.TMS.Dtos.TutorInDto;
import et.com.zablon.TMS.Models.Gender;
import et.com.zablon.TMS.Models.Tutor;
import et.com.zablon.TMS.Services.TutorService;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TutorExcelImport {

    private final TutorService tutorService;

    public TutorExcelImport(TutorService tutorService) {
        this.tutorService = tutorService;
    }

    public List<Tutor> excelImport(@RequestBody MultipartFile files) throws IOException {
        List<TutorInDto> tutorList = new ArrayList<>();
        XSSFWorkbook workbook = new XSSFWorkbook(files.getInputStream());
        XSSFSheet worksheet = workbook.getSheetAt(0);
        for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
            if (index > 0) {
                TutorInDto tutor = new TutorInDto();
                XSSFRow row = worksheet.getRow(index);
                String name = row.getCell(0).getStringCellValue();
                String[] split = name.split(" ");
                tutor.setFirstName(split[0]);
                tutor.setLastName(split[1]);
                tutor.setCustomId(row.getCell(3).getStringCellValue());
                tutor.setGender(Gender.valueOf(row.getCell(4).getStringCellValue()));
                tutor.setDateOfBirth(row.getCell(5).getDateCellValue());
                tutor.setPhoneNumber((int) row.getCell(6).getNumericCellValue());
                tutor.setEmail(row.getCell(7).getStringCellValue());
                tutor.setActive(row.getCell(8).getBooleanCellValue());
                //Educational
                tutor.setSchoolName(row.getCell(9).getStringCellValue());
                tutor.setGrade12Result((int) row.getCell(10).getNumericCellValue());
                tutor.setUniversity(row.getCell(11).getStringCellValue());
                tutor.setDepartment(row.getCell(12).getStringCellValue());
                tutor.setEducationalLevel((long)row.getCell(13).getNumericCellValue());
                tutor.setHigherLevelResult((int) row.getCell(14).getNumericCellValue());
//                tutor.setTempo(row.getCell(1)());
//                tutor.setResume(row.getCell(1));
//                tutor.setKebeleId(row.getCell(1));
                //Availability Days
//                tutor.setWeekDays(row.getCell(1).get);
                //Grade Distinction
                tutor.setGradeDistinction((long)row.getCell(15).getNumericCellValue());
                //Address Related
                tutor.setCity(row.getCell(16).getStringCellValue());
                tutor.setSubCity(row.getCell(17).getStringCellValue());
                tutor.setZone(row.getCell(18).getStringCellValue());
                tutor.setWoreda(row.getCell(19).getStringCellValue());
                tutor.setKebele(row.getCell(20).getStringCellValue());
                tutor.setLongitude(row.getCell(21).getStringCellValue());
                tutor.setLatitude(row.getCell(22).getStringCellValue());
                tutorList.add(tutor);
            }
        }
        return tutorService.createTutors(tutorList);
    }
}
