package et.com.zablon.TMS.Models;

import et.com.zablon.TMS.Models.Enums.Status;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder

public class Contract extends Model {

    private Long tutorId;
    private Long studentId;
    private double amount;
    private Date startDate;
    private Date endDate;
    @Enumerated(EnumType.STRING)
    private Status contractStatus;

}
