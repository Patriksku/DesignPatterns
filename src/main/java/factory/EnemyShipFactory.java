package factory;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType) {
        EnemyShip newShip = null;

        if (newShipType.toLowerCase().equals("u")) {
            return new UFOEnemyShip();
        } else if (newShipType.toLowerCase().equals("r")) {
            return new RocketEnemyShip();
        } else if (newShipType.toLowerCase().equals("b")) {
            return new BigUFOEnemyShip();
        } else {
            return null;
        }
    }
}
