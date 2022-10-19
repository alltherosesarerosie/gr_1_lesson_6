package com.company;

public class Boss extends GameEntity{
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return ("Boss health: "+getHealth()+" ;boss damage: "+getDamage()+
                " ;boss weapon: "+ getWeapon().getNameOfWeapon()+"; type: "+getWeapon().getType());
    }
}
