package pe.edu.I202210236.cl1_jpa_data_rosas_baldeon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.I202210236.cl1_jpa_data_rosas_baldeon.entity.Country;
import pe.edu.I202210236.cl1_jpa_data_rosas_baldeon.repository.CountryRepository;

import java.util.List;
import java.util.Optional;


@SpringBootApplication
public class Cl1JpaDataRosasBaldeonApplication implements CommandLineRunner {

	@Autowired
	private CountryRepository countryRepository; // Inyección del repositorio


	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataRosasBaldeonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Consultando los lenguajes antes de borrar:");
		obtenerLenguajes();


		countryRepository.deleteAllById(List.of("COL", "ARG"));
		System.out.println("Eliminando COL y ARG...");
		System.out.println("=");


		System.out.println("Consultando los lenguajes después de la borrar:");
		obtenerLenguajes();
	}
	private void obtenerLenguajes() {

		Optional<Country> countryArg = countryRepository.findById("ARG");

		countryArg.ifPresentOrElse(
				country -> {
					System.out.println("Lenguajes de Argentina:");
					country.getLanguages().forEach(lang -> System.out.println(lang.getId().getLanguage()));
				},
				() -> {

					Optional<Country> countryPeru = countryRepository.findById("PER");
					countryPeru.ifPresentOrElse(
							country -> {
								System.out.println("Lenguajes de Perú:");
								country.getLanguages().forEach(lang -> System.out.println(lang.getId().getLanguage()));
							},
							() -> System.out.println("Error: Datos no encontrados")
					);
				}
		);
		System.out.println("==================================");
	}


}

