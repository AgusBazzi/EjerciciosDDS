package g5.relacionamientoPersonas.Controllers;

import com.fasterxml.jackson.annotation.JsonCreator;
import g5.relacionamientoPersonas.Business.Delegacion;
import g5.relacionamientoPersonas.Servicios.DelegacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class DelegacionController {

	@Autowired
	private DelegacionService delegacionService;

	@ResponseBody
	@RequestMapping("/home/notificaciones/id")
	public Optional<Delegacion> getNotificaciones(@RequestParam Long id){
		return delegacionService.findDelegacionById(id);
	}

}
