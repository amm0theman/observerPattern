/*
Program implements the observer pattern
This file implements the subject
File last edited 11 AM 1/8/2018 by Ammon Riley
 */
package observerpractice;

/**
 *
 * @author ammon.riley
 */
public abstract class subject {
    observer[] subjectList;     //list of all observers to this subject
    int listTracker;            //keeps track of where to put the next observer
    
    //Initialize subject list
    subject(){
        subjectList = new observer[10];
        
        for(int i = 0; i < 10; i++)
        {
            subjectList[i] = null;
        }
    }

    //Subscribe an observer
    public void attachObserver(observer obs) {
        for(int i = 0; i < 10; i++)
        {
            if(subjectList[i] == null)
            {
                subjectList[i] = obs;
                break;
            }
        }
    }
    
    //Unsubscribe an observer
    public void detachObserver(observer obs, int detachObsPos) {
        subjectList[detachObsPos] = null;
    }
    
    //Update all observers
    public void notifyObserver() {
        for (int i = 0; i < 10; i++)
        {
            if(!(subjectList[i] == null))
                subjectList[i].update(this);
        }
    }
}