package strategy;

public class Main {

    public static void main(String[] args) {
        Champion singed = new Champion("Singed");
        singed.setCombatType(new Melee());

        Champion anivia = new Champion("Anivia");
        anivia.setCombatType(new Ranged());

        System.out.println(singed.getName() + " -> " + singed.getCombatType());
        System.out.println(anivia.getName() + " -> " + anivia.getCombatType());
    }


}
