/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antho
 */
public class Global {
    private static String PlayerName;
    
    public Global(String PlayerName) {
        Global.PlayerName = PlayerName;
    }

    public static String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String PlayerName) {
        Global.PlayerName = PlayerName;
    }
    
    
}
