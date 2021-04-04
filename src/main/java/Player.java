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
    private static int Level;
    private static int Vitality;
    private static int Mana;
    private static int Power;
    private static int Wisdom;
    private static int Defense;
    private static int Agility;

    public Player(int Level, int Vitality, int Mana, int Power, int Wisdom, int Defense, int Agility) {
        Player.Level = Level;
        Player.Vitality = Vitality;
        Player.Mana = Mana;
        Player.Power = Power;
        Player.Wisdom = Wisdom;
        Player.Defense = Defense;
        Player.Agility = Agility;
    }

    public static int getLevel() {
        return Level;
    }

    public static void setLevel(int Level) {
        Player.Level = Level;
    }

    public static int getVitality() {
        return Vitality;
    }

    public static void setVitality(int Vitality) {
        Player.Vitality = Vitality;
    }

    public static int getMana() {
        return Mana;
    }

    public static void setMana(int Mana) {
        Player.Mana = Mana;
    }

    public static int getPower() {
        return Power;
    }

    public static void setPower(int Power) {
        Player.Power = Power;
    }

    public static int getWisdom() {
        return Wisdom;
    }

    public static void setWisdom(int Wisdom) {
        Player.Wisdom = Wisdom;
    }

    public static int getDefense() {
        return Defense;
    }

    public static void setDefense(int Defense) {
        Player.Defense = Defense;
    }

    public static int getAgility() {
        return Agility;
    }

    public static void setAgility(int Agility) {
        Player.Agility = Agility;
    }

    
    
}
