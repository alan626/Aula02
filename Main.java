

public class Main {
    public static void main(String[] args){

        Carro c = new Carro("fiat","verde",4);
        Carro cl = new Carro("Ferrari","vermelho",2);

        System.out.println ("A cor do carro é "+c.cor);
        System.out.println("A cor do carro é "+cl.cor);

        c.acelerar();
    }
    
}