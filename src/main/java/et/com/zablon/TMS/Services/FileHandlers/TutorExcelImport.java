package et.com.zablon.TMS.Services.FileHandlers;

import et.com.zablon.TMS.Dtos.TutorInDto;
import et.com.zablon.TMS.Models.Enums.Gender;
import et.com.zablon.TMS.Models.Tutor;
import et.com.zablon.TMS.Services.TutorService;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class TutorExcelImport {

    private final TutorService tutorService;

    public TutorExcelImport(TutorService tutorService) {
        this.tutorService = tutorService;
    }

    public List<Tutor> excelImport(MultipartFile files) throws IOException {
        List<TutorInDto> tutorList = new ArrayList<>();
        XSSFWorkbook workbook = new XSSFWorkbook(files.getInputStream());
        XSSFSheet worksheet = workbook.getSheetAt(0);
        for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
            if (index > 0) {

                TutorInDto tutor = new TutorInDto();
                XSSFRow row = worksheet.getRow(index);


//                String s = String.valueOf(row.getCell(2));
//                String[] s1 = s.split(" ");
//                tutor.setFirstName(s1[0]);
//                if (s1[1].isEmpty()){
//                    tutor.setLastName(null);
//                }else {
//                    tutor.setLastName(s1[1]);
//                }

                tutor.setFirstName(String.valueOf(row.getCell(2)));
//                tutor.setCustomId(row.getCell(1).getStringCellValue());
                tutor.setGender(Gender.Female);
//                tutor.setDateOfBirth(row.getCell(5).getDateCellValue());
                tutor.setPhoneNumber(String.valueOf(row.getCell(7)));
                tutor.setEmail(String.valueOf(row.getCell(0)));
                tutor.setActive(true);
                //Educational
//                tutor.setSchoolName(row.getCell(9).getStringCellValue());
                tutor.setGrade12Result(String.valueOf(row.getCell(5)));
//                tutor.setUniversity(row.getCell(11).getStringCellValue());
                tutor.setDepartment(String.valueOf(row.getCell(10)));
//                tutor.setEducationalLevel(row.getCell(13).getStringCellValue());
                tutor.setHigherLevelResult(String.valueOf(row.getCell(6)));
//                tutor.setTempo(row.getCell(1)());
//                tutor.setResume(row.getCell(1));
//                tutor.setKebeleId(row.getCell(1));
                //Availability Days
                List<Long> days = new ArrayList<>();
                days.add(1L);
                days.add(3L);
                days.add(4L);
                tutor.setWeekDays(days);
                //Grade Distinction
                tutor.setGradeDistinction(1L);
                //Address Related
//                tutor.setCity(row.getCell(16).getStringCellValue());
//                tutor.setSubCity(row.getCell(17).getStringCellValue());
//                tutor.setZone(row.getCell(18).getStringCellValue());
//                tutor.setWoreda(row.getCell(19).getStringCellValue());
//                tutor.setKebele(row.getCell(20).getStringCellValue());
//                tutor.setLongitude(row.getCell(21).getStringCellValue());
//                tutor.setLatitude(row.getCell(22).getStringCellValue());
                tutorList.add(tutor);
            }
//            }
        }
        return tutorService.createTutors(tutorList);
    }
}
