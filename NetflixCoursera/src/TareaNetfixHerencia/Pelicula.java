package TareaNetfixHerencia;

public class Pelicula extends VideoFilm implements Visualizable{

	
	
	private int anio;	// año de la Pelicula
	static final int ANIO_DEFAULT = 1895; //año de la primer pelicula
	
	
	public Pelicula() {
		super();
		
		this.anio = ANIO_DEFAULT;
		
		
		// TODO Auto-generated constructor stub
	}
	public Pelicula(String titulo, String creador) {
		super(titulo, creador);
		this.anio = ANIO_DEFAULT;
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Pelicula(String titulo, String genero, String creador, int duracion, int anio) {
		super(titulo, genero, creador, duracion);
		// TODO Auto-generated constructor stub
		if(anio >= ANIO_DEFAULT){ // para que no me ingresen un año menor a la primer film
			this.anio = anio;
		}
		else{
			this.anio = ANIO_DEFAULT;
		}
		
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		if(anio >= ANIO_DEFAULT){ // para que no me ingresen un año m
			this.anio = anio;
		}
		else{
			this.anio = ANIO_DEFAULT;
		}
	}
	
	public String toString ()
	{	
        String mensaje="La Pelicula tiene por titulo: ->"+super.getTitulo()+"<- siendo su creador/es "+super.getCreador()+" con una duración de:  "+super.getDuracion()+" minuto y fue estrenada en el año: " + anio;
        return mensaje;
    }
	@Override
	public void marcarVisto() {
		// TODO Auto-generated method stub
		this.visto = this.SI;
		this.cantidadTiempoVisto = (int) (Math.random() * super.getDuracion()); // Si lo vio se marca un tiempo que lo vio aleatorio
		
	}

	@Override
	public int tiempoVisto() {
		// TODO Auto-generated method stub
		return this.cantidadTiempoVisto;
	}
	@Override
	public boolean esVisto() {
		// TODO Auto-generated method stub
		return this.visto;
	}
	

	
}
