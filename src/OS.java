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
        File input = new File("C:\\Users\\Chen\\Documents\\fall2018\\operatingsystems - 6334\\processScheduler\\src\\input.txt");
        //

        // use scanner from java.util library to read through each line
        // it breaks up one line into 4 lines, it looks like it  splits the empty strings
        try(Scanner sc = new Scanner(input)) {
            int i = 0;
            while (sc.hasNextLine()) {
                String line = sc.next();
                i += 1;

                // use mod(4) to see check every 4th element of each line for the input of CPU/IO burst
                if ((i%4) == 0) {
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            // handle
        }
        //


        PCB newPCB = new PCB();
        newPCB.Print();
        System.out.println("test OS main function" );
    }

}

