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
public class AlteradoGeneticamente extends Siniestro {

    public AlteradoGeneticamente(String nombre, int puntosAtaque, int puntosVida, String nombreUniverso) {
        super(nombre, puntosAtaque, puntosVida, nombreUniverso);
    }

    @Override
    public String toString() {
        return "AlteradoGeneticamente{" + "nombre=" + nombre + ", puntosAtaque=" + puntosAtaque + ", puntosVida=" + puntosVida + ", nombreUniverso=" + nombreUniverso + '}';
    }

    @Override
    public void atacar(Siniestro siniestro, Spiderman spiderman) {
        if (spiderman instanceof SpiderPunk) {
            int daño1 = siniestro.getPuntosAtaque() * (int) 0.10;
            int dañoFinal = siniestro.getPuntosAtaque() + daño1;
            spiderman.setPuntosVida(spiderman.getPuntosVida() - dañoFinal);
            System.out.println(siniestro.getNombre() + " ataca a " + spiderman.getNombre() + " haciendo " + dañoFinal + " de daño, dejándolo a " + spiderman.getPuntosVida() + " de vida.");
        } else {
            spiderman.setPuntosVida(spiderman.getPuntosVida() - siniestro.getPuntosAtaque());
            System.out.println(siniestro.getNombre() + " ataca a " + spiderman.getNombre() + " haciendo " + siniestro.getPuntosAtaque() + " de daño, dejándolo a " + spiderman.getPuntosVida() + " de vida.");
        }
    }

}
