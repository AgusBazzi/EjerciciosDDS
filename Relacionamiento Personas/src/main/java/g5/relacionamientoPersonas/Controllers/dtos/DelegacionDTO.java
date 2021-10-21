package g5.relacionamientoPersonas.Controllers.dtos;

import g5.relacionamientoPersonas.Business.Delegacion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DelegacionDTO {

	public Long id;
	public String nombreUsuarioQueDelega;
	public String nombreUsuarioDelegado;
	public String estadoPersistencia;

	public DelegacionDTO(Delegacion delegacion){
		this.id = delegacion.getId();
		this.nombreUsuarioQueDelega = delegacion.getUsuarioQueDelega().getNombre().concat(" ").concat(delegacion.getUsuarioQueDelega().getApellido());
		this.nombreUsuarioDelegado = delegacion.getUsuarioDelegado().getNombre() + " " + delegacion.getUsuarioDelegado().getApellido();
		this.estadoPersistencia = delegacion.getEstadoPersistencia();
	}

}
