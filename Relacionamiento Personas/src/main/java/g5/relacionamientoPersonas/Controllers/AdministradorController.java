package g5.relacionamientoPersonas.Controllers;

import g5.relacionamientoPersonas.Business.Delegacion;
import g5.relacionamientoPersonas.Seguridad.Estandar;
import g5.relacionamientoPersonas.Servicios.DelegacionService;
import g5.relacionamientoPersonas.Servicios.EstandarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdministradorController {

	@Autowired
	private EstandarService estandarService;

	@Autowired
	private DelegacionService delegacionService;

	@ResponseBody
	@RequestMapping("/reporte/usuarios")
	public Iterable<Estandar> getUsuarios(){
		return estandarService.findAll();
	}

	@ResponseBody
	@RequestMapping("/reporte/delegaciones")
	public Iterable<Delegacion> getDelegaciones(){
		return delegacionService.findAll();
	}


}
