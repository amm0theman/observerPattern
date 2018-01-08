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
public class averageDisplay implements observer{
    resultsForm currentResults;
    double average;
    
    public void update(subject updatedSubject) {
        matchResults castedObject = (matchResults)updatedSubject;
        currentResults = castedObject.GetState();
        average = (currentResults.match1Result + currentResults.match2Result + currentResults.match3Result) / 3;
    }
    
    public void display() {
        System.out.println("The average of the past 3 matches is " + average +".");
    }
}
