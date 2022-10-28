public class Main {
    public static void main(String[] args) {
        doExceptionCatch();
    }

    static void doExceptionCatch(){
        causeNumberFormatException();
    }

    static void causeNumberFormatException(){
        printInt("1");
        printInt("1a");
        printInt("2");
    }

    static void printInt(String value){
        try {
            System.out.println(parseInt(value));
        }catch(CustomArithmeticalException e){
            e.printStackTrace();
        }
    }

    static int parseInt(String value) throws CustomArithmeticalException{
        try{
            return Integer.parseInt(value);
        }catch(RuntimeException e){
            throw new CustomArithmeticalException("String value is not parseble integer.", e);
        }
    }
}
