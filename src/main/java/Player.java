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
    private static int CurrentEXP;
    private static int CurrentGold;
    private static int MaxVitality;
    private static int CurrentVitality;
    private static int Power;
    private static int Defense;
    private static int PotionsHeld;
    private static int MegaPotionsHeld;
    private static int MaxPotionsHeld;

    public Player(int Level, int CurrentEXP, int CurrentGold, int MaxVitality, int CurrentVitality, int Power, int Defense, int PotionsHeld, int MegaPotionsHeld, int MaxPotionsHeld) {
        Player.Level = Level;
        Player.CurrentEXP = CurrentEXP;
        Player.CurrentGold = CurrentGold;
        Player.MaxVitality = MaxVitality;
        Player.CurrentVitality = CurrentVitality;
        Player.Power = Power;
        Player.Defense = Defense;
        Player.PotionsHeld = PotionsHeld;
        Player.MegaPotionsHeld = MegaPotionsHeld;
        Player.MaxPotionsHeld = MaxPotionsHeld;
    }

    public static int getCurrentEXP() {
        return CurrentEXP;
    }

    public static void setCurrentEXP(int CurrentEXP) {
        Player.CurrentEXP = CurrentEXP;
    }

    public static int getCurrentGold() {
        return CurrentGold;
    }

    public static void setCurrentGold(int CurrentGold) {
        Player.CurrentGold = CurrentGold;
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

    public static int getPotionsHeld() {
        return PotionsHeld;
    }

    public static void setPotionsHeld(int PotionsHeld) {
        Player.PotionsHeld = PotionsHeld;
    }

    public static int getMegaPotionsHeld() {
        return MegaPotionsHeld;
    }

    public static void setMegaPotionsHeld(int MegaPotionsHeld) {
        Player.MegaPotionsHeld = MegaPotionsHeld;
    }

    public static int getMaxPotionsHeld() {
        return MaxPotionsHeld;
    }

    public static void setMaxPotionsHeld(int MaxPotionsHeld) {
        Player.MaxPotionsHeld = MaxPotionsHeld;
    }
    
}
