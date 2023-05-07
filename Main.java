/*Name: Smriti Sinha
PRN: 21070126090
Branch: AI/ML-B1
 */
// This is the main class that contains the main method.
public class Main {
    public static void main(String[] args) {
        // Creating an instance of MallardDuck and calling its methods to perform actions.
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFlyWithWings();
        mallardDuck.performSwim();

        System.out.println("-------------------------------");

        // Creating an instance of RubberDuck and calling its methods to perform actions.
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performMuteQuack();
        rubberDuck.performFlyNoWay();
        rubberDuck.performFloating();

        System.out.println("-------------------------------");

        // Creating an instance of DecoyDuck and calling its methods to perform actions.
        DecoyDuck decoyDuck= new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performMuteQuack();
        decoyDuck.performFlyNoWay();
        decoyDuck.performSink();

        System.out.println("-------------------------------");

        // Creating an instance of RedheadDuck and calling its methods to perform actions.
        RedheadDuck redheadDuck=new RedheadDuck();
        redheadDuck.display();
        redheadDuck.performSqueak();
        redheadDuck.performFlyWithWings();
        redheadDuck.performSwim();

        System.out.println("-------------------------------");
    }
}