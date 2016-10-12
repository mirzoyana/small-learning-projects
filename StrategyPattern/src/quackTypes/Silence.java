package quackTypes;

import behaviors.QuackBehavior;

/**
 * Created by amirzoya on 07/09/2016.
 */
public class Silence implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Oughhhhh, I'am not quacking :(");
    }
}
