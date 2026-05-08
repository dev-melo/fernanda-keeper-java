import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // -- Declarar variaveis

        var nome = "felipe";
        int idade = 36;
        System.out.println("Nome " + nome + ", idade " + idade);

        // -- Tipos Primitivos
        //Numeros inteiros
        byte num8bits;
        short num16bits;
        int num32bits;
        long num64bits;

        // Numeros Decimais
        float numDecimal32bits; // precisão simples
        double numDecimal64bits; // precisão dupla

        // Caracteres, Palavras, Frases
        char sexo = 'M'; // unico caracter
        String nomeFilho = "Iori"; // palavras e frases

        // Boleanos (verdadeiro ou falso)
        boolean verdade = true;
        verdade = false;

        // -- Condicionais

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String s1 = "";
        boolean bool = false;

        if (bool ){
            System.out.println("Verdadeiro");
        } else if (s1.isBlank()) {
            System.out.println("Esta vazia.");
        } else {
            System.out.println("Falso");
        }

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


    }
}
