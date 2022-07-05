import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        // HashMap implements the Map interface (need import)
        // HashMap is similar to ArrayList, but with key-value pairs
        // stores objects, need to use Wrapper Class
        // ex: (name,email),(username,userID),(country,capital)

        HashMap<String,String> countries = new HashMap<String,String>();

        //add a key and value
        countries.put("Poland","Warsaw");
        countries.put("Germany","Berlin");
        countries.put("France","Paris");
        countries.put("Italy","Rome");
        countries.put("Russia","Moscow");

        System.out.println(countries);

        countries.remove("Russia");
        System.out.println(countries);

        System.out.println(countries.get("Poland"));

        System.out.println(countries.size());

        countries.replace("Poland","Krakow");
        System.out.println(countries);

        System.out.println(countries.containsKey("Spain"));
        System.out.println(countries.containsValue("Rome"));
        System.out.println("-----------------------------");

        for (String i : countries.keySet()) {
            System.out.print(i + "\t" + ": ");
            System.out.println(countries.get(i));
            
        }
        System.out.println("------------------------------");

        countries.clear();
        System.out.println(countries);


    }
}
