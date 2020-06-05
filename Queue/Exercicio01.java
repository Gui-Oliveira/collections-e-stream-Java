package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Exercicio01 {
    public static void main(String[] args) {

        Queue<String> filaDaCaixa = new LinkedList<>();

        filaDaCaixa.add("José");
        filaDaCaixa.add("Maria");
        filaDaCaixa.add("Danilo");
        filaDaCaixa.add("Josué");
        filaDaCaixa.add("Marcos");

        for(String ordem: filaDaCaixa){
            System.out.println("Vai seguraaaando --> " + ordem);
        }

        String primeiroMesario = filaDaCaixa.peek();
        System.out.println(primeiroMesario);
        System.out.println(filaDaCaixa);

        String mandaOMesarioPraCasa = filaDaCaixa.poll();
        System.out.println(mandaOMesarioPraCasa);
        System.out.println(filaDaCaixa);

        filaDaCaixa.add("Daniel");
        System.out.println(filaDaCaixa);

        System.out.println(filaDaCaixa.size());

        System.out.println(filaDaCaixa.isEmpty());

        boolean cadeOMesario = filaDaCaixa.contains("Carlos");
        System.out.println(cadeOMesario);
    }
}
