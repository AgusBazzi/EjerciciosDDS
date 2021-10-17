package g5.relacionamientoPersonas.utils;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsrAdministradorRDTO {
    Long id;

    String usuario;
    String password;
}
