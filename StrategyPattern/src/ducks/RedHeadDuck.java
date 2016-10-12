package ducks;

import flyTypes.FlyWithWings;
import quackTypes.Silence;

/**
 * Created by amirzoya on 07/09/2016.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Silence();
    }
}
