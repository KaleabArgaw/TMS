package et.com.zablon.TMS.Configs;

import et.com.zablon.TMS.Services.DaysOfWeekService;
import et.com.zablon.TMS.Services.GradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class InitConfig {

//    private final EducationLevelService educationLevelService;
    private final GradeService gradeService;
    private final DaysOfWeekService daysOfWeekService;

    @Bean
    public CommandLineRunner init() {
        return args -> {
//            educationLevelService.init();
            gradeService.init();
            daysOfWeekService.init();
        };
    }
}

