import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest2 {
    public static void main(String[] args) {
        System.out.println("J Collections");
        //tworzenie pustej listy
        List<String> fruits=new ArrayList<>();
        //sprawdzenie rozmiaru
        System.out.println("Rozmiar listy: "+ fruits.size());
        //dodawanie
        fruits.add("Jabłko");
        fruits.add("Gruszka");
        fruits.add("Pomidor");
        fruits.add("Ogórek");
        fruits.add("Mandarynka");
        System.out.println(fruits);
        //wyrażenie lambda
//        fruits.forEach(fru->System.out.println(fru));
//        //to samo for each
//        for (String fru: fruits){
//            System.out.println(fru);
//        }
//modyfikacja
        fruits.add(1,"limonka");
        System.out.println(fruits.get(1));
        System.out.println(fruits);
        fruits.remove("Gruszka");
        System.out.println(fruits);
        fruits.remove(0);
        System.out.println(fruits);
        System.out.println(fruits.get(0));

        //inicjacja listy wartościami początkowymi
        List<String> brands=new ArrayList(Arrays.asList("BMW", "Audi", "VM", "Toyota"));
            brands.add("Porsche");
        System.out.println(brands);
        }
}
