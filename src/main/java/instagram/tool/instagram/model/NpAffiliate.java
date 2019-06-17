package instagram.tool.instagram.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;
@Data
@Entity
@NoArgsConstructor
public class NpAffiliate {
    private Long id;
    private User user_id;
    private User userRefeens;
    private Date date;

}
