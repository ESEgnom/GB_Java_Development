public class Cycles {

    public static void main(String[] args) {
        System.out.println("SWITCH");
        System.out.println(optSeason(10));

        System.out.println();
        System.out.println("WHILE");
        doWhileLoopDemo();

        System.out.println();
        System.out.println("DO_WHILE");
        doDoWhileLoopDemo();

        System.out.println();
        System.out.println("FOR");
        doForLoopDemo();
    }

    public static String optSeason(int month){

        switch (month){
            case 12, 1, 2:{
                return "Winter";
            }
            case 3, 4, 5:{
                return "Spring";
            }
            case 6, 7, 8:{
                return "Summer";
            }
            case 9, 10, 11:{
                return "Fall";
            }
            default:{
                return "Bogus Season";
            }
        }
    }

    public static void doWhileLoopDemo(){
        int fin = 0;
        int i = 0;
        while (i < 10){
            System.out.print("["+ i+ "]");
            fin += 10;
            i++;
        }
        System.out.println("Fin: "+ fin);
    }

    public static void doDoWhileLoopDemo(){
        int fin = 0;
        int i = 10;

        do {
            System.out.print("["+ i+ "]");
            fin += 10;
            i++;
        } while (i < 10);
        System.out.println("Fin: "+ fin);
    }

    public static void doForLoopDemo(){
        int fin = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("["+ i+ "]");
            fin +=10;
        }
        System.out.println("Fin: "+ fin);
    }
}