package pe.edu.cibertec.t1feign07.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feign07.restclient.placeholder.model.ProductStoreDto;
import pe.edu.cibertec.t1feign07.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/electronics-gt50")
    public List<ProductStoreDto> obtenerProductosElectronicsPrecioMayor50() {
        return productService.obtenerProductosElectronicsPrecioMayor50();
    }
}
