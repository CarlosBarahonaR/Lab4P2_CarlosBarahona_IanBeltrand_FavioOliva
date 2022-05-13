
package lab4p2_carlosbarahona_ianbeltrand_faviooliva;

import java.util.ArrayList;
import java.util.Collections;

public class Jugar {
    
    public Jugar(){
        
    }
    
    //Funciones
    public boolean Validar(ArrayList Spidermans, ArrayList Enemigos){
        if(Spidermans.size() == Enemigos.size()){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean Win(Spiderman spiderman, Siniestro siniestro){
        if(siniestro.getPuntosVida() < 0){
            System.out.println("El siniestro " + siniestro.getNombre() + " ha sido derrotado..." + 
                    "\nTriunfa " + spiderman.getNombre());
            return false;
        }
        
        if(spiderman.getPuntosVida() < 0){
            System.out.println("El spiderman " + spiderman.getNombre() + " ha sido derrotado..." + 
                    "\nTriunfa " + siniestro.getNombre());
            return false;
        }
        
        return true;
    }
    
    public int Batallas(Spiderman spiderman, Siniestro siniestro){
        
        System.out.println("\n********** BATALLA DEL SPIDERMAN " + spiderman.getNombre() + " VS " + siniestro.getNombre() + "**********");
        
        boolean End = true;
        
        while(End){
            spiderman.atacar(spiderman, siniestro);
            if (Win(spiderman, siniestro) != false){ 
                siniestro.atacar(siniestro, spiderman);
                if(Win(spiderman, siniestro) == false){
                    End = false;
                            System.out.println("*******************************************************************************************");
                    return 0;
                }
            }else{
                End = false;
                        System.out.println("*******************************************************************************************");
                return 1;
            }
        }
        
        return 2;
    }
    
    public boolean BatallaFinal(ArrayList<Spiderman> spidermans, ArrayList<Siniestro> Siniestros){
        int VidaB = 0;
        int VidaM = 0;
        int ATKB = 0;
        int ATKM = 0;
        for (Siniestro Siniestro1 : Siniestros) {
            
        }
         return false;
    }
    
    public void Jugar(ArrayList<Spiderman> Spidermans, ArrayList<Siniestro> Siniestros){
        int ContadorB = 0;
        int ContadorM = 0;
        
        if(Validar(Spidermans, Siniestros) != true){
            System.out.println("\nLa cantidad de Spidermans y siniestros no es la misma");
        }else{
            Collections.shuffle(Siniestros);
            Collections.shuffle(Spidermans);
            
            for (int i = 0; i < Spidermans.size(); i++){
                if(Batallas(Spidermans.get(i), Siniestros.get(i)) == 1){
                    ContadorB = ContadorB + 1;
                }else{
                    ContadorM = ContadorM + 1;
                }
            }
            
            if(ContadorB > ContadorM){
                System.out.println("\nLos Spiderman han ganado!!!");
            }else{
                if(ContadorB < ContadorM){
                    System.out.println("\nLos siniestros han ganado...");
                }else{
                    if(ContadorB == ContadorM){
                        System.out.println("F, un empate");
                    }
                }
            }
        }
    }
}
