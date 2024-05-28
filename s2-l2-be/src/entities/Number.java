package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Number {
    int num;

    public Number(int num) {
        this.num = num;
    }

    public List<Integer> numeriRandom(int num) {
        Random random = new Random();
        List<Integer> numeriCasuali = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            numeriCasuali.add(random.nextInt(101));
        }
        return numeriCasuali;
    }

}
