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
public abstract class Siniestro {

    public String nombre;
    public int puntosAtaque;
    public int puntosVida;
    public String nombreUniverso;

    public Siniestro(String nombre, int puntosAtaque, int puntosVida, String nombreUniverso) {
        this.nombre = nombre;
        this.puntosAtaque = puntosAtaque;
        this.puntosVida = puntosVida;
        this.nombreUniverso = nombreUniverso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public String getNombreUniverso() {
        return nombreUniverso;
    }

    public void setNombreUniverso(String nombreUniverso) {
        this.nombreUniverso = nombreUniverso;
    }

    @Override
    public String toString() {
        return "Siniestro{" + "nombre=" + nombre + ", puntosAtaque=" + puntosAtaque + ", puntosVida=" + puntosVida + ", nombreUniverso=" + nombreUniverso + '}';
    }

    public abstract void atacar(Siniestro siniestro, Spiderman spiderman);

}
