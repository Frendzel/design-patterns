package pl.sda.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

//TODO please take a look here:
//TODO https://sourcemaking.com/design_patterns/iterator/java/1
class IntegerBox {
    private final List<Integer> list = new ArrayList<>();

    public void add(int in) {
        list.add(in);
    }

    public List getData() {
        return list;
    }
}
