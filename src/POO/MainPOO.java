package POO;

/*
    Modificadores de acesso:
        public -> acessivel em todo lugar
        default -> quando não definido
        private -> apenas na propria classe
        protected -> acessivel por todos que estao no mesmo pacote
 */

public class MainPOO {
    public static void main(String[] args) {
        Carro meuCarro = new Sandero();
        Carro meuCarro2 = new Mobi();

        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro.acelerar();
        meuCarro2.acelerar();


        SerVivo meuSer = new Humano();
        meuSer.dormir();
        meuSer.respirar();




//        Carro carroJava = new Carro("Gol");
//        Carro carroJava1 = new Carro("Impala 67");
//        Carro carroJava2 = new Carro("Omega");
//
//        carro.acelerar();
//        // carro.frear(); não é possivel acessar metodo privado fora da classe que ele pertence.
//        // Mais eu posso colocar esse metodo dentro de outro metodo publico, criar condições para ele ser exibido.
//        carro1.acelerar();
//        carro2.acelerar();
//
//        carro1.buzinar();

    }
}





