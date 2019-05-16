 
package clases.inmuebles;

import clases.Inmueble;

public abstract class Superficie extends Inmueble {

    protected Superficie(String ubicacion, int metrosCuadrados) {
        super(ubicacion, metrosCuadrados);
    }

    //Propiedad calculable
    public int precio() {
        return (1000 * this.metrosCuadrados); //Precio arbitrario
    }
    
    //Implementacion del metodo muestra
    @Override
    public void muestra() {
        
    }
}
