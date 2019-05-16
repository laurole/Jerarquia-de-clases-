/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.inmuebles;

import clases.Inmueble;
import clases.TipoConstruccion;


public abstract class Construccion extends Inmueble {
    protected TipoConstruccion tipo;
    protected Construccion(String ubicacion, int metrosCuadrados, TipoConstruccion tipo) {
        super(ubicacion, metrosCuadrados);
        this.tipo = tipo;
    }

    public TipoConstruccion getTipo() {
        return tipo;
    }

    public void setTipo(TipoConstruccion tipo) {
        this.tipo = tipo;
    }
    
    //Implementacion del metodo muestra
    @Override
    public void muestra() {
        
    }
}
