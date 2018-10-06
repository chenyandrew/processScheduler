import java.io.*;
import java.util.*;

public class test {

    public static void main(String[] args) {

        File input = new File("C:\\Users\\Chen\\Documents\\fall2018\\operatingsystems - 6334\\processScheduler\\src\\input.txt");

//        BufferedReader br = new BufferedReader(new FileReader(input));
//        String st;
//        while ((st = br.readLine()) != null)
//        {
//            System.out.println(st);
//        }

        System.out.println(new File("C:\\Users\\Chen\\Documents\\fall2018\\operatingsystems - 6334\\processScheduler\\src\\input.txt").getAbsolutePath());
//
        try(Scanner sc = new Scanner(input);) {
            while (sc.hasNextLine()) {
                String line = sc.next();
                System.out.println(line);
            }
        }catch (FileNotFoundException e) {
            // handle
        }

        PCB newPCB = new PCB();
        newPCB.Print();
        System.out.println("test main function" );
        }
}
