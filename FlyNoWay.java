// Abstract class FlyNoWay implementing FlyBehavior interface and provides the non flying behavior for ducks
public abstract class FlyNoWay implements FlyBehavior{
    // Implementation of the flyNoWay() method declared in FlyBehavior interface - print nonflying behavior of ducks
    @Override
    public void flyNoWay() {
        System.out.println("I cannot fly...");
    }
}
