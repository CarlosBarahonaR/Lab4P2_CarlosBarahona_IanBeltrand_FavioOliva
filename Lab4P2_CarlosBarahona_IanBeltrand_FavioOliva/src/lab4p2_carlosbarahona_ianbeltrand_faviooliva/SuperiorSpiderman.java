/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_carlosbarahona_ianbeltrand_faviooliva;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class SuperiorSpiderman extends Spiderman {

    static Random random = new Random();

    public SuperiorSpiderman(String nombre, int puntosAtaque, int puntosVida, String nombreUniverso) {
        super(nombre, puntosAtaque, puntosVida, nombreUniverso);
    }

    @Override
    public String toString() {
        return "SuperiorSpiderman{" + "nombre=" + nombre + ", puntosAtaque=" + puntosAtaque + ", puntosVida=" + puntosVida + ", nombreUniverso=" + nombreUniverso + '}';
    }

    @Override
    public void atacar(Spiderman spiderman, Siniestro siniestro) {
        int x = random.nextInt((30 - 10) + 1) + 10;
        double porcentaje=x/100.0;
        int daño1 = spiderman.getPuntosAtaque() * (int) porcentaje;
        int dañoFinal = spiderman.getPuntosAtaque() + daño1;
        siniestro.setPuntosVida(siniestro.getPuntosVida() - dañoFinal);
    }

}
