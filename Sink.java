public abstract class Sink implements SwimBehavior{
    // Overrides the sink() method from the SwimBehavior interface
    @Override
    public void sink() {
        // Prints a message indicating that the duck will sink
        System.out.println("I will sink");
    }
}