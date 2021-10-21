package g5.relacionamientoPersonas.Controllers.dtos;

import g5.relacionamientoPersonas.Seguridad.Estandar;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class EstandarDTO {

	public String dni;
	public String nombre;
	public String apellido;
	public String ciudad;
	public String localidadResidencia;
	public Date fechaDeNacimiento;

	public EstandarDTO(Estandar usuarioEstandar) {
		this.dni = usuarioEstandar.getDni();
		this.nombre = usuarioEstandar.getNombre();
		this.apellido = usuarioEstandar.getApellido();
		this.ciudad = usuarioEstandar.getCiudad();
		this.localidadResidencia = usuarioEstandar.getLocalidadResidencia();
		this.fechaDeNacimiento = usuarioEstandar.getFechaDeNacimiento();
	}
}
