package hw_java2;
import java.util.Arrays;

public class first {
    public static void main(String[] args) {

        /*Дана строка sql-запроса "select * from students where ". 
        Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
        Если значение null, то параметр не должен попадать в запрос.
        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} */

        String str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        str = str.substring(1, str.length()-1).replaceAll(":", " ").replaceAll("\"", "");
        
        String[] new_str = str.split(",");
        String[] name = new_str[0].split(" ");
        String[] country = new_str[1].split(" ");
        String[] city = new_str[2].split(" ");
        String[] age = new_str[3].split(" ");

        StringBuilder result = new StringBuilder();

        String word = "null";

        if (!Arrays.asList(name).contains(word)){
            result.append(name[0] + "='" + name[1] + "'");
        }
        if (!Arrays.asList(country).contains(word)){
            result.append(", " + country[1] + "='" + country[2] + "'");
        }
        if (!Arrays.asList(city).contains(word)){
            result.append(", " + city[1] + "='" + city[2] + "'");
        }
        if (!Arrays.asList(age).contains(word)){
            result.append(", " + age[1] + "='" + age[2] + "'");
        }
        
        System.out.println(result);
    }

}
