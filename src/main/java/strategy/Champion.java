package strategy;

public class Champion {

    Fight fight;
    String name;

    public Champion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCombatType() {
        return fight.fight();
    }

    public void setCombatType(Fight combatType) {
        fight = combatType;
    }
}
