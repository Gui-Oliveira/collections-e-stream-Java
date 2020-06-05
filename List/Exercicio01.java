package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio01 {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add ("Juliana");
        lista.add("Pedro");
        lista.add("Carlo");
        lista.add("Larissa");
        lista.add("João");

        for (String nomesDaLista: lista){
            System.out.println("-->" + nomesDaLista);
        }

        lista.set(2, "Roberto");
        System.out.println(lista);

        System.out.println(lista.get(0));

        lista.remove(3);
        System.out.println(lista);

        lista.remove("João");
        System.out.println(lista);

        lista.size();
        System.out.println(lista.size());

        boolean temJuliano = lista.contains("Juliano");
        System.out.println(temJuliano);


        //Lista dentro de lista.
        List<String> nomes = new ArrayList<>();

        nomes.add("Ismael");
        nomes.add("Rodrigo");

        lista.addAll(nomes);

        Collections.sort(lista);
        System.out.println(lista);

        boolean listaVazia = lista.isEmpty();
        System.out.println(listaVazia);
    }
}
