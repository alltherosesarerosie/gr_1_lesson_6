package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
    boss.setHealth(900);
    boss.setDamage(50);


    Weapon weaponBoss =new Weapon();
    weaponBoss.setType(WeaponType.EDGED);
    weaponBoss.setNameOfWeapon("Sword");
    boss.setWeapon(weaponBoss);

    System.out.println("Boss health: "+boss.getHealth()+" ;boss damage: "+boss.getDamage()+
            " ;boss weapon: "+ boss.getWeapon().getNameOfWeapon()+"; type: "+boss.getWeapon().getType());

    System.out.println(boss.printInfo());

    Skeleton skeleton = new Skeleton();
    skeleton.setHealth(700);
    skeleton.setDamage(30);
    skeleton.setNumArrows(15);

    Weapon weaponSk1 =new Weapon();
    weaponSk1.setType(WeaponType.SMALL);
    weaponSk1.setNameOfWeapon("Sword");
    skeleton.setWeapon(weaponSk1);
    System.out.println(skeleton.printInfo());


    Skeleton skeleton2 = new Skeleton();
    skeleton2.setHealth(500);
    skeleton2.setDamage(25);
    skeleton2.setNumArrows(30);

    Weapon weaponSk2 =new Weapon();
    weaponSk2.setType(WeaponType.MAGIC);
    weaponSk2.setNameOfWeapon("Stick");
    skeleton2.setWeapon(weaponSk2);
    System.out.println(skeleton2.printInfo());

    }
}
