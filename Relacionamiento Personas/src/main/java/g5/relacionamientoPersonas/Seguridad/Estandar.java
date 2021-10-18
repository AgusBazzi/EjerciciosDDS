package g5.relacionamientoPersonas.Seguridad;

import g5.relacionamientoPersonas.Business.Delegacion;
import g5.relacionamientoPersonas.Business.EnEspera;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;

@Getter
@Setter

@Entity
@Table(name = "estandar")
@NoArgsConstructor
public class Estandar extends Usuario{

	private String dni;
	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	private String ciudad;
	private String localidadResidencia;
	private String foto;

	@OneToMany(mappedBy = "usuarioQueDelega")
	@Transient
	private Set<Delegacion> delegaciones;


	public Estandar(String usuario, String password, String dni, String nombre, String apellido, Date fechaDeNacimiento, String ciudad, String localidadResidencia, String foto) {
		super(usuario, password);
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.ciudad = ciudad;
		this.localidadResidencia = localidadResidencia;
		this.foto = foto;
		this.delegaciones = Collections.emptySet();
	}

	public void autorizarA(Estandar usuarioEstandar) {
		Delegacion nuevaDelegacion = new Delegacion(null, this, usuarioEstandar, new EnEspera(), "EnEspera");
		delegaciones.add(nuevaDelegacion);
		usuarioEstandar.agregarDelegacion(nuevaDelegacion);
	}

	public void aceptarAutorizacion(Delegacion unaDelegacion) {
		if(delegaciones.contains(unaDelegacion) && unaDelegacion.getUsuarioDelegado().equals(this)){
			unaDelegacion.getEstado().aceptar();
		}
	}

	public void agregarDelegacion(Delegacion nuevaDelegacion) {
		delegaciones.add(nuevaDelegacion);
	}

	// Este es si me llega una autorizacion y no la quiero aceptar
	public void revocarAutorizacion(Delegacion unaDelegacion) {
		if(delegaciones.contains(unaDelegacion) && unaDelegacion.getUsuarioDelegado().equals(this)){
			unaDelegacion.getEstado().revocar();
		}
	}

	// Esto es si ya tengo una autorizacion y la quiero dar de baja
	public void darDeBajaAutorizacion(Delegacion unaDelegacion) {
		if(delegaciones.contains(unaDelegacion) && unaDelegacion.getUsuarioQueDelega().equals(this)){
			unaDelegacion.getEstado().revocar();
		}
	}

	public void actualizarDatosPersonales(Date fechaDeNacimiento, String ciudad, String localidadResidencia, String foto) {
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.ciudad = ciudad;
		this.localidadResidencia = localidadResidencia;
		this.foto = foto;
	}

}
