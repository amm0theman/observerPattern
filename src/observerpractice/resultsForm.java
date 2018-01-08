/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpractice;
import java.util.Random;
/**
 *
 * @author ammon.riley
 */
public class resultsForm {
    int match1Result;
    int match2Result;
    int match3Result;
    
    resultsForm() {
        Random rand = new Random();
        match1Result = rand.nextInt(10);
        match2Result = rand.nextInt(10);
        match3Result = rand.nextInt(10);
    }
    
    public int getMatch1() {
        return match1Result;
    }
    
    public int getMatch2() {
        return match2Result;
    }
    
    public int getMatch3() {
        return match3Result;
    }
}
