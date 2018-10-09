package topic5.assignment3.automobile.twoWheeler;

import topic5.assignment3.automobile.Vehicle;

/**
 * Created by e083028 on 9/4/2018.
 */
public class Hero extends Vehicle{

    @Override
    public String modelName() {
        return "Hero";
    }

    @Override
    public String registrationNumber() {
        return "01010101";
    }

    @Override
    public String ownerName() {
        return "HeroOwner";
    }

    public int speed() {
        return 90;
    }

    public void radio() {
        System.out.println("Radio is playing");
    }
}
