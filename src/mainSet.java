import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class mainSet {
    public static void main(String[] args) {
        //deklaracja zbioru
        Set<String> pesels=new HashSet<>();
        Set<String> pesels_bydgoszcz=new HashSet<>(Arrays.asList("0000","1234","9999","8888"));
        System.out.println(pesels.add("1264"));
        System.out.println(pesels.add("1234"));
        System.out.println(pesels.add("1288"));
        System.out.println(pesels.add("1234"));
        System.out.println(pesels.add("1274"));
        System.out.println(pesels);
        //sprawdzenie przynależności
//        System.out.println(pesels.contains("1234"));
//        System.out.println(pesels.contains("1994"));
//        pesels.remove("1234");
//        System.out.println(pesels);

        //suma zbiorów
        Set<String> temp=new HashSet<>();
        temp.addAll(pesels);
        temp.addAll(pesels_bydgoszcz);
        System.out.println("po zsumowaniu"+pesels+" + "+pesels_bydgoszcz+"="+temp);
        temp.clear();
        temp.addAll(pesels);
        temp.removeAll(pesels_bydgoszcz);
        System.out.println("po różnicy"+pesels+" - "+pesels_bydgoszcz+"="+temp);
        temp.clear();
        temp.addAll(pesels);
        temp.retainAll(pesels_bydgoszcz);
        System.out.println("po częsci wpólnej"+pesels+" * "+pesels_bydgoszcz+"="+temp);





    }
}
