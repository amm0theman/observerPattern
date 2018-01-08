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
public class sportsDisplay implements observer {
    
    resultsForm currentResults;
    
    public void update(subject updatedSubject) {
        matchResults castedObject = (matchResults)updatedSubject;
        currentResults = castedObject.GetState();
    }
    
    public void display() {
        System.out.println("The result of match 1 was " + currentResults.getMatch1() + ".");
        System.out.println("The result of match 2 was " + currentResults.getMatch2() + ".");
        System.out.println("The result of match 3 was " + currentResults.getMatch3() + ".");
    }
}
