package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Anderson");

        System.out.println(nomes);

        nomes.set(2, "Larissa");

        System.out.println(nomes);

        Collections.sort(nomes);

        nomes.set(2, "Wesley");

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("Wesley");

        String nome = nomes.get(2);

        System.out.println(nome);

        int posicao = nomes.indexOf("Wesley");

        System.out.println(posicao);

        int tamanho = nomes.size();

        System.out.println(tamanho);

        nomes.remove("Pedro");

        tamanho = nomes.size();

        System.out.println(tamanho);

        boolean temFernando = nomes.contains("Fernando");

        System.out.println(temFernando);

        boolean temLarissa = nomes.contains("Larissa");

        System.out.println(temLarissa);

        boolean listaVazia = nomes.isEmpty();

        System.out.println(listaVazia);

        for(String nomeDaLinha: nomes){
            System.out.println(">" + nomeDaLinha);
        }

        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()){
            System.out.println(">>" + iterator.next());
        }

        nomes.clear();

        listaVazia = nomes.isEmpty();

        System.out.println(listaVazia);

    }
}
