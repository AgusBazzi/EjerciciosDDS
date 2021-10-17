package g5.relacionamientoPersonas.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsrAdministradorCDTO {
    @NotNull
    String usuario;

    @NotNull
    @Length(min = 4, max = 16)
    String password;
}
