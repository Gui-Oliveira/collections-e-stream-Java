package Set;

import java.util.HashSet;
import java.util.Iterator;

public class ExercicioHashSet {
    public static void main(String[] args) {

        HashSet<Integer> sequenciaMesaria = new HashSet<>();

        sequenciaMesaria.add(8);
        sequenciaMesaria.add(88);
        sequenciaMesaria.add(20);
        sequenciaMesaria.add(44);
        sequenciaMesaria.add(3);

        Iterator<Integer> iterator = sequenciaMesaria.iterator();

        while (iterator.hasNext()){
            System.out.println("->" + iterator.next());
        }

        for (Integer numeros: sequenciaMesaria){
            System.out.println("-->" + numeros);
        }

        sequenciaMesaria.remove(3);

        sequenciaMesaria.add(23);
        System.out.println(sequenciaMesaria);

        System.out.println(sequenciaMesaria.size());

        boolean setVazio = sequenciaMesaria.isEmpty();
        System.out.println(setVazio);
    }
}
