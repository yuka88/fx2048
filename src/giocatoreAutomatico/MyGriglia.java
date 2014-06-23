/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package giocatoreAutomatico;
import java.util.TreeMap;
import game2048.*;

/**
 *
 * @author ubuntu
 */
public class MyGriglia extends TreeMap<Location,Integer> implements Griglia{
    private TreeMap<Location,Integer> griglia= new TreeMap<game2048.Location,Integer>();
    public MyGriglia(GameManager game){
            for (int i=0; i<=3; i++)
                for(int j=0; j<=3;j++){
                    Location location=new Location(i,j);
                    if (game.gameGrid.get(location)==null)
                        griglia.put(location,-1 );
                    else
                        griglia.put(location, game.gameGrid.get(location).getValue());
                }
   
    
    }
     @Override
            
    public boolean equals(Object o){
        return true;
    }
}
