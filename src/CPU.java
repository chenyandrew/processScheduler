import javafx.util.*;
import java.util.*;


public class CPU {

    public boolean cpuIsBusy;
    public int PC; //CPU has only one register PC
    public int timeSlice;

    public CPU(int settimeslice)
    {
        timeSlice = settimeslice;
        cpuIsBusy = false;
    }

    public Pair<Integer, String> execute(Process P)
    {
        cpuIsBusy = true;
        // read the CPU burst number, say #, from the position PositionOfNextInstructionToExecute of P

        // repeat calling Bubble Sort() for # times and then continue

        // if code runs out, return (PositionOfNextInstructionToExecute, "terminated"), then
        // OS puts it back to the terminated queue

        // if the slice of time (restricted number of calling Bubble Sort() for a process each time) runs out,
        // return (PositionOfNextInstructionToExecute+1, "ready"), then
        // OS puts it back to the ready queue

        // otherwise,
        // return (PositionOfNextInstructionToExecute+1", "wait")
        // usually when P has an I/O request and then OS removes it from the ready queue and sends it to the I/O queue
        Pair<Integer, String> output = new Pair<Integer, String>(0, "test Pair output");
        return output;
    }

    //generates a random list of size n, runs bubble sort O(n^2)
    public void BubbleSort(){
    	List<Integer> listToSort = rng(100000);
    	
    	for (int i = 0; i < listToSort.size()-1; ++i)
    	{
    		for (int j = 0; j < listToSort.size()-1; ++j)
    		{
    			if (listToSort.indexOf(j) > listToSort.indexOf(j+1))
    			{
    				Collections.swap(listToSort, j, j+1);
    			}
    		}
    	}

    }
    
    public List<Integer> rng(int n)
    {
        List<Integer> result = new ArrayList<>();
        double rand = 0;
        for (int i : result)
        {
            rand = (Math.random() * 100000)+1;
            result.add((int) rand);

        }//looping until n-many random ints btw 1-100k into list

        return result;
    }

    public boolean cpuBusyBoolean(){
        return false;
    }


}
