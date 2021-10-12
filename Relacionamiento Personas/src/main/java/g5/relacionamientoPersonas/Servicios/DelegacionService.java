package g5.relacionamientoPersonas.Servicios;

import g5.relacionamientoPersonas.Business.Delegacion;
import g5.relacionamientoPersonas.Repositorio.DelegacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DelegacionService {

	@Autowired
	private DelegacionRepo delegacionRepo;

	public Optional<Delegacion> findDelegacionById(Long id) {
		return delegacionRepo.findDelegaciones(id);
	}

}
