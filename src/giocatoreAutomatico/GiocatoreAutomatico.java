package giocatoreAutomatico;

import game2048.*;


/**
 * @author Sonia Cannas e Noemi Sarritzu
 * Interfaccia che definisce un giocatore automatico 
 */
public interface GiocatoreAutomatico {
    
     /** restituisce un oggetto GiocatoreAutomatico su cui si potrà chiedere che mosse fare.  
     Lancia una eccezione se c'e' un problema nella creazione del giocatore automatico */
    public static GiocatoreAutomatico getGiocatoreAutomatico() throws Exception {
            return (GiocatoreAutomatico) Class.forName("giocatoreAutomatico.player.MyGiocatoreAutomatico").newInstance();
    }

    /**   restituisce 0=ALTO; 1=DX; 2=BASSO; 3=SX , ovvero la mossa che il giocatore automatico intende fare.
     * In input prende una griglia di gioco 4x4 che contiene la situazione del gioco corrente.
     * 
     * @see Griglia
     */
    public abstract int prossimaMossa(Griglia g);
}
