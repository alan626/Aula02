
public class Animal {

    private String nome;
    private String especie;
    private String pelagem;
    private int quantidadePatas;
    private String meioLocomocao;

    public Animal (String nome, String especie, String pelagem, int quantidadePatas, String meioLocomocao) {

        this.nome = nome;
        this.especie = especie;
        this.pelagem = pelagem;
        this.quantidadePatas = quantidadePatas;
        this. meioLocomocao = meioLocomocao;
    }

    public String getNome(){
        return nome;
    }
    public String getEspecie(){
        return especie;
    }
    public String getPelagem(){
        return pelagem;
    }
    public int getquantidadPatas(){
        return quantidadePatas;
    }
    public String getMeioLocomocao(){
        return meioLocomocao;
    }



    public void setNome(String nome){
        this.nome = nome;
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
