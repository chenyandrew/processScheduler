public class CPU {

    public boolean cpuIsBusy;
    public int PC; //CPU has only one register PC
    public int timeSlice;

    public CPU(int settimeslice)
    {
        timeSlice = settimeslice;
        cpuIsBusy = false;
    }

    public void execute(Process P)
    {

    }

}
