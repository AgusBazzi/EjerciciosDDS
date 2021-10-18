package g5.relacionamientoPersonas.Controllers;

import g5.relacionamientoPersonas.Business.Delegacion;
import g5.relacionamientoPersonas.Seguridad.Estandar;
import g5.relacionamientoPersonas.Servicios.UsuarioService;
import g5.relacionamientoPersonas.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;
import java.util.Set;

@Controller
@RequestMapping(value="/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioService usrSvc;

    @PostMapping(value="/signupadmin")
    public ResponseEntity<UsrAdministradorRDTO> signupUsrAdministrador(
            @RequestBody @Valid UsrAdministradorCDTO body
    ) {
        return null;
        //return ResponseEntity.status(HttpStatus.CREATED).body(usrSvc.create(body));
    }

    @PostMapping(value="/signupest")
    public ResponseEntity<UsrAdministradorRDTO> signupUsrEstandar(
            @RequestBody @Valid UsrEstandarCDTO body
    ) {
        return null;
        //return ResponseEntity.status(HttpStatus.CREATED).body(usrSvc.create(body));
    }

    @PostMapping(value = "/signin")
    public ResponseEntity<UsrRDTO> signinUser(
            @RequestBody @Valid UserSignIn body
    ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(usrSvc.signin(body));
    }

    @GetMapping(value = "/my/delegaciones")
    public ResponseEntity<Set<Delegacion>> mostrarDelegaciones(
            @RequestBody @Valid UsrRDTO body
    ){
        return ResponseEntity.ok(
                usrSvc body.getUsuario()
                );
    }
}
