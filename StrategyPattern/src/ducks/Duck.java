package ducks;

import behaviors.FlyBehavior;
import behaviors.QuackBehavior;

/**
 * Created by amirzoya on 07/09/2016.
 */
public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void display(){}

    public void swim(){}

    public void setFlyBehavior(FlyBehavior newFlyBehavior){
        flyBehavior = newFlyBehavior;
    }

    public void setQuackBehavior(QuackBehavior newQuackBehavior){
        quackBehavior = newQuackBehavior;
    }
}
