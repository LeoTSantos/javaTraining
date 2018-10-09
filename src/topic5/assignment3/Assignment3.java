package topic5.assignment3;

import topic5.assignment3.automobile.twoWheeler.Hero;
import topic5.assignment3.automobile.twoWheeler.Honda;

/**
 * Created by e083028 on 9/4/2018.
 */
public class Assignment3 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Honda honda = new Honda();

        System.out.print(hero.modelName() + "\n" +
                hero.registrationNumber() + "\n" +
                hero.ownerName() + "\n" +
                hero.speed() + "\n");
        hero.radio();

        System.out.print(honda.modelName() + "\n" +
                honda.registrationNumber() + "\n" +
                honda.ownerName() + "\n" +
                honda.speed() + "\n");
        honda.cdplayer();
    }
}
