package flyTypes;

import behaviors.FlyBehavior;

/**
 * Created by amirzoya on 07/09/2016.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm fling with my wings yoohoooooo!!!!");
    }
}
