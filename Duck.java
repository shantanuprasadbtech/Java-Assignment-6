public abstract class Duck {
    // Instance variables for FlyBehavior, QuackBehavior. SwimBehavior
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;
    // Abstract method for displaying duck
    abstract void display();
    // Setter methods for FlyBehavior, QuackBehavior SwimBehavior
    public void setFlyBehavior(FlyBehavior fb) {flyBehavior = fb;}
    public void setQuackBehavior(QuackBehavior qb) {quackBehavior = qb;}
    public void setSwimBehavior(SwimBehavior sb){swimBehavior = sb;}
    // Methods for performing specific behaviors
    public void performQuack() {quackBehavior.quack();}
    public void performSqueak(){quackBehavior.squeak();}
    public void performMuteQuack(){quackBehavior.muteQuack();}
    public void performFlyWithWings(){flyBehavior.flyWithWings();}
    public void performFlyNoWay(){flyBehavior.flyNoWay();}
    public void performSwim(){swimBehavior.swim();}
    public void performFloating(){swimBehavior.floating();}
    public void performSink(){swimBehavior.sink();}
}