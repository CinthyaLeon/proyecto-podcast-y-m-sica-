package com.aluracursos.reproductordemusica.modelos;

public class Cancion extends Audio{
    private String album;
    private String cantante;
    private String genero;
    private String titulo;

    @Override
    public int getClasificacion() {
       if (getTotalDeMeGusta()>300){
           return 7;
       }else {
           return 3;
       }
    }

    public String getAlbum(String  vietatoMorire) {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}

