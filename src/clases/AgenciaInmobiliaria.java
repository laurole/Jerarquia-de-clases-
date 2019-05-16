/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clases.inmuebles.Construccion;
import clases.inmuebles.Superficie;
import clases.inmuebles.construcciones.Vivienda;
import clases.inmuebles.superficies.Solar;
import java.util.ArrayList;
import java.util.LinkedList;


public class AgenciaInmobiliaria implements Agencia {

    private ArrayList<Inmueble> listaVentas;
    private ArrayList<Inmueble> listaAlquileres;

    @Override
    public void añadeVentaInmueble(Inmueble inmueble) {
        if (!listaVentas.contains(inmueble)) {
            listaVentas.add(inmueble);
        }
    }

    @Override
    public void añadeAlquilerInmueble(Inmueble inmueble) {
        if (!listaAlquileres.contains(inmueble)) {
            listaAlquileres.add(inmueble);
        }
    }

    @Override
    public void inmueblesVenta(int precio) {
        LinkedList<Inmueble> lista = new LinkedList<>();
        for (int i = 0; i < listaVentas.size(); i++) {
            Inmueble inmueble = listaVentas.get(i);
            if (inmueble instanceof Superficie) {
                if (inmueble instanceof Solar) {
                    if (((Solar) inmueble).precio() < precio) {
                        lista.add(inmueble);
                    }
                }
            } else if (inmueble instanceof Construccion) {
                if (inmueble instanceof Vivienda) {
                    if (((Vivienda) inmueble).getPrecio() < precio) {
                        lista.add(inmueble);
                    }
                }
            }
        }

        //Mostrando la lista
        for (Inmueble inmueble : lista) {
            inmueble.muestra();
        }
    }

    @Override
    public void localesSegundaMano(int metros) {

    }

    @Override
    public void solaresRusticos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
