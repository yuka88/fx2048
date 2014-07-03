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
import java.util.HashMap;

/**
 *
 * @author sonia
 */
public class MyGiocatoreAutomatico implements GiocatoreAutomatico {
    
    /**   restituisce 0=ALTO; 1=DX; 2=BASSO; 3=SX , ovvero la mossa che il giocatore automatico intende fare.
     * In input prende una griglia di gioco 4x4 che contiene la situazione del gioco corrente.
     * 
     * @see Griglia
     */
    
    public MyGiocatoreAutomatico(){}
    
    
    public int prossimaMossa(Griglia g){
        Random rand = new Random();
        boolean fail = true;
        int mossa;
        boolean a=false;
        boolean b=false;
        boolean c=false;
        boolean d=false;
       
        do{
            mossa = rand.nextInt(4);
            
            if(mossa==0){ //mossa UP (sale)
                a=true;
                for(int i=0; i<=3; i++)
                    for(int j=0; j<=2; j++){
                        Location loc = new Location(i,j);
                        if(g.get(loc)==-1){
                            for(int k=j+1; k<=3; k++)
                                if(g.get(new Location(i,k))!=-1){
                                    fail = false;
                                    break;
                                }
                        }
                    } 
            }
            if(mossa==1){ //mossa RIGHT
                b=true;
                for(int i=1; i<=3; i++)
                    for(int j=0; j<=3; j++){
                        Location loc = new Location(i,j);
                        if(g.get(loc)==-1){
                            for(int k=0; k<i; k++)
                                if(g.get(new Location(k,j))!=-1){
                                    fail = false;
                                    break;
                                }
                        }
                    }
            }
            if(mossa==2){ //mossa DOWN (scende)
                c=true;
                for(int i=0; i<=3; i++)
                    for(int j=1; j<=3; j++){
                        Location loc = new Location(i,j);
                        if(g.get(loc)==-1){
                            for(int k=0; k<j; k++)
                                if(g.get(new Location(i,k))!=-1){
                                    fail = false;
                                    break;
                                }
                        }
                    }
            }
            if(mossa==3){ //mossa LEFT
                d=true;
                for(int i=0; i<=2; i++)
                    for(int j=0; j<=3; j++){
                        Location loc = new Location(i,j);
                        if(g.get(loc)==-1){
                            for(int k=i+1; k<=3; k++)
                                if(g.get(new Location(k,j))!=-1){
                                    fail = false;
                                    break;
                                }
                        }
                    }
            }
            if(a && b && c && d)
              return mossa;  
           
        }while(fail);
        return mossa;
    }
    
}