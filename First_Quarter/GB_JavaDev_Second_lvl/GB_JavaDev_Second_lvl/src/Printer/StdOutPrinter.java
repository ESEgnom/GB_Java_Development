package Printer;

import java.io.OutputStream;

public class StdOutPrinter extends BasicPrinter {

    private OutputStream out;


    @Override
    protected void loadEnviroment() {
        loadStream(out);
    }

    private void loadStream(OutputStream out){
        System.out.println("Stream is loading...");
        System.out.println("Stream loaded...");
        System.out.println("Status OK.");
    }
}
