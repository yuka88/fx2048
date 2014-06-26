/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package giocatoreAutomatico.player;

import game2048.*;
import static game2048.Direction.*;
import giocatoreAutomatico.GiocatoreAutomatico;
import giocatoreAutomatico.Griglia;
import java.util.Random;

/**
 *
 * @author sonia
 */
public class MyGiocatoreAutomatico implements GiocatoreAutomatico {
    private GameManager gameManager;
    
    /**   restituisce 0=ALTO; 1=DX; 2=BASSO; 3=SX , ovvero la mossa che il giocatore automatico intende fare.
     * In input prende una griglia di gioco 4x4 che contiene la situazione del gioco corrente.
     * 
     * @see Griglia
     */
    
    public MyGiocatoreAutomatico(GameManager gameManager){
            this.gameManager = gameManager;
    }
    
    
    public int prossimaMossa(Griglia g){
        Griglia grigliaNuova = new MyGriglia();
        Random rand = new Random();
        int mossa;
        do{
            mossa = rand.nextInt(3);
            if(mossa==0) {
                gameManager.move(UP);
            }
            if(mossa==1) {
                gameManager.move(RIGHT);
            }
            if(mossa==2) {
                gameManager.move(DOWN);
            }
            if(mossa==3) {
                gameManager.move(LEFT);
            }
        }while(grigliaNuova.equals(g));
        return mossa;
    }
    
}