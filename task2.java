// Вывести все простые числа от 1 до 1000
public class task2 {
    static void simpleNumber() {
        System.out.print("1" + " " + "2" + " " + "3" + " ");
        boolean flag = false;
        for (int i = 4; i < 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                }
            }

            if (flag == false) {
                System.out.print(i + " ");
            }
            flag = false;
        }
    }

    public static void main(String[] args) {
        simpleNumber();
    }
}
