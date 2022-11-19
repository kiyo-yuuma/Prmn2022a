package lecture05;

import java.awt.*;
import java.util.ArrayList;

public class Exercise5_7 {

    public static void main(String[] args) {
        ArrayList<Insect> list = new ArrayList<>();

        Insect insect = new Insect();
        Insect butterfly = new Butterfly();
        Insect locust = new Locust();
        Insect swallowButterfly = new SwallowtailButterfly();

        list.add(insect);
        list.add(butterfly);
        list.add(locust);
        list.add(swallowButterfly);

        for (Insect i : list) {
            i.move();
        }
    }
}
