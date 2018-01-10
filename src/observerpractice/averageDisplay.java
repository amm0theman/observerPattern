/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpractice;
import java.util.ArrayList;
/**
 *
 * @author ammon.riley
 */
public class averageDisplay implements observer{
    ArrayList allGames;

    public averageDisplay() {
        this.allGames = new ArrayList();
    }
    
    @Override
    public void update(subject updatedSubject) {
        matchResults castedObject = (matchResults)updatedSubject;
        resultsForm tempResults = castedObject.GetState();
        allGames.add(tempResults.getMatch1());
    }
    
    public void update(matchResults updatedSubject) {
        resultsForm tempResults = updatedSubject.GetState();
        allGames.add(tempResults.getMatch1());
        
    }
    
    public void display() {
        
        System.out.println("The average of all games is " + ((double)getSum()/allGames.size()) +".");
    }
    
    public int getSum() {
        int sum = 0;
        
        for (int i=0; i < this.allGames.size(); i++) {
            sum += (int)this.allGames.get(i);
        }
        return sum;
    }
}
