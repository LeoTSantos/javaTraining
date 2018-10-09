package topic5.assignment3.automobile.twoWheeler;

import topic5.assignment3.automobile.Vehicle;

/**
 * Created by e083028 on 9/4/2018.
 */
public class Honda extends Vehicle{
    @Override
    public String modelName() {
        return "Honda";
    }

    @Override
    public String registrationNumber() {
        return "02020202";
    }

    @Override
    public String ownerName() {
        return "HondaOwner";
    }

    public int speed() {
        return 120;
    }

    public void cdplayer() {
        System.out.println("CD is playing");
    }
}
