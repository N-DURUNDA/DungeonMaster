package entity;

import helper.AttackCoefficientEnum;

public class Enemy extends Warrior {
    @Override
    public int bonk(int health, int enemyCount) {
        return (int) (health - (health/enemyCount) * AttackCoefficientEnum.ENEMY.getAttackCoefficient());
    }
}
