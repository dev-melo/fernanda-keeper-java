import java.util.ArrayList;

public class ArraysVetores {
    public static void main(String[] args) {
        // Vetoris - Arrays

        int[] colecaoInteiros = {1,2,3,4,5,6}; // int[] indica que essa variavel é um array e já inicia com valores padroes {1,2,3,4,5,6}

        System.out.println(colecaoInteiros[0]); // pegando e mostrando o primeiro valor -[indice] do vetor
        System.out.println(colecaoInteiros.length); // mostra o tamanho do array, qts posições existe

        int[] meusNumeros = new int[10]; // criando um vetor com tamanho de 10 posições

        // ArrayList: cria um vetor mutável
        ArrayList<String> lista = new ArrayList<>(); // criando um ArrayList de String
        lista.add("Felipe Melo");
        lista.add("Iori Melo");
        lista.add("Kiboo Melo");
        lista.add("Tihna Melo");
        lista.add("Doidn Melo");
        lista.add("Churros Melo");
        System.out.println(lista);
        System.out.println("-");
        System.out.println(lista.get(3));
        lista.remove(3);
        System.out.println(lista.get(3));
        lista.remove("Kiboo Melo");
        System.out.println(lista.get(3));
        System.out.println("--");

        // Loops - Iterações
        for (int it = 0; it <lista.size();it++){
            System.out.println(lista.get(it));
        } // passa em todos elementos dentro de lista e mostra no console.
        System.out.println();

        for (var it = 0;it < colecaoInteiros.length;it++) System.out.println(colecaoInteiros[it]); // for em uma linha

        for (String list:lista){
            System.out.println(list);
        }
        for (int numero:colecaoInteiros) System.out.println(numero);

        int cont = 0;
        while (cont <= 10){
            System.out.println(cont);
            cont++;
        }
    }
}
