

public class Main{
    public static void main(String[] args)  {
    
    Animal cachorro = new Animal("Cachorro","Canino", "Pelos",4, "Terrestre");
    Animal piranha = new Animal("Piranha","peixe","Escamas",0,"Aquatico");
    Animal aguia = new Animal("Aguia","ave","Penas",2,"Aereo");

    System.out.println(cachorro.nome+" possui "+cachorro.pelagem);
    System.out.println(piranha.nome+" e um animal "+ piranha.meioLocomocao);
    System.out.println(aguia.nome+ " e uma "+aguia.especie);
    
    System.out.println("\n");

    System.out.println("------ Acao ------");
    
    System.out.println("\n");

    //Obs.: Não sei romever a quebra de linha nesse caso mas dá pra entender kkk

    System.out.println(cachorro.nome +" esta ");
    cachorro.correr();
    System.out.println("\n");

    System.out.println(piranha.nome +" esta ");
    piranha.nadar();
    System.out.println("\n");


    System.out.println(aguia.nome + " esta");
    aguia.voa();
    System.out.println("\n");


    
   



    }

    
}