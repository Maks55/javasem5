import java.util.Scanner;


public class Main {
    public static void main (String[] args) {
        FirstTaskPhonebook oneTask = new FirstTaskPhonebook();
        Scanner in = new Scanner(System.in);
        System.out.println("Выполнение первой задачи\nВведите фамилию для поиска в базе");
        oneTask.phoneMap(in.next());

        SecondTaskReapidNames twoTask = new SecondTaskReapidNames();
        System.out.println("Выполнение второй задачи");
        twoTask.reapidNames();

        // ThirdTaskRomesNumbers threeTask = new ThirdTaskRomesNumbers();
        // System.out.println("Выполнение третьей задачи\nВведите римскую цифру для конвентирования:");
        // Scanner in = new Scanner(System.in);
        // threeTask.convertRome(in.next());
    }
}