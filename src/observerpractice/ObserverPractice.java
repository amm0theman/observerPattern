/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpractice;

/**
 *
 * @author ammon.riley
 */
public class ObserverPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matchResults threeGames = new matchResults();
        averageDisplay display1 = new averageDisplay();
        sportsDisplay display2 = new sportsDisplay();
        
        threeGames.attachObserver(display1);
        threeGames.attachObserver(display2);
        threeGames.notifyObserver();
        
        for (int i = 0; i < 10; i++){
            threeGames.SetState();
            display1.display();
            display2.display();
            threeGames.notifyObserver();
        }
    }
    
}
