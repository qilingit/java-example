package collection;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@NoArgsConstructor
public class IteratorDemo {
    List<String> list = new ArrayList<>();

    public boolean testHasNext(List<String> list)
    {
        Iterator<String> iterator = list.iterator();
        return iterator.hasNext();
    }
}
