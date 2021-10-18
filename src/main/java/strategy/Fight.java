package strategy;

public interface Fight {
    
    String fight();
}

class Melee implements Fight {

    @Override
    public String fight() {
        return "Combat: Melee.";
    }
}

class Ranged implements Fight {

    @Override
    public String fight() {
        return "Combat: Ranged.";
    }
}
