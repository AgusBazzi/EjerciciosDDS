package g5.relacionamientoPersonas.Repositorio;

import g5.relacionamientoPersonas.Seguridad.Estandar;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Optional;

@Repository
public interface EstandarRepo extends CrudRepository<Estandar, Long> {

	Optional<Estandar> findById(Long id);

}
