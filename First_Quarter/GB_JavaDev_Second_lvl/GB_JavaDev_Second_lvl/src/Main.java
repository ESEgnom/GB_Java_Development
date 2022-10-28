import Printer.PdfPrinter;
import Printer.StdOutPrinter;

public class Main {
    public static void main(String[] args) {

    }
    public static void doEnumDemo(){



    }

    public static void doInterfaceDemo(){
        PdfPrinter pdfPrinter = new PdfPrinter();
        pdfPrinter.print();
        StdOutPrinter stdOutPrinter = new StdOutPrinter();
        stdOutPrinter.print();
    }
}
