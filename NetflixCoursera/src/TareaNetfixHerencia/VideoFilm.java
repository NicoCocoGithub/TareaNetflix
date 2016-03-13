package TareaNetfixHerencia;
import java.util.Random;

public class VideoFilm {
	
	
	private String titulo;
	private String genero;
	private String creador;
	private int duracion; //minutos
	protected boolean visto;
	protected int cantidadTiempoVisto; // lo agregue por que no entendi si era duracion  == tiempoVisto ?
	
	static final boolean NO = false;//
	static final boolean SI = true;//
	static final int DURACION_DEFAULT = 51;//minutos

	
	
	
	public VideoFilm(){
		this.titulo = " La llegada del tren";
		this.genero = "genero_pelicula";
		this.creador = "hermanos Lumiére";
		this.duracion = 51;
		this.visto = NO;
	}
	
	public VideoFilm(String titulo, String creador ){
		this.titulo = titulo;
		this.creador = creador;
		this.genero = "genero_pelicula";
		this.duracion = DURACION_DEFAULT;
		this.visto = NO;
	}
	
	public VideoFilm(String titulo, String genero, String creador, int duracion) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
		this.visto = NO;
	}

	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getTiempoVisto() {
		return cantidadTiempoVisto;
	}

	public void setTiempoVisto(int tiempoVisto) {
		this.cantidadTiempoVisto = tiempoVisto;
	}
	
	
	

}
