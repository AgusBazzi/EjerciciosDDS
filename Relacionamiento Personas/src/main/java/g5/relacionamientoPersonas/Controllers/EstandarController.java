package g5.relacionamientoPersonas.Controllers;

import g5.relacionamientoPersonas.Seguridad.Estandar;
import g5.relacionamientoPersonas.Servicios.EstandarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class EstandarController {

	@Autowired
	private EstandarService serviceEstandar;

	@ResponseBody
	@RequestMapping("/home/id")
	public Optional<Estandar> getDatosDeUsuario(@RequestParam Long id){

		return serviceEstandar.findById(id);
	}

}
