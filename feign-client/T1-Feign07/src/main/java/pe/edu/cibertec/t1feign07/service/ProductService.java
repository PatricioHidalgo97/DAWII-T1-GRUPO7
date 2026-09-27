package pe.edu.cibertec.t1feign07.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feign07.restclient.placeholder.iclient.ProductClient;
import pe.edu.cibertec.t1feign07.restclient.placeholder.model.ProductStoreDto;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductClient productClient;

    public List<ProductStoreDto> obtenerProductosElectronicsPrecioMayor50() {
        List<ProductStoreDto> productosList = productClient.getProducts();
        List<ProductStoreDto> productosFiltrados = new ArrayList<>();

        for (ProductStoreDto product : productosList) {
            if (product.getPrice() != null && product.getCategory() != null) {
                if (product.getPrice() > 50.0 && "electronics".equalsIgnoreCase(product.getCategory())) {
                    productosFiltrados.add(product);
                }
            }
        }
        return productosFiltrados;
    }
}
