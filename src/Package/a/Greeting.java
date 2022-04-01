package Package.a;

import static Package.b.Message.message;

public class Greeting {
    public static void main(String[] args) {
        message(); // imports from the other package

    }
}
