package g5.relacionamientoPersonas.Servicios;

import g5.relacionamientoPersonas.Repositorio.EstandarRepo;
import g5.relacionamientoPersonas.Seguridad.Estandar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstandarService {

	@Autowired
	private EstandarRepo estandarRepo;

	public Optional<Estandar> findById(Long id) {
		return estandarRepo.findById(id);
	}

	public Iterable<Estandar> findAll() {
		return estandarRepo.findAll();
	}

}
