package StaticExample;

public class Main {
    public static void main(String[] args) {
        Human abhijeet = new Human(27,"Abhijeet Singh",100000000,false);
        System.out.println(abhijeet.population);
        Human sushmita = new Human(29,"Sushmita Singh",100000000,true);
        System.out.println(sushmita.population);
        System.out.println(Human.population);
        //greeting() error because non-static methods cannot be referenced from a static context
    }

    void greeting(){
        System.out.println("Can this be referenced?");
    }

    static void message1(){
        //System.out.println(this.greeting());
        Main m = new Main();
        //System.out.println(m.message(););
    }

    void message(){
        greeting(); // allowed because to call message, you will create the object anyhow
    }
}
