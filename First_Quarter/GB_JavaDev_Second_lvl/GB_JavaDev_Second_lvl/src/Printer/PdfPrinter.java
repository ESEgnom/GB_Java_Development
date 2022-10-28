package Printer;

import java.io.File;

public class PdfPrinter extends BasicPrinter {
    private File file;
    @Override
    protected void loadEnviroment() {
        loadFile(file);
    }

    private void loadFile(File f){
        System.out.println("File loading...");
        System.out.println("File loaded...");
        System.out.println("Status OK.");
    }
}
