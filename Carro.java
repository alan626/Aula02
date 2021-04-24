public class Carro {
    
    public String marca;
    public String cor;
    public int portas;

    public Carro (String marca,String cor, int portas){

        this.marca = marca;
        this.cor = cor;
        this.portas = portas;

    }

    public void acelerar(){
        System.out.println("Acelerando");
    }
}
