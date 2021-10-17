package g5.relacionamientoPersonas.Repositorio;


import g5.relacionamientoPersonas.Seguridad.Administrador;
import g5.relacionamientoPersonas.Seguridad.Usuario;
import g5.relacionamientoPersonas.utils.UsrRDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UsuarioRepo extends CrudRepository<Usuario,Long> {


    @Query(value="SELECT count(*) FROM USUARIO U WHERE U.usuario = ?1 and U.password = ?2", nativeQuery = true)
    long iniciar(String usuario, String password);

    //Deberia poder hacerse un usuario generico para el login o bien tener dos metodos distintos para cada uno y poder conocerlos al momento de hacer ese mismo signin
    Optional<UsrRDTO> findByUsuario(String usuario);

}