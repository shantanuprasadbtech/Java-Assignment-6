// DecoyDuck class that extends the Duck class.
public class DecoyDuck extends Duck {
    DecoyDuck(){
        // Setting flyBehavior to FlyNoWay, which means the duck cannot fly.
        flyBehavior = new FlyNoWay() {
            @Override
            public void flyWithWings() {
            }
        };
        // Setting quackBehavior to MuteQuack, which means the duck cannot quack or make any noise.
        quackBehavior = new MuteQuack() {
            @Override
            public void quack() {
            }
            @Override
            public void squeak() {
            }
        };
        // Setting swimBehavior to Sink, which means the duck will sink in water and cannot float or swim.
        swimBehavior = new Sink() {
            @Override
            public void swim() {
            }
            @Override
            public void floating() {
            }
        };
    }
    // Overridden display method from the Duck class, which displays information about the DecoyDuck.
    @Override
    void display() {
        System.out.println("I am a Decoy Duck");
    }
}