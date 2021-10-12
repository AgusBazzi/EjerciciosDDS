package g5.relacionamientoPersonas.Repositorio;

import g5.relacionamientoPersonas.Business.Delegacion;
import g5.relacionamientoPersonas.Seguridad.Estandar;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EstandarRepo extends CrudRepository<Estandar, Long> {

	Optional<Estandar> findById(Long id);

}
