public abstract class Swim implements SwimBehavior{
    // Overrides the swim() method from the SwimBehavior interface
    @Override
    public void swim() {
        System.out.println("Swim Swim Swim");
        //Outputs that the duck can swim
    }
}