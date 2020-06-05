package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExercicioTreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> arvoreNumerica = new TreeSet<>();

        arvoreNumerica.add(8);
        arvoreNumerica.add(88);
        arvoreNumerica.add(20);
        arvoreNumerica.add(44);
        arvoreNumerica.add(3);

        Iterator<Integer> iterator = arvoreNumerica.iterator();

        while (iterator.hasNext()){
            System.out.println("->" + iterator.next());
        }

        for (Integer folhas: arvoreNumerica){
            System.out.println("-->" + folhas);
        }

        arvoreNumerica.remove(3);

        arvoreNumerica.add(23);
        System.out.println(arvoreNumerica);

        System.out.println(arvoreNumerica.size());

        boolean arvorePelada = arvoreNumerica.isEmpty();
        System.out.println(arvorePelada);
    }
}
