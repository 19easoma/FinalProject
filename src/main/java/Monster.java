/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antho
 */
public class Monster {
    private int Vitality;
    private int DroppedEXP;
    private int DroppedGold;
    private int Power;
    private int Defense;
    private int Agility;

    public Monster(int Vitality, int DroppedEXP, int DroppedGold, int Power, int Defense, int Agility) {
        this.Vitality = Vitality;
        this.DroppedEXP = DroppedEXP;
        this.DroppedGold = DroppedGold;
        this.Power = Power;
        this.Defense = Defense;
        this.Agility = Agility;
    }

    public int getVitality() {
        return Vitality;
    }

    public void setVitality(int Vitality) {
        this.Vitality = Vitality;
    }

    public int getDroppedEXP() {
        return DroppedEXP;
    }

    public void setDroppedEXP(int DroppedEXP) {
        this.DroppedEXP = DroppedEXP;
    }

    public int getDroppedGold() {
        return DroppedGold;
    }

    public void setDroppedGold(int DroppedGold) {
        this.DroppedGold = DroppedGold;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int Power) {
        this.Power = Power;
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
