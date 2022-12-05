import java.text.Format;
import java.util.HashMap;
import java.util.Map;

/**
 * hwTask1
 * Дана строка sql-запроса "select * from students where ". Сформируйте часть
 * WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены
 * ниже в виде json строки.
 * Если значение null, то параметр не должен попадать в запрос.
 * 
 * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia",
 * "city":"Moscow", "age":"null"}
 */

public class hwTask1 {
    public static void main(String[] args) {
        StringBuilder resultQuery = new StringBuilder();
        String beginQuery = "select * from students where ";
        Map<String, String> filterJson = new HashMap();
        filterJson.put("name", "Ivanov");
        filterJson.put("country", "Russia");
        filterJson.put("city", "Moscow");
        filterJson.put("age", null);
        resultQuery.append(beginQuery);
        for (String key : filterJson.keySet()) {
            if (filterJson.get(key) != null) {
                resultQuery.append(String.format("%s = '%s' and ", key, filterJson.get(key)));
            }
            // System.out.println("key" + "-" + key + " " + "filterJson" + "-" +
            // filterJson.get(key));
        }
        resultQuery.delete(resultQuery.length() - 4, resultQuery.length());
        System.out.println(resultQuery);
    }
}