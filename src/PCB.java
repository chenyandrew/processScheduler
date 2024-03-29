import java.util.*;

public class PCB implements Comparable<PCB> {
	
	//constructor
	PCB()
	{	
		newState = true;
		readyState = false;
		runningState = false;
		waitingState = false;
		terminatedState = false;
		
	}
	
	int ID = 0;
	int arrivalOrder = 0;
	int priority = 0;
	List<Integer> burstSeq = new ArrayList<Integer>();
	int programCounter = 0; //next instruction to excecute in burst seq
        boolean arrived = false;//b.w.h
	boolean newState = false;
	boolean readyState = false;
	boolean runningState = false;
	boolean waitingState = false;
	boolean terminatedState = false;
	
	double startTime, endTime, endOfFirstIOBurst = 0;

    public void Print(){
        System.out.println(this.burstSeq);
    }

    public void setToReadyState(){
        if (!this.arrived){
            this.arrived = true;
            startTime = System.nanoTime(); //b.w.h
        }
        
        newState = false;
	readyState = true;
	runningState = false;
	waitingState = false;
	terminatedState = false;
    }
    
    public void setToRunningState(){
        newState = false;
	readyState = false;
	runningState = true;
	waitingState = false;
	terminatedState = false;
    }
    
    public void setToWaitingState(){
        newState = false;
	readyState = false;
	runningState = false;
	waitingState = true;
	terminatedState = false;
    }
    
    public void setToTerminatedState(){
        newState = false;
	readyState = false;
	runningState = false;
	waitingState = false;
	terminatedState = true;
        
        endTime = System.nanoTime(); //b.w.h
    }
    
    public int compareTo(PCB comparePCB)
    {
    	int comparePriority = ((PCB) comparePCB).priority;
    	
    	return this.priority - comparePriority;
    }

}

