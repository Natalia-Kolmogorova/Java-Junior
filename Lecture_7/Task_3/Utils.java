package Task_3;

import Collections.ArrayList;
import Collections.List;

public class Utils {

    static Object find(Predicate predicate, List list) {
        for (int i = 0; i < list.size(); i++) {
            if (predicate.apply(list.get(i)) == true) {
                return list.get(i);
            }
        }

        return null;  // Если не нашли совпадений
    }


    static List filter(Predicate predicate, List list) {
        List newList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (predicate.apply(list.get(i)) == true) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }


    static List transform(Transformer trans, List list) {
        List newList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Object newObject = trans.change(list.get(i));
            newList.add(newObject);
        }
        return newList;
    }

}
