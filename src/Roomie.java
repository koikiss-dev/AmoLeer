import java.util.Scanner;

class Roomie {
    private String name;
    private int age;

    public Roomie() {
    }

    public String getName() {
        return name;
    }

    public void setName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del roomie: ");
        this.name = scanner.nextLine();
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Edad del roomie: ");
        this.age = scanner.nextInt();
    }
}