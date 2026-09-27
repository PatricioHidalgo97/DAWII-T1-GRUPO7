package pe.edu.cibertec.t1feign07.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feign07.restclient.placeholder.iclient.CharacterClient;
import pe.edu.cibertec.t1feign07.restclient.placeholder.model.CharacterRM;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private final CharacterClient characterClient;

    public List<CharacterRM> obtenerPersonajesAliveHuman() {
        CharacterRM.RMResponse response = characterClient.getCharactersPage1();
        List<CharacterRM> personajesFiltrados = new ArrayList<>();

        if (response != null && response.getResults() != null) {
            for (CharacterRM character : response.getResults()) {
                if ("Alive".equalsIgnoreCase(character.getStatus()) &&
                        "Human".equalsIgnoreCase(character.getSpecies())) {
                    personajesFiltrados.add(character);
                }
            }
        }
        return personajesFiltrados;
    }
}
