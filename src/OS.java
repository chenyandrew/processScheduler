import java.io.*;
import java.util.*;

public class OS {


    
    public static ArrayList<PCB> New_Queue = new ArrayList<PCB>();
    public static ArrayList<PCB> Ready_Queue = new ArrayList<PCB>();
    public static ArrayList<PCB> Wait_Queue = new ArrayList<PCB>();
    public static ArrayList<PCB> Terminated_Queue = new ArrayList<PCB>();
    public static ArrayList<PCB> Currently_Running = new ArrayList<PCB>();//beto's code, remind him :)
    
	public CPU cpu = new CPU();
    public IODevice io = new IODevice(Wait_Queue);
    public boolean isCPUAvailable;
    // need to make processTable

    public static ArrayList<PCB> initialPCBs = new ArrayList<PCB>(); 

    public static void main(String[] args) {

        // open file for reading
        File input = new File("C:\\Users\\frank\\Desktop\\processScheduler\\src\\input.txt");
        //

        // use scanner from java.util library to read through each line
        // it breaks up one line into 4 lines, it looks like it  splits the empty strings
        try(Scanner sc = new Scanner(input)) {
           // int i = 0;
        	PCB tempPCB = new PCB();

        	String seq;
            while (sc.hasNext()) {
            	String seqString = "";
            	//make new PCB, store stuff from file into this PCB
            	
            	//SHIT DON'T WORK RN
            	tempPCB = new PCB();
                tempPCB.ID = Integer.parseInt(sc.next());
                tempPCB.arrivalOrder = Integer.parseInt(sc.next());
                tempPCB.priority = Integer.parseInt(sc.next());
//            	tempPCB.ID = sc.nextInt();
//            	tempPCB.arrivalOrder = sc.nextInt();
//            	tempPCB.priority = sc.nextInt();
            	
            	//store next big int into some int seq, convert to string,
            	//loop through string, storing digits into int array
            	seq = sc.next();
            	seqString = String.valueOf(seq);
            	for (int j = 0; j < seqString.length(); ++j)
            	{
            		tempPCB.burstSeq.add((Character.getNumericValue(seqString.charAt(j))));
            		//tempPCB.burstSeq.add(Integer.getInteger(seqString.indexOf(j)));
                }
            	New_Queue.add(tempPCB);
                //initialPCBs.add(tempPCB);

            }
        } catch (FileNotFoundException e) {
            // handle
        }
        //
//        for (int j = 0; j < initialPCBs.size(); ++j)
//        {
//            System.out.println(initialPCBs.size());
//            initialPCBs.get(j).Print();
//        }
//        for (int j = 0; j < New_Queue.size(); ++j)
//        {
//        	
//        }
        priorityScheduler();


        // List<Integer> testList;
        // testList = rng(5);
        // for (int i:testList)
        //     System.out.println(testList.get(i));

        //System.out.println("The mean for this list is: " + mean(testList));
        //System.out.println("The standard deviation for this list is: " + stdev(testList));

        PCB newPCB = new PCB();
        newPCB.Print();
        System.out.println("test OS main function" );
    }

    public static void priorityScheduler()
    {
    	//Collections.sort(New_Queue);
//    	for(int i = 0; i < New_Queue.size(); ++i)
//    	{
//    		System.out.println(New_Queue.get(i).priority);
//    	}
    	
    	int priorityMax = 0;
    	PCB tempPCB = new PCB();
    	int i = 0;
    	
    	//getting first guy, removing from queue, shoving into ready queue
    	PCB firstPCB = New_Queue.get(0);
    	New_Queue.remove(0);
    	Ready_Queue.add(firstPCB);
    	priorityMax = Ready_Queue.get(0).priority;
    
    	
    }
    public static void FirstComeFirstServe(){

        for (int i = 0; i < initialPCBs.size(); i++){
            
        }

    }

    public static List<Integer> rng(int n)
    {
        List<Integer> result = new ArrayList<>();
        double rand = 0;
        for (int i : result)
        {
            rand = (Math.random() * 100000)+1;
            result.add((int) rand);

        }//looping until n-many random ints btw 1-100 into list

        return result;
    }
    public static double mean(List<Integer> list)
    {
        double mean = 0;
        int sum = 0;
        //for(int i = 0; i < list.size(); ++i)
        for (int i : list)
        {
            sum += list.indexOf(i);
        }
        mean = sum/list.size();
        return mean;
    }

    public static double stdev(List<Integer> list)
    {

        double sum = 0, stdev = 0;
        int length = list.size();

        for(double num : list)
        {
            sum += num;
        }

        double mean = mean(list);

        for (double num : list)
        {
            stdev += Math.pow(num-mean, 2);
        }

        return Math.sqrt(stdev/length);

    }

}

