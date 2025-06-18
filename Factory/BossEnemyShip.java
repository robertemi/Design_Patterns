package Factory;

public class BossEnemyShip extends EnemyShip{

    public BossEnemyShip(double health, double damage) {
        super(health, damage);
    }

    public double getHealth() {
        return super.getHealth();
    }
    public void setHealth(double health) {
        super.setHealth(health);
    }
    public double getDamage() {
        return super.getDamage();
    }
    public void setDamage(double damage) {
        super.setDamage(damage);
    }
    
}