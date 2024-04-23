import com.aluracursos.escreenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.escreenmatch.calculos.FiltroRecomendaciones;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Lo imposible");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua( 9.5);
        miPelicula.evalua( 9.0);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie laPiloto = new Serie();
        laPiloto.setNombre("La piloto");
        laPiloto.setFechaDeLanzamiento(2024);
        laPiloto.setTemporadas(1);
        laPiloto.setMinutosPorEpisodios(45);
        laPiloto.setEpisodiosPorTemporadas(89);
        laPiloto.muestraFichaTecnica();
        System.out.println(laPiloto.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Las crónicas de Narnia");
        otraPelicula.setFechaDeLanzamiento(2022);
        otraPelicula.setDuracionEnMinutos(60);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(laPiloto);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus peliculas favoritas es de: " + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
        filtroRecomendaciones.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Historia");
        episodio.setSerie(laPiloto);
        episodio.setTotalVisualizaciones(100);

        filtroRecomendaciones.filtra(episodio);

    }
}
