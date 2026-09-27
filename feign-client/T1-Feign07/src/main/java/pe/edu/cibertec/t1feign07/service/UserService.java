package pe.edu.cibertec.t1feign07.service;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feign07.restclient.placeholder.iclient.UserClient;
import pe.edu.cibertec.t1feign07.restclient.placeholder.model.UserPlaceHolder;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserClient userClient;

    public List<UserPlaceHolder> obtenerUsuariosUserIdParEIdImpar() {
        List<UserPlaceHolder> usuariosList = userClient.getUsers();
        List<UserPlaceHolder> usuariosFiltrados = new ArrayList<>();

        for (UserPlaceHolder user : usuariosList) {
            if (user.getUserId() != null && user.getId() != null) {
                if (user.getUserId() % 2 == 0 && user.getId() % 2 != 0) {
                    usuariosFiltrados.add(user);
                }
            }
        }
        return usuariosFiltrados;
    }
}
