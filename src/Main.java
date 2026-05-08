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


    }
}
