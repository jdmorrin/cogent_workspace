package april14.cogent.challenge.moviemanager;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieManagerAppApplication /*implements CommandLineRunner*/{

	// CRUD functionality has been implemented into this program
	// Security functionality has yet to be implemented
	// Was told to submit just with CRUD functionality
	// Will continue to implement security functionality and update later
	// I have removed spring security dependencies in the mean time
	// ----- Juan David Morrell Rincón
	
	// Funcionalidad CRUD ha sido implementada a este programa
	// Funcionalidad de seguridad aun no a sido implementada
	// Me ha dicho que sometiera solo con la funcionalidad CRUD
	// Seguiré implementando funcionalidad de seguridad. Actualizaré despues
	// He eliminado dependencias de seguridad mientras tanto
	// -- Juandi
	public static void main(String[] args) {
		SpringApplication.run(MovieManagerAppApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//	}

}
