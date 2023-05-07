//Abstract class implementing FlyBehavior for ducks that can fly
public abstract class FlyWithWings implements FlyBehavior {
    @Override
    public void flyWithWings() {
        // Print "I can fly with wings to show flying behavior of duck
        System.out.println("I can fly with wings!");
    }
}
