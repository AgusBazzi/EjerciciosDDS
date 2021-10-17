package g5.relacionamientoPersonas.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsrEstandarRDTO {
    Long id;

    String usuario;
    String password;

    String dni;
    String nombre;
    String apellido;
    Date fechaDeNacimiento;
    String ciudad;
    String localidadResidencia;
    String foto;
}
