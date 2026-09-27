package pe.edu.cibertec.t1feign07.restclient.placeholder.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feign07.restclient.config.FeignConfig;
import pe.edu.cibertec.t1feign07.restclient.placeholder.model.ProductStoreDto;

import java.util.List;

@FeignClient(
        name = "productClient",
        url = "https://fakestoreapi.com",
        configuration = FeignConfig.class
)
public interface ProductClient {

    @GetMapping("/products")
    List<ProductStoreDto> getProducts();
}
