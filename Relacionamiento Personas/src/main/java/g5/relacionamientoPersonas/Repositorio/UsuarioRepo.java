package g5.relacionamientoPersonas.Repositorio;


import g5.relacionamientoPersonas.Seguridad.Usuario;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UsuarioRepo extends CrudRepository<Usuario,Long> {


    @Query(value="SELECT count(*) FROM USUARIO U WHERE U.usuario = ?1 and U.password = ?2", nativeQuery = true)
    long iniciar(String usuario, String password);


}