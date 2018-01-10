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
    
    @Override
    public void update(subject updatedSubject) {
        matchResults castedObject = (matchResults)updatedSubject;
        currentResults = castedObject.GetState();
    }
    
    public void update(matchResults updatedSubject) {
        currentResults = updatedSubject.GetState();
    }
    
    public void display() {
        System.out.println("The result of the most recent match was " + currentResults.getMatch1() + ".");
    }
}
