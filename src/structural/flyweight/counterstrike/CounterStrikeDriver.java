package structural.flyweight.counterstrike;

import exception.ApplicationException;

import java.util.Random;

public class CounterStrikeDriver {

    private static String [] playerType = {"Terrorist","CounterTerrorist"};
    private static String [] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            Player player = null;
            try {
                player = PlayerFactory.getPlayer(getRandonPlayer());
            }catch (ApplicationException ap){
                System.out.println(ap.getMessage());
                continue;
            }
            player.assignWeapon(getRandonWeapon());
            player.mission();
        }
    }

    private static String getRandonWeapon() {
        Random random = new Random();
        return weapons[random.nextInt(weapons.length)];
    }

    private static String getRandonPlayer() {
        Random random = new Random();
        return playerType[random.nextInt(playerType.length)];
    }
}
