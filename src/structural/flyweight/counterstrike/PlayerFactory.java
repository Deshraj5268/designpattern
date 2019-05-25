package structural.flyweight.counterstrike;

import exception.ApplicationException;
import structural.StructuralConstants;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {

    private static Map<String,Player> playerFactoryMap = new HashMap();

    private PlayerFactory(){

    }

    public static Player getPlayer(String type) throws ApplicationException{
        Player player = null;
        if (playerFactoryMap.containsKey(type)) {
            player =  playerFactoryMap.get(type);
        }else{
            switch (type){
                case StructuralConstants.TERRORRIST :
                    player = new Terrorist();
                    break;
                case StructuralConstants.COUNTERTERRORRIST :
                    player = new CounterTerrorist();
                    break;
                default:
                    throw new ApplicationException("not a valid player");
            }
            System.out.println("PLAYER IS ADDED IN MAP :"+player.toString());
            playerFactoryMap.put(type,player);
        }
        return player;
    }
}
