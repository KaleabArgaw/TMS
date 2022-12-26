package et.com.zablon.TMS.Services.FileHandlers;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class FileHandlerService {
    private String filePath = System.getProperty("user.dir");

    public byte[] tempoFile(@RequestParam("file") MultipartFile file, String name) throws IOException {
        File convertFile = new File(filePath + "src/main/resources/var/Tempo/" + file.getOriginalFilename());
        convertFile.createNewFile();
        FileOutputStream fout = new FileOutputStream(convertFile);
        byte[] bytes = file.getBytes();
        fout.write(bytes);
        fout.close();
        return bytes;
    }

    public byte[] cvUpload(MultipartFile file, String name) throws IOException {
        File convertFile = new File("C:/Users/Zablon/IdeaProjects/TMS/src/main/resources/var/CV/" + name + "." +FilenameUtils.getExtension(file.getOriginalFilename()));
        System.out.println(filePath);
        convertFile.createNewFile();
        FileOutputStream fout = new FileOutputStream(convertFile);
        byte[] bytes = file.getBytes();
        fout.write(bytes);
        fout.close();
        return bytes;
    }

    public byte[] imageFile(@RequestParam("file") MultipartFile file, String name) throws IOException {
        File convertFile = new File(filePath + "src/main/resources/var/Images/" + name + file.getOriginalFilename());
        convertFile.createNewFile();
        FileOutputStream fout = new FileOutputStream(convertFile);
        byte[] bytes = file.getBytes();
        fout.write(bytes);
        fout.close();
        return bytes;
    }

    public byte[] kebeleId(@RequestParam("file") MultipartFile file, String name) throws IOException {
        File convertFile = new File(filePath + "src/main/resources/var/KebeleId/" + name + file.getOriginalFilename());
        convertFile.createNewFile();
        FileOutputStream fout = new FileOutputStream(convertFile);
        byte[] bytes = file.getBytes();
        fout.write(bytes);
        fout.close();
        return bytes;
    }
}
