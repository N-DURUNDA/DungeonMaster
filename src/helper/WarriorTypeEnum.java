package helper;

import entity.*;

public enum WarriorTypeEnum {
    BOSS(Boss.class.getTypeName()),
    ENEMY(Enemy.class.getTypeName()),
    PLAYER(Player.class.getTypeName());

    private final String typeName;

    WarriorTypeEnum(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}
