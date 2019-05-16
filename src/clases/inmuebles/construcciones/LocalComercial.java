/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.inmuebles.construcciones;

import clases.TipoConstruccion;
import clases.inmuebles.Construccion;

public class LocalComercial extends Construccion {

    public LocalComercial(String ubicacion, int metrosCuadrados, TipoConstruccion tipo) {
        super(ubicacion, metrosCuadrados, tipo);
    }

    //Propiedad calculada
    public int precio() {
        return (1000 * this.metrosCuadrados);
    }
    
    //Implementacion del metodo muestra
    @Override
    public void muestra() {
        
    }
}
