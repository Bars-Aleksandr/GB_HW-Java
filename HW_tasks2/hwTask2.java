import java.util.logging.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class hwTask2 {
    public static String ArrayIntToString(int[] arr) {
        StringBuilder msg = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            msg.append(arr[i] + ", ");
        }
        return msg.toString();
    }

    public static int[] createArrayRND(int size) {
        int[] arr = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rnd.nextInt(size);
        }
        return arr;
    }

    public static void inputArray(String msg, int[] arr) {
        System.out.println(msg + ":");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int[] sortArrayBubble(int[] arr) {
        Logger logger = Logger.getLogger(hwTask2.class.getName());
        int temp = 0;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
                logger.info(ArrayIntToString(arr) + "interior FOR");
            }
            logger.info(ArrayIntToString(arr) + "external FOR");
        }
        return arr;
    }

    public static void main(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(hwTask2.class.getName());
        FileHandler fn = new FileHandler("log.txt");
        logger.addHandler(fn);
        // XMLFormatter xml = new XMLFormatter();
        SimpleFormatter xml = new SimpleFormatter();
        fn.setFormatter(xml);
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int sizeArr = console.nextInt();
        int[] myArr = createArrayRND(sizeArr);
        inputArray("Begin array not log", myArr);
        logger.info("Begin array");

        logger.info(ArrayIntToString(myArr));
        System.out.println();
        inputArray("End array", sortArrayBubble(myArr));
        System.out.println();

    }
}
