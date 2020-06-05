package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExercicioLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(8);
        sequenciaNumerica.add(20);
        sequenciaNumerica.add(88);
        sequenciaNumerica.add(44);
        sequenciaNumerica.add(3);

        Iterator<Integer> numeros = sequenciaNumerica.iterator();

        while (numeros.hasNext()){
            System.out.println("->" + numeros.next());
        }

        for (Integer sequencia: sequenciaNumerica){
            System.out.println("-->" + sequencia);
        }

        sequenciaNumerica.remove(8);

        sequenciaNumerica.add(23);
        System.out.println(sequenciaNumerica);

        System.out.println(sequenciaNumerica.size());

        sequenciaNumerica.clear();

        boolean linkVazio = sequenciaNumerica.isEmpty();
        System.out.println(linkVazio);

    }
}
