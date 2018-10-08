import java.util.*;

public class IODevice {

    public boolean BusyOrNot;

    public IODevice(ArrayList<Process> Wait_Queue){

    }

    // always pick one process from the Wait_Queue to execute

    public String execute(int IO_burst){
        BusyOrNot = true;
        for(int i =0; i < IO_burst;++i)
        	BubbleSort();
        // call Bubble Sort() for IO_burst times and then return "ready"
        return "ready";
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

}
