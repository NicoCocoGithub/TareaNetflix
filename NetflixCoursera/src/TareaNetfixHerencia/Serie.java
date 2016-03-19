package TareaNetfixHerencia;

public class Serie extends VideoFilm implements Visualizable{

	
	private int nroTemporadas;
	static final int NROTEMPORADA_DEFAULT = 1; //año de la primer pelicula
	
	
	
	public Serie() {
		this.nroTemporadas = NROTEMPORADA_DEFAULT;
	}

	public Serie(String titulo, String creador) {
		super(titulo, creador);
		// TODO Auto-generated constructor stub
		this.nroTemporadas = NROTEMPORADA_DEFAULT;
	}
	
	
	
	public Serie(String titulo, String genero, String creador, int duracion, int nroTemporadas) {
		super(titulo, genero, creador, duracion);
		// TODO Auto-generated constructor stub
		this.nroTemporadas = nroTemporadas;
	}

	public int getNroTempordas() {
		return nroTemporadas;
	}

	public void setNroTempordas(int nroTempordas) {
		
		if(nroTempordas >= NROTEMPORADA_DEFAULT){
			this.nroTemporadas = nroTempordas;
		}else{
			this.nroTemporadas = NROTEMPORADA_DEFAULT;
		}
	}
	
	@Override
	public void marcarVisto() {
		// TODO Auto-generated method stub
		this.visto = VideoFilm.SI;
		this.cantidadTiempoVisto = (int) (Math.random() * (super.getDuracion())); // Si lo vio se marca un tiempo que lo vio

	}
	
	@Override
	public int tiempoVisto() {
		// TODO Auto-generated method stub
		return this.cantidadTiempoVisto;
	}
	
	public String toString ()
	{	
		 String mensaje="La Serie tiene por titulo:  ->"+super.getTitulo()+"<- con genero: "+super.getGenero()+" siendo su creador/es "+super.getCreador()+" cuenta con  "+ this.nroTemporadas + " Temporadas. Cada cápitulo dura "+super.getDuracion()+ " minutos ";
        return mensaje;
    }

	@Override
	public boolean esVisto() {
		// TODO Auto-generated method stub
		return this.visto;
	}
	
	
	
}
