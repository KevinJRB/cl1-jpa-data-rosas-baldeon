package pe.edu.I202210236.cl1_jpa_data_rosas_baldeon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.I202210236.cl1_jpa_data_rosas_baldeon.entity.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, String> {
    // Puedes añadir métodos personalizados si lo necesitas
}
