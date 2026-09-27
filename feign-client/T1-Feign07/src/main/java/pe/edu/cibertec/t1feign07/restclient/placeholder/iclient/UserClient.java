package pe.edu.cibertec.t1feign07.restclient.placeholder.iclient;

import org.apache.catalina.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import pe.edu.cibertec.t1feign07.restclient.config.FeignConfig;
import pe.edu.cibertec.t1feign07.restclient.placeholder.model.UserPlaceHolder;

import java.util.List;

@FeignClient(name = "userClient",
             url = "https://jsonplaceholder.typicode.com",
             configuration = FeignConfig.class)
public interface UserClient {
    @GetMapping("/users")
    List<UserPlaceHolder> getUsers();

}
