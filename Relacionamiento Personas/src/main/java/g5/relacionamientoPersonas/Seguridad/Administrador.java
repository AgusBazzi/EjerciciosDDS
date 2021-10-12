package g5.relacionamientoPersonas.Seguridad;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Administrador extends Usuario{

	public Administrador(String usuario, String password) {
		super(usuario, password);
	}

	public void verListadoPersonas() {} // no es void

	public void verListadoDelegaciones() {} // no es void
}
