package vo;

import lombok.Data;

import javax.persistence.*;

@Data
@Table
@Entity
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private boolean original;
}
