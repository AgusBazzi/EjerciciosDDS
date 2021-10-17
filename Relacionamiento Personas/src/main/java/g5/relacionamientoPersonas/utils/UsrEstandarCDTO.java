package g5.relacionamientoPersonas.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsrEstandarCDTO {
    @NotNull
    String usuario;

    @NotNull
    @Length(min = 4, max = 16)
    String password;

    String dni;
    String nombre;
    String apellido;
    Date fechaDeNacimiento;
    String ciudad;
    String localidadResidencia;
    String foto;
}
