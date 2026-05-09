package POO;

public class Humano extends SerVivo{


    public Humano() {
        super(36);
    }

    @Override
    public void respirar() {
        System.out.println(this.idade);
        System.out.println("Inalando e Exalando CO2 e Oxinegio");
    }
}
