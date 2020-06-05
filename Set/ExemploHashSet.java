package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(5.0);
        notasAlunos.add(4.5);
        notasAlunos.add(10.0);
        notasAlunos.add(8.5);
        notasAlunos.add(9.0);
        notasAlunos.add(5.1);
        notasAlunos.add(4.0);
        notasAlunos.add(2.5);

        System.out.println(notasAlunos);

        //Remove a nota do set
        notasAlunos.remove(5.0);

        System.out.println(notasAlunos);

        //Retorna a quantidade de itens do set
        System.out.println(notasAlunos.size());

        //Navega no set
        Iterator<Double> iterator = notasAlunos.iterator();

        while(iterator.hasNext()){
            System.out.println(">>" + iterator.next());
        }

        for(Double nota: notasAlunos){
            System.out.println("--->" + nota);
        }

        notasAlunos.clear();

        boolean listaVazia = notasAlunos.isEmpty();
        System.out.println(listaVazia);
    }
}
