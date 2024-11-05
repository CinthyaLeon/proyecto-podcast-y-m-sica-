package com.aluracursos.reproductordemusica.modelos;

public class Podcast extends Audio{
    private String presentador;
    private String descripcion;
    private String genero;

    @Override
    public int getClasificacion() {
        if (getTotalDeReproducciones()>=200){
            return 6;
        }else {
            return 3;
        }
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
