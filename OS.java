import java.io.*;
import java.util.*;

public class OS {

    public CPU cpu;
    public IODevice io;
    public boolean isCPUAvailable;
    // need to make processTable
    
    public ArrayList<Process> New_Queue;
    public ArrayList<Process> Ready_Queue;
    public ArrayList<Process> Wait_Queue;
    public ArrayList<Process> Terminated_Queue;

    public static void main(String[] args) {

        // open file for reading
        File input = new File("D:\\Graduate School\\Fall 2018\\CSCI 6334 Advanced Operating Systems\\src\\input.txt");
        //

        // use scanner from java.util library to read through each line
        // it breaks up one line into 4 lines, it looks like it  splits the empty strings
        try(Scanner sc = new Scanner(input)) {
            int i = 0;
        	PCB tempPCB = new PCB();
            while (sc.hasNextLine()) {
            	
            	//make new PCB, store stuff from file into this PCB
            	tempPCB = new PCB();
               // tempPCB.ID = Integer.parseInt(sc.next());
//                tempPCB.arrivalOrder = Integer.parseInt(sc.next());
//                tempPCB.priority = Integer.parseInt(sc.next());
            	tempPCB.ID = sc.nextInt();
            	tempPCB.arrivalOrder = sc.nextInt();
            	tempPCB.priority = sc.nextInt();
            	
                
                //in file, there is a list of integers, store these into list of ints for IO/CPU burst times
//                while(sc.hasNextInt())
//                {
//                	tempPCB.burstSeq.add(sc.nextInt());
//                }
                
            }
        } catch (FileNotFoundException e) {
            // handle
        }
        //


        List<Integer> testList;
        testList = rng(5);
        for (int i:testList)
            System.out.println(testList.get(i));

        //System.out.println("The mean for this list is: " + mean(testList));
        //System.out.println("The standard deviation for this list is: " + stdev(testList));

        PCB newPCB = new PCB();
        newPCB.Print();
        System.out.println("test OS main function" );
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

