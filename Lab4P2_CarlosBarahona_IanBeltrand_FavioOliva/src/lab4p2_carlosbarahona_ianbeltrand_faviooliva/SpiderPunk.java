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
public class SpiderPunk extends Spiderman {

    public SpiderPunk(String nombre, int puntosAtaque, int puntosVida, String nombreUniverso) {
        super(nombre, puntosAtaque, puntosVida, nombreUniverso);
    }

    @Override
    public String toString() {
        return "SpiderPunk{" + "nombre=" + nombre + ", puntosAtaque=" + puntosAtaque + ", puntosVida=" + puntosVida + ", nombreUniverso=" + nombreUniverso + '}';
    }

    @Override
    public void atacar(Spiderman spiderman, Siniestro siniestro) {
        if (siniestro instanceof Blindado) {
            int daño1 = spiderman.getPuntosAtaque() * (int) 0.15;
            int dañoFinal = spiderman.getPuntosAtaque() + daño1;
            siniestro.setPuntosVida(siniestro.getPuntosVida() - dañoFinal);
            System.out.println(spiderman.getNombre() + " ataca a " + siniestro.getNombre() + " haciendo " + dañoFinal + " de daño, dejándolo a " + siniestro.getPuntosVida() + " de vida.");
        } else {
            siniestro.setPuntosVida(siniestro.getPuntosVida() - spiderman.getPuntosAtaque());
            System.out.println(spiderman.getNombre() + " ataca a " + siniestro.getNombre() + " haciendo " + spiderman.getPuntosAtaque() + " de daño, dejándolo a " + siniestro.getPuntosVida() + " de vida.");
        }
    }

}
