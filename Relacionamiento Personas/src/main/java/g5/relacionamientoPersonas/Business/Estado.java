package g5.relacionamientoPersonas.Business;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Estado {

	protected Delegacion delegacion;

	public void aceptar(){}
	public void revocar(){}


}
