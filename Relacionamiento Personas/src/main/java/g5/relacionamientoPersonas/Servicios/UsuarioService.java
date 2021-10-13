package g5.relacionamientoPersonas.Servicios;

import g5.relacionamientoPersonas.Repositorio.EstandarRepo;
import g5.relacionamientoPersonas.Repositorio.UsuarioRepo;
import g5.relacionamientoPersonas.Seguridad.Estandar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepo usuarioRepo;

    public long iniciar(String nombre, String password){

        return usuarioRepo.iniciar(nombre,password);
    }


}
