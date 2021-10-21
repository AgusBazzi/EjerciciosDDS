package g5.relacionamientoPersonas.Controllers;

import g5.relacionamientoPersonas.Business.Delegacion;
import g5.relacionamientoPersonas.Controllers.dtos.DelegacionDTO;
import g5.relacionamientoPersonas.Controllers.dtos.EstandarDTO;
import g5.relacionamientoPersonas.Seguridad.Estandar;
import g5.relacionamientoPersonas.Servicios.DelegacionService;
import g5.relacionamientoPersonas.Servicios.EstandarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;


@Controller
@CrossOrigin
public class AdministradorController {

	@Autowired
	private EstandarService estandarService;

	@Autowired
	private DelegacionService delegacionService;

	@GetMapping("/reporte/usuarios")
	public ResponseEntity<ArrayList<EstandarDTO>> getUsuariosEstandar(){
		Iterable<Estandar> usuariosEstandar = estandarService.findAll();
		ArrayList<EstandarDTO> usuariosEstandarFinales = new ArrayList<>();
		for (Estandar usuarioEstandar : usuariosEstandar) {
			EstandarDTO estandarDTO = new EstandarDTO(usuarioEstandar);
			usuariosEstandarFinales.add(estandarDTO);
		}
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(usuariosEstandarFinales);
	}

	@GetMapping("/reporte/delegaciones")
	public ResponseEntity<ArrayList<DelegacionDTO>> getDelegaciones(){
		Iterable<Delegacion> delegaciones = delegacionService.findAll();
		ArrayList<DelegacionDTO> delegacionesFinales = new ArrayList<>();
		for (Delegacion delegacion : delegaciones) {
			DelegacionDTO delegacionDTO = new DelegacionDTO(delegacion);
			delegacionesFinales.add(delegacionDTO);
		}
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(delegacionesFinales);
	}


}
