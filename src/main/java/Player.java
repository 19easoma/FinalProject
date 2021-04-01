/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antho
 */
public class Player {
    private String PlayerName;
    private int Vitality;
    private int Mana;
    private int Power;
    private int Wisdom;
    private int Defense;
    private int Agility;

    public Player(int Vitality, int Mana, int Power, int Wisdom, int Defense, int Agility) {
        this.Vitality = Vitality;
        this.Mana = Mana;
        this.Power = Power;
        this.Wisdom = Wisdom;
        this.Defense = Defense;
        this.Agility = Agility;
    }

    
    
    public Player(String PlayerName, int Vitality, int Mana, int Power, int Wisdom, int Defense, int Agility) {
        this.PlayerName = PlayerName;
        this.Vitality = Vitality;
        this.Mana = Mana;
        this.Power = Power;
        this.Wisdom = Wisdom;
        this.Defense = Defense;
        this.Agility = Agility;
    }
    
    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String PlayerName) {
        this.PlayerName = PlayerName;
    }
    
    public int getVitality() {
        return Vitality;
    }

    public void setVitality(int Vitality) {
        this.Vitality = Vitality;
    }

    public int getMana() {
        return Mana;
    }

    public void setMana(int Mana) {
        this.Mana = Mana;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int Power) {
        this.Power = Power;
    }

    public int getWisdom() {
        return Wisdom;
    }

    public void setWisdom(int Wisdom) {
        this.Wisdom = Wisdom;
    }

    public int getDefense() {
        return Defense;
    }

    public void setDefense(int Defense) {
        this.Defense = Defense;
    }

    public int getAgility() {
        return Agility;
    }

    public void setAgility(int Agility) {
        this.Agility = Agility;
    }
    
    
}
