package com.aluracursos.reproductordemusica.modelos;


public class MisFavoritos{
    void adicional(Audio audio){
        if (audio.getClasificacion()>=7){
            System.out.println(audio.getTitulo()+"Los mas Populares");
        }else {
            System.out.println(audio.getTitulo()+"No te olvides de escuchar los titulos consentidos ");
        }
    }
}
