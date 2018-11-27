package vo;

import lombok.Data;

import javax.persistence.*;

@Data
@Table
public class DetailBrandSuppliers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "detailBrandId")
    private DetailBrand detailBrand;
    @Column(name = "supplierId")
    private Supplier supplier;
}
