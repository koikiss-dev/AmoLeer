import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String name;
    private int age;
    private ArrayList<Roomie> roomies;
    private ArrayList<Friend> friends;
    private ArrayList<Exemplary> exemplaries;

    User(){
        this.roomies = new ArrayList<>();
        this.friends = new ArrayList<>();
        this.exemplaries = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre: ");
        this.name = scanner.nextLine();
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Edad: ");
        this.age = scanner.nextInt();
    }

    public void setRoomies(){
        Roomie roomie = new Roomie();
        roomie.setName();
        roomie.setAge();
        roomies.add(roomie);
    }
    public ArrayList<Roomie> getRoomies(){
        return roomies;
    }

}
