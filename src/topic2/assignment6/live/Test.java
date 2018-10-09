package topic2.assignment6.live;

import topic2.assignment6.music.Playable;
import topic2.assignment6.music.string.Veena;
import topic2.assignment6.music.wind.Saxophone;

/**
 * Created by e083028 on 8/28/2018.
 */
public class Test {
    public static void main(String ar[]) {
        Veena v = new Veena();
        Saxophone s = new Saxophone();

        v.play();
        s.play();

        Playable p = v;
        p.play();

        p = s;
        p.play();
    }
}
