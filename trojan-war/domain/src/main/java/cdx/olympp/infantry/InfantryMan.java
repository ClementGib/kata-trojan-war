package cdx.olympp.infantry;

public class InfantryMan {
    private int healthPoints;
    private int attackPoints;
    private int defensePoints;

    public InfantryMan(int health, int attackPoints, int defensePoints) {
        this.healthPoints = health;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

}
