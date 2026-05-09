package POO;

public class CarroJava {
    String modelo;


    public CarroJava(String modelo){
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println(this.modelo + " está Acelerando!");
        if (this.modelo.length() <= 5) this.frear();
    }

    private void frear(){
        System.out.println(this.modelo + " está Freando.");
    }

    protected void buzinar(){
        System.out.println(this.modelo + " Buzinando.");
    }
}

class Rodas{
    public Rodas(){
        CarroJava carroJava = new CarroJava("BMW");
        carroJava.buzinar(); // < Pode acessar já que o modificador é 'protected'
        // carro.frear(); < não pode acessar mesmo no mesmo arquivo modificador é 'private'.
    }

}
