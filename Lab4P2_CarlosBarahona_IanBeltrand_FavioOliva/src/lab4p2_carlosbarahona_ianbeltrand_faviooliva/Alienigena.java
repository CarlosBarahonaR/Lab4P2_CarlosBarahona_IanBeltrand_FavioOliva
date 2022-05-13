/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_carlosbarahona_ianbeltrand_faviooliva;

/**
 *
 * @author Admin
 */
public class Alienigena extends Siniestro {

    public Alienigena(String nombre, int puntosAtaque, int puntosVida, String nombreUniverso) {
        super(nombre, puntosAtaque, puntosVida, nombreUniverso);
    }

    @Override
    public String toString() {
        return "Alienigena{" + "nombre=" + nombre + ", puntosAtaque=" + puntosAtaque + ", puntosVida=" + puntosVida + ", nombreUniverso=" + nombreUniverso + '}';
    }

    @Override
    public void atacar(Siniestro siniestro, Spiderman spiderman) {

        int daño1 = siniestro.getPuntosAtaque() * (int) 0.30;
        int dañoFinal = siniestro.getPuntosAtaque() + daño1;
        spiderman.setPuntosVida(spiderman.getPuntosVida() - dañoFinal);

    }

}
