/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public abstract class Inmueble {

    protected String ubicacion;
    protected int metrosCuadrados;

    protected Inmueble(String ubicacion, int metrosCuadrados) {
        this.ubicacion = ubicacion;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    
    //Implementacion del metodo muestra
    public void muestra() {
        
    }

}
