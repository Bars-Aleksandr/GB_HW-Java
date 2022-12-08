import java.util.Scanner;

import java.util.logging.*;
import java.io.File;
import java.io.IOException;
import java.text.Format;

import javax.lang.model.element.VariableElement;

// Реализовать простой калькулятор с логированием
public class calcLog {
    public static Logger logger = Logger.getLogger(calcLog.class.getName());

    static float sum(float a, float b) {
        return a + b;
    }

    static float dif(float a, float b) {
        return a - b;
    }

    static float multi(float a, float b) {
        return a * b;
    }

    static float div(float a, float b) {
        return a / b;

    }

    // public static void createLogging() {
    // // Logger logger = Logger.getLogger(hwTask2.class.getName());
    // FileHandler fn = new FileHandler("log.txt");
    // logger.addHandler(fn);
    // // XMLFormatter xml = new XMLFormatter();
    // SimpleFormatter xml = new SimpleFormatter();
    // fn.setFormatter(xml);
    // }

    public static void logAction(int flag) {
        switch (flag) {
            case 1:
                logger.info("Select an action: - summa");
                break;
            case 2:
                logger.info("Select an action: - difference");
                break;
            case 3:
                logger.info("Select an action: - multiplication");
                break;
            case 4:
                logger.info("Select an action: - division");
                break;
            default:
                logger.info("Error - not action");
                break;
        }
    };

    public static void main(String[] args) throws SecurityException, IOException {
        // createLogging();
        FileHandler fn = new FileHandler("log.txt");
        logger.addHandler(fn);
        // XMLFormatter xml = new XMLFormatter();
        SimpleFormatter xml = new SimpleFormatter();
        fn.setFormatter(xml);
        int repeat = 1;
        Scanner iScanner = new Scanner(System.in);
        float a = 0;
        float b = 0;
        int action = 0;
        while (repeat == 1) {
            System.out.print("Enter the first numbers \n");
            a = iScanner.nextFloat();
            logger.info("Enter the first numbers : " + Float.toString(a));

            System.out.print("Enter the second numbers \n");
            b = iScanner.nextFloat();
            logger.info("Enter the second numbers : " + Float.toString(b));

            System.out.println("Select an action");
            System.out.println("1 - summa");
            System.out.println("2 - difference");
            System.out.println("3 - multiplication");
            System.out.println("4 - division");
            action = iScanner.nextInt();
            logAction(action);

            switch (action) {
                case 1:
                    System.out.printf("%.2f + %.2f = %.2f \n ", a, b, sum(a, b));
                    logger.info(Float.toString(a) + " + " + Float.toString(b) + " = " + Float.toString(sum(a, b)));
                    break;
                case 2:
                    System.out.printf("%.2f - %.2f = %.2f \n ", a, b, dif(a, b));
                    logger.info(Float.toString(a) + " - " + Float.toString(b) + " = " + Float.toString(dif(a, b)));
                    break;
                case 3:
                    System.out.printf("%.2f * %.2f = %.2f \n ", a, b, multi(a, b));
                    logger.info(Float.toString(a) + " * " + Float.toString(b) + " = " + Float.toString(multi(a, b)));
                    break;
                case 4:
                    if (b != 0) {
                        System.out.printf("%.2f / %.2f = %.2f \n ", a, b, div(a, b));
                        logger.info(Float.toString(a) + " / " + Float.toString(b) + " = " + Float.toString(div(a, b)));
                    } else {
                        System.out.println("Error - division by zero");
                        logger.info("Error - division by zero");
                    }
                    break;
                default:
                    System.out.println("Error - not action");
                    logger.info("Error - not action");
                    break;
            }
            System.out.println("Want to repeat, Yes - 1, No - 0");
            repeat = iScanner.nextInt();
            if (repeat == 1) {
                logger.info("User continued");

            } else {
                logger.info("User finished");
            }
        }
        iScanner.close();
    }

}
