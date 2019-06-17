package instagram.tool.instagram.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;
@Data
@Entity
@NoArgsConstructor

public class NpAccounts {
    private Long id;
    private Date date;
    private String instagram_id;
    private Date last_login;
    private Integer login_required;
    private String password;
    private String proxy;
    private String username;
    private User user_id;
}
