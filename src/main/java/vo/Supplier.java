package vo;

import lombok.Data;

@Data
public class Supplier {
    private Long id;
    private Long code;
    private Long deliveryTypeId;
    private Long countryId;
}
