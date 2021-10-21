package g5.relacionamientoPersonas.Controllers;

import g5.relacionamientoPersonas.Servicios.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @Autowired
    UsuarioService userService;

    @RequestMapping("/")
    public String index(Model model) {
        return "Iniciar_Sesion";
    }

    @RequestMapping("validar")
    public String validar(@RequestParam(name = "usuario") String usuario,@RequestParam(name = "password") String password) {
        long n = userService.iniciar(usuario,password);
        if(n>=1){
            return "Home_Estandar";
        }else{

            return "Iniciar_Sesion";
        }
    }

    @RequestMapping("/Home_Estandar")
    public String home() {
        return "Home_Estandar";
    }

    @RequestMapping("/Realizar_Delegacion")
    public String realizarDelegacion() {
        return "Home_Estandar";
    }

    @RequestMapping("/Notificaciones")
    public String notificaciones() {
        return "Home_Estandar";
    }

    @RequestMapping("/Actualizar_Usuario")
    public String actualizarUsuario() {
        return "Home_Estandar";
    }

    @RequestMapping("/Reporte_Personas")
    public String reportePersonas() {
        return "Home_Estandar";
    }

    @RequestMapping("/Reporte_Delegaciones")
    public String reporteDelegaciones() {
        return "Home_Estandar";
    }

}
