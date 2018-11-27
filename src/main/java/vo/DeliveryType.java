package vo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class DeliveryType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String type;
}
