import java.util.*;

public class IODevice {

    public boolean BusyOrNot;

    public IODevice(ArrayList<Process> Wait_Queue){

    }

    // always pick one process from the Wait_Queue to execute

    public String execute(int IO_burst){
        BusyOrNot = true;
        // call Bubble Sort() for IO_burst times and then return "ready"
        return "ready";
    }

    public void BubbleSort(){

    }

}
