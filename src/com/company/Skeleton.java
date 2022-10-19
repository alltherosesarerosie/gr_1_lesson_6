package com.company;

public class Skeleton extends Boss{
    private int numArrows;

    public int getNumArrows() {
        return numArrows;
    }

    public void setNumArrows(int numArrows) {
        this.numArrows = numArrows;
    }

    @Override
    public String printInfo() {
        return ("Skeleton health: "+getHealth()+" ;skeleton damage: "+getDamage()+
                " ;skeleton weapon: "+ getWeapon().getNameOfWeapon()+"; type: "+getWeapon().getType()
                +"; number of arrows is "+getNumArrows());
    }
}
