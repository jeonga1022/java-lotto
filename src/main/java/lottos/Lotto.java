package lottos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {

    private List<Integer> elements;

    public Lotto() {
        this.elements = getRandomNumbers();
    }

    private List<Integer> getRandomNumbers() {
        List<Integer> randoms = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int number = (int) (Math.random() * 45) + 1;
            randoms.add(number);
        }
        return randoms;
    }

    public List<Integer> getElements() {
        return Collections.unmodifiableList(elements);
    }
}
