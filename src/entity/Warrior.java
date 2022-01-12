package entity;

public abstract class Warrior {
    protected int health;
    protected int attackDamage;

    public abstract int bonk(int health, int enemyCount);
}
