package et.com.zablon.TMS.Controllers;

import et.com.zablon.TMS.Services.FileHandlers.FileHandlerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/file-upload")
@Tag(name = "File Upload")
public class FileUploadController {

    private final FileHandlerService fileHandlerService;

    public FileUploadController(FileHandlerService fileHandlerService) {
        this.fileHandlerService = fileHandlerService;
    }

    @PostMapping("/upload-cv")
    public byte[] uploadCv(@RequestParam MultipartFile file,@RequestParam String name) throws IOException {
        return fileHandlerService.cvUpload(file, name);
    }
}
