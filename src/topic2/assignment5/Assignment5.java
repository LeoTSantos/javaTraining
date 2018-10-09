package topic2.assignment5;

/**
 * Created by e083028 on 8/28/2018.
 */
public class Assignment5 {
    public static void main(String ar[])
    {
        Instrument[] inst = new Instrument[10];

        inst[0] = new Piano();
        inst[0].instrumentName="Piano";
        inst[1] = new Flute();
        inst[1].instrumentName="Flute";
        inst[2] = new Guitar();
        inst[2].instrumentName="Guitar";
        inst[3] = new Flute();
        inst[3].instrumentName="Flute";
        inst[4] = new Guitar();
        inst[4].instrumentName="Guitar";
        inst[5] = new Piano();
        inst[5].instrumentName="Piano";
        inst[6] = new Guitar();
        inst[6].instrumentName="Guitar";
        inst[7] = new Guitar();
        inst[7].instrumentName="Guitar";
        inst[8] = new Flute();
        inst[8].instrumentName="Flute";
        inst[9] = new Piano();
        inst[9].instrumentName="Piano";

        for (Instrument i :inst) {
            i.play();
        }
    }
}
