package et.com.zablon.TMS.Models;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder

public class Contract extends Model {
    private Long tutorId;
    private Long studentId;
    private double amount;
    @Enumerated(EnumType.STRING)
    private ContractStatus contractStatus;

}
