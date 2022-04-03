package cloning;

public class Main implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human abhijeet = new Human(27,"Abhijeet");
        Human twin = new Human(abhijeet); //problem is new takes time
        // we can use clone as we are making copy

       Human twin1 = (Human) abhijeet.clone();
    }

}
