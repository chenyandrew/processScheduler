import javafx.util.*;

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

    public void BubbleSort(){
    	

    }

    public Boolean cpuBusyBoolean(){
        return false;
    }


}
