package A2409Sep2024.Class01;

import java.io.IOException;

public class RuntimeDemo {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws IOException {
        System.out.println();
        //Runtime for checking the current running virtual machine
        Runtime r1 = Runtime.getRuntime();

        //current virtual machine process aviliable amount
        System.out.println(r1.availableProcessors());
        //virtual machine attempt to use memory(NOT USED MEMORY)
        System.out.println(r1.maxMemory()/1024/1024);
        //virtual machine able to use memory
        System.out.println(r1.totalMemory()/1024/1024);
        //virtual machine left to use memory
        System.out.println(r1.freeMemory()/1024/1024);

        //Total Memory = Used Memory + Free Memory


        //exec=> command   (same as run => cmd)
        Runtime.getRuntime().exec("notepad");//added throws IOException in this method
        Runtime.getRuntime().exec("shutdown -s -t 3600");
        Runtime.getRuntime().exec("shutdown -a");
        

        //exit virtual machine
        r1.exit(0);
        System.out.println("Test is the virtual machine stop");
        //System.exit(0); => Runtime.getRuntime().exit(status);

    }
}
