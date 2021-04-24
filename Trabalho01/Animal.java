
public class Animal {

    public String nome;
    public String especie;
    public String pelagem;
    public int quantidadePatas;
    public String meioLocomocao;

    public Animal (String nome, String especie, String pelagem, int quantidadePatas, String meioLocomocao) {

        this.nome = nome;
        this.especie = especie;
        this.pelagem = pelagem;
        this.quantidadePatas = quantidadePatas;
        this. meioLocomocao = meioLocomocao;
    }

    public void voa(){
        System.out.println("Voando");
    }
    public void correr(){
        System.out.print("Correndo");
    }
    public void nadar(){
        System.out.println("Nadando");
    }
    
}
