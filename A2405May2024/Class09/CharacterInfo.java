package May2024.Class09;

import java.util.Random;

public class CharacterInfo {
    private String name;
    private int hp;

    public CharacterInfo() {

    }

    public CharacterInfo(String name, int hp) {
        setName(name);
        setHp(hp);
    }

    // set name
    public void setName(String name) {
        this.name = name;
    }

    // get name
    public String getName() {
        return this.name;
    }

    // set hp
    public void setHp(int hp) {
        this.hp = hp;
    }

    // get hp
    public int getHp() {
        return this.hp;
    }

    public int gotDmg() {
        Random r = new Random();
        int intDmg= r.nextInt(11);
        this.hp-=intDmg;
        return intDmg;
    }

    public boolean characterAlive() {
        return (this.hp > 0);
    }

}
