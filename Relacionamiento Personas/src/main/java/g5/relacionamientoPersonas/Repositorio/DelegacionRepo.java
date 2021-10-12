package g5.relacionamientoPersonas.Repositorio;

import g5.relacionamientoPersonas.Business.Delegacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DelegacionRepo extends CrudRepository<Delegacion, Long> {

	Optional<Delegacion> findById(Long id);

	@Query(value="SELECT * FROM delegacion WHERE id_usuario_que_delega = ?1 OR id_usuario_delegado = ?1", nativeQuery = true)
	Optional<Delegacion> findDelegaciones(Long id);

}
