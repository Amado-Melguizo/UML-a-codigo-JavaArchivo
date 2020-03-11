import java.sql.Date;

public class RugbySeisNaciones {
	
	public class Torneo{
		//elementos dentro de la clase Torneo
		private Date año;
		public void ganador() {
		}
		
		public void clasificacion() {			
		}
		
		//elementos externos
		public Jornada jornada;
	}	
	
	public class Jornada{
		//elementos dentro de la clase Jornada
		private Date fecha;
		//elementos externos
		public Partido partido;
	}
	
	public class Partido{
		//elementos dentro de la clase Partido
		private int puntosLocal;
		private int puntosVisitante;
		private int bonusLocal;
		private int bonusVisitante;
		
		public void resultado(){
		}
		
		//elementos externos
		public Equipo visitante;
		public Equipo local;
		public Arbitro arbitra;
	}
	
	public class Estadio{
		//elementos dentro de la clase Estadio
		private String nombre;
		private int capacidad;
		private String ciudad;
	}
	
	public class Equipo{
		//elementos dentro de la clase Equipo
		private Pais nombre;
		//elementos externos
		public Jugador jugadores;
		public Entrenador entrena;
	}
	
	public class Entrenador extends Persona{
		//clase Entrenador
	}
	
	public class Arbitro extends Persona{
		//clase Arbitro
	}
	
	public class Jugador extends Persona{
		//elementos dentro de la clase Jugador
		private Posicion posicion;
		
		//elementos externos
		public java.util.Collection capitán = new java.util.TreeSet();
	}
	
	public class Persona{
		//elementos dentro de la clase Persona
		private String nombre;
		private Date fechaNacimiento;
		
	}
	
	public enum Pais{
		//elementos de la enumeracion Pais
		Escocia,
		Francia,
		Gales,
		Inglaterra,
		Irlanda,
		Italia;
	}
	
	public enum Posicion{
		//elementos de la enumeracion Posicion
		Pilier,
		Talonador,
		Segunda_línea,
		Tercera_línea,
		Medio_melé,
		Apertura,
		Centro,
		Ala,
		Zaguero;
	}
}
