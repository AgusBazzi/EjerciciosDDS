package g5.relacionamientoPersonas.Servicios;

import g5.relacionamientoPersonas.Repositorio.EstandarRepo;
import g5.relacionamientoPersonas.Repositorio.UsuarioRepo;
import g5.relacionamientoPersonas.Seguridad.Administrador;
import g5.relacionamientoPersonas.Seguridad.Estandar;
import g5.relacionamientoPersonas.utils.UserSignIn;
import g5.relacionamientoPersonas.utils.UsrRDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepo usuarioRepo;

    public long iniciar(String nombre, String password){

        return usuarioRepo.iniciar(nombre,password);
    }

    //Deberia poder hacerse el signin unico para ambos usuarios
    public UsrRDTO signin(UserSignIn body) {

        UsrRDTO u = null;
        try{
            u = usuarioRepo.findByUsuario(body.getUsuario())
                    .orElseThrow(() -> new Exception());
        }catch(Exception e){
            System.out.println("User does not exist");
        }

        if (body.getPassword().equals(u.getPassword())) {
            System.out.println("Wrong password");
        }

        return u;
        //return save(u);
    }

    public UsrRDTO toRDTO(){
        return usuarioRepo.findByUsuario()
    }

}
