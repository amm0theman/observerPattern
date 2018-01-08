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
public class matchResults extends subject {
    
    resultsForm matchStatus;
    
    matchResults() {
        matchStatus = new resultsForm();
    }
    
    public resultsForm GetState() {
        return matchStatus;
    }
    
    public void SetState() {
        matchStatus = new resultsForm();
    }
}
