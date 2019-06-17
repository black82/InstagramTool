package instagram.tool.instagram.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
public class NpAffiliateData {
    private Long id;
    private String data;
    private String name;
}
