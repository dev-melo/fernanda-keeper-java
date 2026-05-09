package POO;

public class Sandero implements Carro{
    final int limiteDeVelocidade = 150; // <= Imutavel quando colocado final
    public int velocidadeAtual = 0;

    @Override
    public void acelerar() {
        if (velocidadeAtual < limiteDeVelocidade){
            this.velocidadeAtual += 10;
            System.out.println("Acelerando a 50km");

        }
        System.out.println("Velocidade atual: " + velocidadeAtual);
    }

    @Override
    public void freiar() {

    }

    @Override
    public void parar() {

    }
}
