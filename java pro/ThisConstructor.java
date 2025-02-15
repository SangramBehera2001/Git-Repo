public class ThisConstructor {
    private String name;
    private int age;

    // Constructor with no parameters
    public ThisConstructor() {
        this("Unknown", 0); // Calls the constructor with two parameters
    }

    // Constructor with one parameter
    public ThisConstructor(String name) {
        this(name, 0); // Calls the constructor with two parameters
    }

    // Constructor with two parameters
    public ThisConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        ThisConstructor person1 = new ThisConstructor();
        ThisConstructor person2 = new ThisConstructor("Alice");
        ThisConstructor person3 = new ThisConstructor("Bob", 25);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
