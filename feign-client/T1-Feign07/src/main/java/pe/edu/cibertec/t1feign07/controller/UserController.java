package pe.edu.cibertec.t1feign07.controller;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feign07.service.UserService;
import pe.edu.cibertec.t1feign07.restclient.placeholder.model.UserPlaceHolder;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping("/filtrados")
    public List<UserPlaceHolder> obtenerUsuariosUserIdParEIdImpar() {
        return userService.obtenerUsuariosUserIdParEIdImpar();
    }



}

