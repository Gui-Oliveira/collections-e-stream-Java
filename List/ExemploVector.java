package List;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        //Adiciona esportes no vetor
        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Volei");
        esportes.add("Golf");

        //Altera o valor da posição 2 no vetor
        esportes.set(2, "eSport");

        //Remove o esporte Futebol da posição
        esportes.remove("Futebol");

        //Remove o indice do esporte
        esportes.remove(2);

        //Retorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        //Navega no vetor
        for(String esporte: esportes){
            System.out.println(esporte);
        }
    }
}
