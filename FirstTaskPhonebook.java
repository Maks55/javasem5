/* Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек 
может иметь несколько телефонов. */

import java.util.HashMap;

public class FirstTaskPhonebook {
    public void phoneMap(Object name) {
        HashMap<Object, Object> phoneMap = new HashMap<>();
        phoneMap.put("+7(988)7852369", "Ivanov");
        phoneMap.put("+7(985)7652669", "Petrov");
        phoneMap.put("+7(988)7852369", "Sidorov");
        phoneMap.put("+7(788)7852369", "Ivanov");
        phoneMap.put("+7(888)7852449", "Ivanov");
        phoneMap.put("+7(958)7844369", "Petrov");
        phoneMap.put("+7(989)7858889", "Ivanov");
        phoneMap.put("+7(987)7877369", "Sidorov");

        for(HashMap.Entry<Object, Object> phoneMapEntry : phoneMap.entrySet()) {
            if (phoneMapEntry.getValue().equals(name)) {
                System.out.println(phoneMapEntry.getKey());
            }
        }
    }
}