package g5.relacionamientoPersonas.Business;

public class EnEspera extends Estado{

	@Override
	public void aceptar() {
		delegacion.cambiarEstado(new Activa());
	}

	@Override
	public void revocar() {
		delegacion.cambiarEstado(new Inactiva());
	}

}
