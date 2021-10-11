package g5.relacionamientoPersonas.Business;

import g5.relacionamientoPersonas.Seguridad.Estandar;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "delegacion")
public class Delegacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne()
	@JoinColumn(name = "id_usuario_que_delega")
	private Estandar usuarioQueDelega;

	@ManyToOne()
	@JoinColumn(name = "id_usuario_delegado")
	private Estandar usuarioDelegado;

	@Transient
	private Estado estado;

	@Column(name = "estado")
	private String estadoPersistencia;

	private void convertirEstado(){
		estadoPersistencia = estado.getClass().getSimpleName();
	}

	public void cambiarEstado(Estado nuevoEstado) {
		this.estado = nuevoEstado;
		this.convertirEstado();
	}
}
