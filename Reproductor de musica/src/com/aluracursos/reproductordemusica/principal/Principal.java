package com.aluracursos.reproductordemusica.principal;
import com.aluracursos.reproductordemusica.modelos.Audio;
import com.aluracursos.reproductordemusica.modelos.Cancion;
import com.aluracursos.reproductordemusica.modelos.MisFavoritos;
import com.aluracursos.reproductordemusica.modelos.Podcast;

public class Principal extends Audio {
    public static void main(String[]args){
        Cancion miCancion=new Cancion();
        miCancion.setTitulo("Vodoo Love");
        miCancion.setCantante("Ermal Meta");
        miCancion.setGenero("Indie-Pop");
        miCancion.getAlbum ("Vietato Morire");

        Podcast miPodcast=new Podcast();
        miPodcast.setPresentador("Barbara y Vero");
        miPodcast.setTitulo("Damitas en Histeria");

        for (int i=0; i<100; i++){
            miCancion.meGusta();
        }
        for (int i = 0; i <300 ; i++) {
            miCancion.reproducciones();
        }

        for (int i=0; i<100; i++){
            miPodcast.meGusta();
        }
        for (int i = 0; i <300 ; i++) {
            miPodcast.reproducciones();
        }
        System.out.println("Reproducciones:"+ miCancion.getTotalDeReproducciones());
        System.out.println("Me gusta:"+ miCancion.getTotalDeMeGusta());

        MisFavoritos favoritos= new MisFavoritos();
        favoritos.adicional(miPodcast);
        favoritos.adicional(miCancion);

    }
}
