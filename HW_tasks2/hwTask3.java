// аписать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: 
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:

// Студент Иванов получил 5 по предмету Математика.

// Студент Петрова получил 4 по предмету Информатика.

// Студент Краснов получил 5 по предмету Физика.

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import java.nio.file.Paths;
import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class hwTask3 {
    public static void jsonLineToStr(String jString) {
        StringBuilder resultStr = new StringBuilder();
        String[] separStr = jString.split("\"");
        Map<String, String> jsonToMap = new HashMap();
        int j = 0;
        boolean case1 = false;
        boolean case2 = false;
        boolean case3 = false;
        for (String i : separStr) {
            j++;
            switch (i.toLowerCase()) {
                case "фамилия":
                    jsonToMap.put(i, separStr[j + 1]);
                    case1 = true;
                    break;
                case "оценка":
                    jsonToMap.put(i, separStr[j + 1]);
                    case2 = true;
                    break;
                case "предмет":
                    jsonToMap.put(i, separStr[j + 1]);
                    case3 = true;
                    break;
            }
            // Студент [фамилия] получил [оценка] по предмету [предмет]
            if (case1 && case2 && case3) {
                resultStr.append("Студент " + jsonToMap.get("фамилия") + " получил " +
                        jsonToMap.get("оценка") + " по предмету " + jsonToMap.get("предмет"));
                System.out.println(resultStr);
                case1 = case2 = case3 = false;
                resultStr.setLength(0);
            }

        }

    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(Paths.get("inTask3.txt"), StandardCharsets.UTF_8.name());
        String jsonLine = scanner.useDelimiter("\\A").next();
        jsonLineToStr(jsonLine);
        scanner.close();
    }
}
