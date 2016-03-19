package TareaNetfixHerencia;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger log = Logger.getAnonymousLogger(); // Para informar  los Posibles errores en consola para los Programadores


		ArrayList<Pelicula> ListaPeliculas = new ArrayList<Pelicula>();
		ArrayList<Serie> ListaSeries = new ArrayList<Serie>();


		/*Crea dos arraysList de 5 elementos cada uno. Unos de Peliculas y otro de Series.
		 * */


		ListaPeliculas.add(new Pelicula("El Padrino", "Crimen Drama","Coppola",170,1972));
		ListaPeliculas.add(new Pelicula("La lista de Schindler", "Guerra Drama","Steven Spielberg",185,1994));
		ListaPeliculas.add(new Pelicula("Forrest Gump", "Comedia Drama","Robert Zemeckis",140,1993));
		ListaPeliculas.add(new Pelicula("La vida es Bella", "Comedia Drama","Roberto Benigni",115,1999));
		ListaPeliculas.add(new Pelicula("Big Hero 6","Aventura Animación","Don Hall",102,2014));

		ListaSeries.add(new Serie("Juego de Tronos", "Drama Fantasía", "	Weiss",52, 6));
		ListaSeries.add(new Serie("Breaking Bad", "Drama", "Guilligan",42, 5));
		ListaSeries.add(new Serie("The Walking dead", "Drama terror", "	Robert Kirkman",42, 6));
		ListaSeries.add(new Serie("Friends", "Comedia", "	Marta Kauffman",22, 10));
		ListaSeries.add(new Serie("The Simpsons ", "Comedia", "	Matt Groening",28, 27));





		try {

			(ListaPeliculas.get(00)).marcarVisto();
			(ListaPeliculas.get(01)).marcarVisto(); 
			(ListaPeliculas.get(04)).marcarVisto();


			(ListaSeries.get(01)).marcarVisto();
			(ListaSeries.get(02)).marcarVisto();

			/*
			 * Muestra una lista de las Películas y Series que se visualizaron
			 *  y un detalle de los minutos/segundos visualizados.
			 * */

			System.out.println("Listado de Peliculas Vistas y tiempo visto");
			System.out.println("------------------------------------------");


			//Aplico ForEach por que uso ARRAYLIST y como ven es mucho mas facil usar


			for (Pelicula pelicula : ListaPeliculas) {
				if(pelicula.esVisto())
					System.out.println(pelicula.getTitulo()+" cantidad de tiempo visto: " + pelicula.tiempoVisto() +" minutos "+ " y dura: " + pelicula.getDuracion() +"minutos");
			}


			System.out.println("");
			System.out.println("Listado de Series Vistas y tiempo visto");
			System.out.println("------------------------------------------");

			for (Serie serie : ListaSeries) {
				if(serie.esVisto())
					System.out.println(serie.getTitulo()+" cantidad de tiempo visto: " + serie.tiempoVisto() +" minutos "+ " y dura: " + serie.getDuracion() +" minutos");

			}




			/*Por último, indica la serie con más temporadas y la película del año más reciente. 
			 * Muéstralos en pantalla con toda su información (usa el método toString()).
			 * */


			if(!ListaSeries.isEmpty()) // Por las dudas si la Lista no contiene elementos, estoy usando el operador negado "!" es lo mismo que ListaSeries.size()>0
			{
				Serie serieMaxTemporada =  ListaSeries.get(0); //selecciono el primer objeto de la lista para comparar

				for(Serie serie: ListaSeries)
				{
					if(serie.getNroTempordas() >= serieMaxTemporada.getNroTempordas())
					{

						serieMaxTemporada = serie;

					}
				}

				System.out.println(" ");
				System.out.println("La serie con "+ serieMaxTemporada.getNroTempordas() + "  (mayor cantidad de Temporadas) Temporadas es: ");
				System.out.println(serieMaxTemporada.toString());

			}

			
			
			if(!ListaPeliculas.isEmpty()) // Por las dudas si la Lista no contiene elementos, estoy usando el operador negado "!" es lo mismo que ListaPeliculas.size()>0
			{

				Pelicula peliculaMasReciente  =  ListaPeliculas.get(0); //selecciono el primer objeto de la lista para comparar


				for(Pelicula pelicula: ListaPeliculas) {
					if(pelicula.getAnio() >= peliculaMasReciente.getAnio())
					{
						peliculaMasReciente = pelicula;

					}
				}



				System.out.println(" ");
				System.out.println("La pelicula más reciente es del año: "+ peliculaMasReciente.getAnio());
				System.out.println(peliculaMasReciente.toString());
			}




		}  catch(java.lang.IndexOutOfBoundsException exception)
		{

			log.info(" Error de índice en un arrayList");
		} catch (Exception e) {
			// TODO: handle exception
			log.info(" Ocurrio un Error  inesperado del tipo:"+ e);
		}finally {

			log.info("Mensaje para el Programador: Todo salio bien :)!");


		}


	}



}
