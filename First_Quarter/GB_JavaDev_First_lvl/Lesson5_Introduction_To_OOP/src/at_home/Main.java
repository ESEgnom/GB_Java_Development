package at_home;

public class Main {
    public static void main(String[] args) {
        Employee[] person = new Employee[4];
        person[0] = new Employee("Ерыкалин Станислав Евгеньевич",
                32,
                "Менеджер по продажам",
                60000,
                "gnomese@gmail.com",
                9658402309l);
        person[1] = new Employee("Пафнутьев Анатолий Семенович",
                56, "Охраник", 19000, "pafansem56@gmail.com", 9375612658l);
        person[2] = new Employee("Пафнутьева Анатонина Вячеславовна",
                45, "Уборщица", 14000, "pafanvyach@gmail.com", 9375612659l);
        person[3] = new Employee("Пафнутьева Алефтина Семеновна",
                50, "Кассир", 32000, "pafalsem50@gmail.com", 9377074433l);
        person[3] = new Employee("Прошка",
                16, "Стажер", 3000, "Отсутствует", 9371234567l);

        printInfoEmployee(person, 40);
    }

    public static void printInfoEmployee(Employee[] array, int ageValue) {
        for (int i = 0; i < array.length; i++) {
            if(array[i].getAge() > ageValue){
                array[i].printInfo();
            }
        }
    }
}
