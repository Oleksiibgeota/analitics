package vo;

import lombok.Data;

import javax.persistence.*;

@Data
@Table
public class DetailBrand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "brandId")
    private Brand brand;
    @Column(name = "detailNumberId")
    private DetailNumber detailNumber;

}
