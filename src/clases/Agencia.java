/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


public interface Agencia {
    void añadeVentaInmueble(Inmueble inmueble);
    void añadeAlquilerInmueble(Inmueble inmueble);
    void inmueblesVenta(int precio);
    void localesSegundaMano(int metros);
    void solaresRusticos();
}
