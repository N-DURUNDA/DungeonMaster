package entity;

import helper.AttackCoefficientEnum;

public class Player extends Warrior {
    @Override
    public int bonk(int health, int enemyCount) {
        return (int) (health - (attackDamage + AttackCoefficientEnum.PLAYER.getAttackCoefficient()));
    }
}
