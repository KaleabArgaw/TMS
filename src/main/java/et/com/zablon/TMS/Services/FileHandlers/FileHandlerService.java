package et.com.zablon.TMS.Services.FileHandlers;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileHandlerService {
    private String filePath = System.getProperty("user.dir") + "/Uploads";

    public String tempoFile(@RequestParam("file") MultipartFile file, String name) throws IOException {
        File convertFile = new File(filePath + "/var/tempo/" + file.getOriginalFilename());
        convertFile.createNewFile();
        FileOutputStream fout = new FileOutputStream(convertFile);
        fout.write(file.getBytes());
        fout.close();
        return "Tempo is upload successfully";
    }

    public String cvUpload(@RequestParam("file") MultipartFile file, String name) throws IOException {
        File convertFile = new File(filePath + "/var/cv/" + file.getOriginalFilename());
        convertFile.createNewFile();
        FileOutputStream fout = new FileOutputStream(convertFile);
        fout.write(file.getBytes());
        fout.close();
        return "File is upload successfully";
    }
}
