
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
    private static String MonsterName;
    private static int MaxVitality;
    private static int CurrentVitality;
    private static int DroppedEXP;
    private static int DroppedGold;
    private static int Power;
    private static int Defense;

    public Monster(String MonsterName, int MaxVitality, int CurrentVitality, int DroppedEXP, int DroppedGold, int Power, int Defense) {
        Monster.MonsterName = MonsterName;
        Monster.MaxVitality = MaxVitality;
        Monster.CurrentVitality = CurrentVitality;
        Monster.DroppedEXP = DroppedEXP;
        Monster.DroppedGold = DroppedGold;
        Monster.Power = Power;
        Monster.Defense = Defense;
    }

    public Monster() {
        
    }
    
    public static String getMonsterName() {
        return MonsterName;
    }

    public static void setMonsterName(String MonsterName) {
        Monster.MonsterName = MonsterName;
    }
    
    public static int getMaxVitality() {
        return MaxVitality;
    }

    public static void setMaxVitality(int MaxVitality) {
        Monster.MaxVitality = MaxVitality;
    }

    public static int getCurrentVitality() {
        return CurrentVitality;
    }

    public static void setCurrentVitality(int CurrentVitality) {
        Monster.CurrentVitality = CurrentVitality;
    }

    public static int getDroppedEXP() {
        return DroppedEXP;
    }

    public static void setDroppedEXP(int DroppedEXP) {
        Monster.DroppedEXP = DroppedEXP;
    }

    public static int getDroppedGold() {
        return DroppedGold;
    }

    public static void setDroppedGold(int DroppedGold) {
        Monster.DroppedGold = DroppedGold;
    }

    public static int getPower() {
        return Power;
    }

    public static void setPower(int Power) {
        Monster.Power = Power;
    }

    public static int getDefense() {
        return Defense;
    }

    public static void setDefense(int Defense) {
        Monster.Defense = Defense;
    }
}
