package pe.edu.cibertec.t1feign07.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feign07.restclient.placeholder.model.CharacterRM;
import pe.edu.cibertec.t1feign07.service.CharacterService;

import java.util.List;

@RestController
@RequestMapping("/characters")
@RequiredArgsConstructor
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping("/alive-human")
    public List<CharacterRM> obtenerPersonajesAliveHuman() {
        return characterService.obtenerPersonajesAliveHuman();
    }
}
