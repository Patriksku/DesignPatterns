package factory;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args) {

        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;

        Scanner userIput = new Scanner(System.in);
        System.out.println("What type of ship? (U / R / B)");

        if (userIput.hasNextLine()) {
            String typeOfShip = userIput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }

        if (theEnemy != null) {
            doStuffEnemy(theEnemy);
        } else {
            System.out.println("Enter correct value next time.");
        }


    }

    private static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
