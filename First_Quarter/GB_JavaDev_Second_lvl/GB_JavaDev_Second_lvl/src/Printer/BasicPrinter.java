package Printer;

public abstract class  BasicPrinter implements Printer {
    @Override
    public void print(){
        System.out.println("Printing is preparing...");
        System.out.println();
        loadSpecification();
        loadEnviroment();
        System.out.println("Printer is ready...");
        System.out.println("Printing...");
        System.out.println("Status Done.");
    }

     protected abstract void loadEnviroment();
    private void loadSpecification(){
        System.out.println("Specification loading...");
        System.out.println("Specification loaded...");
        System.out.println("Status OK.");
    }
}
