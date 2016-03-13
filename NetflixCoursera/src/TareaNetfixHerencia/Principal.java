package TareaNetfixHerencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
		/*Crea dos arrays de 5 elementos cada uno. Unos de Peliculas y otro de Series.
		 * */
		final int CANTIDAD_ITEMS = 5;
		Pelicula [] arrayPeliculas = new Pelicula[CANTIDAD_ITEMS];
		Serie [] arraySeries = new Serie[CANTIDAD_ITEMS];

		/*Crea un objeto en cada posición del array con los valores que desees. 
		 * Puedes usar distintos constructores.
		*/
		
		
		arrayPeliculas[00] = new Pelicula("El Padrino", "Crimen Drama","Coppola",170,1972);
		arrayPeliculas[01] = new Pelicula("La lista de Schindler", "Guerra Drama","Steven Spielberg",185,1994);
		arrayPeliculas[02] = new Pelicula("Forrest Gump", "Comedia Drama","Robert Zemeckis",140,1993);
		arrayPeliculas[03] = new Pelicula("La vida es Bella", "Comedia Drama","Roberto Benigni",115,1999);
		arrayPeliculas[04] = new Pelicula("Big Hero 6","Aventura Animación","Don Hall",102,2014);
		
		
		arraySeries[00] = new Serie("Juego de Tronos", "Drama Fantasía", "	Weiss",52, 6);
		arraySeries[01] = new Serie("Breaking Bad", "Drama", "Guilligan",42, 5);
		arraySeries[02] = new Serie("The Walking dead", "Drama terror", "	Robert Kirkman",42, 6);
		arraySeries[03] = new Serie("Friends", "Comedia", "	Marta Kauffman",22, 10);
		arraySeries[04] = new Serie("The Simpsons ", "Comedia", "	Matt Groening",28, 27);
		
		
		/*Marca en visto algunas Películas y Series con el método marcarVisto()
		 * */
		arrayPeliculas[00].marcarVisto();
		arrayPeliculas[03].marcarVisto();
		arrayPeliculas[04].marcarVisto();
		
		arraySeries[01].marcarVisto();
		arraySeries[02].marcarVisto();
		
		
		
		
		
		
		/*
		 * Muestra una lista de las Películas y Series que se visualizaron
		 *  y un detalle de los minutos/segundos visualizados.
		 * */
		
		System.out.println("Listado de Peliculas Vistas y tiempo visto");
		System.out.println("------------------------------------------");
		for(int indice = 0 ; indice < CANTIDAD_ITEMS ; indice++)
		{
			if(arrayPeliculas[indice].esVisto())
			{
				System.out.println(arrayPeliculas[indice].getTitulo()+" cantidad de tiempo visto: " + arrayPeliculas[indice].tiempoVisto() +" minutos "+ " y dura: " + arrayPeliculas[indice].getDuracion() +"minutos");
			} 
		}
		
		
		System.out.println("");
		System.out.println("Listado de Series Vistas y tiempo visto");
		System.out.println("------------------------------------------");
		for(int indice = 0 ; indice < CANTIDAD_ITEMS ; indice++)
		{
			if(arraySeries[indice].esVisto())
			{
				System.out.println(arraySeries[indice].getTitulo()+" cantidad de tiempo visto: " + arraySeries[indice].tiempoVisto() +" minutos "+ " y dura: " + arrayPeliculas[indice].getDuracion() +" minutos");
			} 
		}

		
		
		/*Por último, indica la serie con más temporadas y la película del año más reciente. 
		 * Muéstralos en pantalla con toda su información (usa el método toString()).
		 * */
		
	
		
		int maxTemporadas = arraySeries[00].getNroTempordas(); // Tomo el primero (00) del array por que inicio en 1 el indice dentro del for
		int maxTemporadasIndice = 00; // para saber donde esta la serie con mas Temporadas => el mas alto
		for(int indice = 1 ; indice < CANTIDAD_ITEMS ; indice++)
		{
			if(arraySeries[indice].getNroTempordas()>maxTemporadas) // comparo si el valor es mayor actualizo
			{
				maxTemporadas = arraySeries[indice].getNroTempordas();
				maxTemporadasIndice = indice;
			}
		}
		
		System.out.println(" ");
		System.out.println("La serie con "+ maxTemporadas + "  (mayor cantidad de Temporadas) Temporadas es: ");
		System.out.println(arraySeries[maxTemporadasIndice].toString());
		
		
		
		
		int maxAnio = arrayPeliculas[00].getAnio(); // Tomo el primero (00) del array por que inicio en 1 el indice dentro del for
		int maxAnioIndice = 00; // para saber donde esta el Año mas reciente = el mas alto
		for(int indice = 1 ; indice < CANTIDAD_ITEMS ; indice++)
		{
			if(arrayPeliculas[indice].getAnio()>maxAnio) // comparo si el valor es mayor actualizo
			{
				maxAnio = arrayPeliculas[indice].getAnio();
				maxAnioIndice = indice;
			}
		}
		System.out.println(" ");
		System.out.println("La pelicula más reciente es del año: "+ maxAnio);
		System.out.println(arrayPeliculas[maxAnioIndice].toString());
	}
	
	
	

}
