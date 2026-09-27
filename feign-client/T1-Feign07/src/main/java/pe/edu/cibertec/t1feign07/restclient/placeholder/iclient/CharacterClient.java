package pe.edu.cibertec.t1feign07.restclient.placeholder.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feign07.restclient.config.FeignConfig;
import pe.edu.cibertec.t1feign07.restclient.placeholder.model.CharacterRM;

@FeignClient(
        name = "characterClient",
        url = "https://rickandmortyapi.com/api",
        configuration = FeignConfig.class
)
public interface CharacterClient {

    @GetMapping("/character")
    CharacterRM.RMResponse getCharactersPage1();
}
