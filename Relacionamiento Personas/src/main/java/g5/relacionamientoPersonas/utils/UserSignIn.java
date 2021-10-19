package g5.relacionamientoPersonas.utils;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class UserSignIn {

    @NotNull
    String usuario;
    @NotNull
    @Length(min = 4, max = 16)
    String password;
}
