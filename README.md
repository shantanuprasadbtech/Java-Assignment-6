# Java-Assignment-6

This java code emulates ducks and their behavior

Classes 

1. Duck
An abstract class representing a generic duck. It contains the following behaviors:

flyBehavior - an instance variable that refers to an object that implements the FlyBehavior interface.
quackBehavior - an instance variable that refers to an object that implements the QuackBehavior interface.
swimBehavior - an instance variable that refers to an object that implements the SwimBehavior interface.

Duck also has the following methods:

performFly() - calls the fly() method on the flyBehavior object to perform the duck's flying behavior.
performQuack() - calls the quack() method on the quackBehavior object to perform the duck's quacking behavior.
performSwim() - calls the swim() method on the swimBehavior object to perform the duck's swimming behavior.
setFlyBehavior() - allows setting the duck's fly behavior at runtime.
setQuackBehavior() - allows setting the duck's quack behavior at runtime.
setSwimBehavior() - allows setting the duck's swim behavior at runtime.
display() - an abstract method that displays the duck's specific characteristics.

2. MallardDuck

A subclass of Duck that represents a Mallard Duck. It sets its fly, quack, and swim behaviors to specific implementations of the FlyBehavior, QuackBehavior, and SwimBehavior interfaces, respectively.

3. RedheadDuck

A subclass of Duck that represents a Redhead Duck. It sets its fly, quack, and swim behaviors to specific implementations of the FlyBehavior, QuackBehavior, and SwimBehavior interfaces, respectively.

4. RubberDuck

A subclass of Duck that represents a Rubber Duck. It sets its fly, quack, and swim behaviors to specific implementations of the FlyBehavior, QuackBehavior, and SwimBehavior interfaces, respectively.

Interfaces

1. FlyBehavior

An interface representing flying behavior. It has one method:

fly() - a method that performs the flying behavior of an object.

2. QuackBehavior

An interface representing quacking behavior. It has three methods:

quack() - a method that performs the quacking behavior of an object.
squeak() - a method that performs the squeaking behavior of an object.
muteQuack() - a method that performs the muted quacking behavior of an object.

3. SwimBehavior
An interface representing swimming behavior. It has three methods:

swim() - a method that performs the swimming behavior of an object.
floating() - a method that performs the floating behavior of an object.
sink() - a method that performs the sinking behavior of an object.

Abstract classes

1. FlyNoWay
An implementation of the FlyBehavior interface that represents a duck that cannot fly.

2. FlyWithWings
An implementation of the FlyBehavior interface that represents a duck that can fly with its wings.

3. MuteQuack
An implementation of the QuackBehavior interface that represents a duck that is on mute and cannot quack.

4. Quack
An implementation of the QuackBehavior interface that represents a duck that can quack.

5. Sink
An implementation of the SwimBehavior interface that represents a duck that will sink.
