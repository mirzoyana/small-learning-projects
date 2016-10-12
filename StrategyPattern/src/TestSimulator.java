import behaviors.FlyBehavior;
import behaviors.QuackBehavior;
import ducks.Duck;
import ducks.RedHeadDuck;
import flyTypes.NoFly;
import quackTypes.Quack;
import quackTypes.Silence;

/**
 * Created by amirzoya on 07/09/2016.
 */
public class TestSimulator {

    public static void main(String[] args) {

        Duck myTestDuck = new RedHeadDuck();
        myTestDuck.performFly();
        myTestDuck.performQuack();
        //Now I don't want to fly, but I really want to quack and quack

        FlyBehavior newFlyBehavior = new NoFly();
        QuackBehavior newQuackBehavior = new Quack();

        myTestDuck.setFlyBehavior(newFlyBehavior);
        myTestDuck.setQuackBehavior(newQuackBehavior);

        System.out.println("-------Everything is gonna change babe-------");

        myTestDuck.performFly();
        myTestDuck.performQuack();
    }
}
