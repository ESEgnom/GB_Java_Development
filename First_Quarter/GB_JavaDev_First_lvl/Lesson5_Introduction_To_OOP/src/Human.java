/**
 * public - visible everywhere
 * private - visible inside class  only
 */

public class Human {
    private int id;
    private String name;

    public Human() {
    }

    public Human(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void move(){
        System.out.printf("%s with ID %s is moving...%n", name, id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
