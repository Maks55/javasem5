/* Пусть дан список сотрудников:Иван Иванов ( и остальные, полный текст дз будет на платформе)
 Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
 Отсортировать по убыванию популярности. */

import java.util.ArrayList;
import java.util.HashMap;

public class SecondTaskReapidNames {
    public void reapidNames() {
        ArrayList names = new ArrayList();
        names.add("Иванов Иван Иванович");
        names.add("Сидоров Петр Петрович");
        names.add("Иванов Иван Иванович");
        names.add("Почтальон Печкин");
        names.add("Иванов Иван Иванович");
        names.add("Иванов Иван Иванович");
        names.add("Петров Иван Сидорович");
        names.add("Иванов Иван Иванович");
        names.add("Сидоров Петр Петрович");
        names.add("Сидоров Петр Петрович");
        names.add("Сидоров Петр Петрович");
        names.add("Почтальон Печкин");
        names.add("Сидоров Петр Петрович");
        names.add("Иванов Иван Иванович");

        HashMap<Object, Integer> countName = new HashMap<>();
        for (int i=0; i<names.size(); i++) {
            if (countName.containsKey(names.get(i))) {
                int count = countName.get(names.get(i)) + 1;
                countName.put(names.get(i), count);
            }
            else {
                countName.put(names.get(i), 1);
            }
        }
        System.out.println(names);
        countName.entrySet().stream().sorted(HashMap.Entry.<Object, Integer>comparingByValue().reversed()).forEach(System.out::println);
    }
}