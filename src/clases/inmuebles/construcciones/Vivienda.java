/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.inmuebles.construcciones;

import clases.TipoConstruccion;
import clases.inmuebles.Construccion;


public class Vivienda extends Construccion {

    private int precio;
    private int numHabitaciones;
    private int piso;

    protected Vivienda(String ubicacion, int metrosCuadrados, TipoConstruccion tipo, int precio, int numHabitaciones, int piso) {
        super(ubicacion, metrosCuadrados, tipo);
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.piso = piso;
    }

    //Metodos de Consulta
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
    
    //Implementacion del metodo muestra
    @Override
    public void muestra() {
        
    }
}
