package g5.relacionamientoPersonas.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsrRDTO {

    Long id;

    String usuario;
    String password;
}
