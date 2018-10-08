import java.util.*;

public class PCB {
	
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
	int programCounter = 0; //next instruction to ececute in burst seq
	boolean newState = false;
	boolean readyState = false;
	boolean runningState = false;
	boolean waitingState = false;
	boolean terminatedState = false;
	
	double startTime, endTime, endOfFirstIOBurst = 0;
	
    public void Print(){
        System.out.println("You've reached the PCB class print function");
    }

    public void setToReadyState(){
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
    }
}
