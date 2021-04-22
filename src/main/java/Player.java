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
    private static int MaxVitality;
    private static int CurrentVitality;
    private static int Power;
    private static int Defense;

    public Player(int Level, int MaxVitality, int CurrentVitality, int Power, int Defense) {
        Player.Level = Level;
        Player.MaxVitality = MaxVitality;
        Player.CurrentVitality = CurrentVitality;
        Player.Power = Power;
        Player.Defense = Defense;
    }

    public static int getLevel() {
        return Level;
    }

    public static void setLevel(int Level) {
        Player.Level = Level;
    }

    public static int getMaxVitality() {
        return MaxVitality;
    }

    public static void setMaxVitality(int MaxVitality) {
        Player.MaxVitality = MaxVitality;
    }
    
    public static int getCurrentVitality() {
        return CurrentVitality;
    }

    public static void setCurrentVitality(int CurrentVitality) {
        Player.CurrentVitality = CurrentVitality;
    }

    public static int getPower() {
        return Power;
    }

    public static void setPower(int Power) {
        Player.Power = Power;
    }

    public static int getDefense() {
        return Defense;
    }

    public static void setDefense(int Defense) {
        Player.Defense = Defense;
    }
}
