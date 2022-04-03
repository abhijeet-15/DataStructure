package enumExamples;

public class Basic {
    enum Week implements A {
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //these are enum constants
        // public static and final
        //as it is final, you can't create child enums
        // type is week - where it is declared

        Week(){
            // this is not public or protected, only private or default
            // because we don't want to create more objects
            System.out.println("constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println(this + " says hello"); // this would be Monday
        }
    }

    public static void main(String[] args) {
        Week week = Week.Monday;

        for(Week day: Week.values()){
            System.out.println(day);
        }
        System.out.println(week.ordinal());
        week.hello();

    }
}
