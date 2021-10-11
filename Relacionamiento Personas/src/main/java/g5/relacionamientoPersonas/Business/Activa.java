package g5.relacionamientoPersonas.Business;

public class Activa extends Estado{

	@Override
	public void revocar() {
		delegacion.cambiarEstado(new Inactiva());
	}

}
