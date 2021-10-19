package g5.relacionamientoPersonas.Seguridad;

import g5.relacionamientoPersonas.utils.UsrRDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String usuario;
	private String password;

	public Usuario(String usuario, String password) {
		this.id = null;
		this.usuario = usuario;
		this.password = password;
	}
	public void iniciarSesion(){}

	public void cerrarSesion(){}


	public UsrRDTO toRDTO(){
		return new UsrRDTO(this.id, this.usuario, this.password);
	}
}
