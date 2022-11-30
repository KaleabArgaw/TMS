package et.com.zablon.TMS.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Address extends Model {
    private String city;
    private String subCity;
    private String zone;
    private String woreda;
    private String kebele;
    private String longitude;
    private String latitude;
}
