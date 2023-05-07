public class RedheadDuck extends Duck{
    // Constructor
    RedheadDuck(){
        // Set the RedheadDuck fly behavior as FlyWithWings
        flyBehavior= new FlyWithWings() {
            @Override
            public void flyNoWay() {
            }
        };
        // Set the RedheadDuck quack behavior as Squeak
        quackBehavior= new Squeak() {
            @Override
            public void quack() {
            }
            @Override
            public void muteQuack() {
            }
        };
        // Set the RedheadDuck's swim behavior as Swim
        swimBehavior= new Swim() {
            @Override
            public void floating() {
            }
            @Override
            public void sink() {
            }
        };
    }
    // Override the display method to print the RedheadDuck's display message
    @Override
    void display() {
        System.out.println("I am a Redhead Duck");
    }
}