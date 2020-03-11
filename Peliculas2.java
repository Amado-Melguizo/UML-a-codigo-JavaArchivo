import java.net.URL;
import java.sql.Date;
import java.sql.Time;

public class Peliculas2 {
	
	public class Pelicula{
		
		//elementos dentro de la clase Pelicula
		private String titulo;
		private Date año;
		private String sinopsis;
		public Genero pelicula;
		private String pais;
	}	
	
	public class actor extends Persona{
		//clase actor
	}
	
	public class director extends Persona{
		//clase director
	}
	
	public class productor extends Persona{
		//clase productor
	}
	
	public class guionista extends Persona{
		//clase guionista
	}
	
	public class editor extends Persona{
		//clase editor
	}
	
	public class Persona{
		//elementos de la clase Persona
		private String nombre;
		private String apellidos;
		private Date fechaNacimineto;
		private String nacionalidad;
	}
	public enum Genero {
		//elementos de la enumeracion Genero
		drama,
		comedia,
		acción,
		terror,
		romance,
		aventura,
		sci_fi;
	}
	
	public class Trailer{
		//elementos dentro de la clase Trailer
		private URL url;
		private Time duración;
	}
}

