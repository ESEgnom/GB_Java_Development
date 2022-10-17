/**
 * Практическое задание:
 * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * Конструктор класса должен заполнять эти поля при создании объекта.
 * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * Создать массив из 5 сотрудников. Пример:
 * Person[] persArray = new Person[5]; //
 * Вначале объявляем массив объектов persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); //
 * потом для каждой ячейки массива задаем объект persArray[1] = new Person(...); ... persArray[4] = new Person(...);
 * С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */
package at_home;

public class Employee {
    private String fullName;
    private int age;
    private String position;
    private int salary;
    private String email;
    private long telNumber;

    public Employee(String fullName, int age, String position, int salary, String email, long telNumber){
        this.fullName = fullName;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.email = email;
        this.telNumber = telNumber;
    }

    public void printInfo(){
        System.out.printf("ФИО: %s%nВщзраст: %s%nДолжность: %s%nЗарплата: %s%nEmail: %s%nНомер телефона: +7%s%n",
                            fullName, age, position, salary, email, telNumber);
        System.out.println();
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", telNumber=" + telNumber +
                '}';
    }
}
