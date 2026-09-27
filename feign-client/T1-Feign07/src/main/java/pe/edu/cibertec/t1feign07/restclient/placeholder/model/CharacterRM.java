package pe.edu.cibertec.t1feign07.restclient.placeholder.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CharacterRM {
    private Integer id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private String image;

    @Getter
    @Setter
    public static class RMResponse {
        private List<CharacterRM> results;
    }
}
