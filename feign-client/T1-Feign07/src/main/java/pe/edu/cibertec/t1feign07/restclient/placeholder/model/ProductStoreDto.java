package pe.edu.cibertec.t1feign07.restclient.placeholder.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductStoreDto {
    private Long id;
    private String title;
    private Double price;
    private String category;
}
