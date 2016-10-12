package flyTypes;

import behaviors.FlyBehavior;

/**
 * Created by amirzoya on 07/09/2016.
 */
public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Keep calm and don't fly!!");
    }
}
