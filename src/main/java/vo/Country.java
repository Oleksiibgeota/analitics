package vo;

import lombok.Data;

import javax.persistence.*;

@Data
@Table
@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @Column
    private String name;
}
