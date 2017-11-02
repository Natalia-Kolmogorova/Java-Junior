package Task_3;

import Collections.ArrayList;
import Collections.List;

public class Main {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("Наталья");
        list.add("Иван");
        list.add("Дмитрий");
        list.add("Сергей");

        // Создаем анонимный класс для predicate
        Predicate predicate = new Predicate() {
            @Override
            public boolean apply(Object obj) {
                boolean value = ((String) obj).length() == 7;
                return value;
            }
        };

        Object finedObject = Utils.find(predicate, list);
        System.out.println(finedObject);


        List newList1 = Utils.filter(predicate, list);
        System.out.println(newList1);


        // Создаем анонимный класс для transformer
        Transformer trans = new Transformer() {
            @Override
            public Object change(Object obj) {
                Object obj1 = obj.toString()+obj.toString();
                return obj1;
            }
        };

        List newList2 = Utils.transform(trans, list);
        System.out.println(newList2);
    }
}
