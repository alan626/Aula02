

public class Main{
    public static void main(String[] args)  {
    
    Animal cachorro = new Animal("Cachorro","Canino", "Pelos",4, "Terrestre");
    Animal piranha = new Animal("Piranha","peixe","Escamas",0,"Aquatico");
    Animal aguia = new Animal("Aguia","ave","Penas",2,"Aereo");

    System.out.println(cachorro.getNome()+" possui "+cachorro.getPelagem());
    System.out.println(piranha.getNome()+" e um animal "+ piranha.getMeioLocomocao());
    System.out.println(aguia.getNome()+ " e uma "+aguia.getEspecie());

    cachorro.setNome("Lobo");
    aguia.setNome("Arara");
    piranha.setNome("Tubarao");
    
    System.out.println("\n");

    System.out.println("------ Acao ------");
    
    System.out.println("\n");

    //Obs.: Não sei romever a quebra de linha nesse caso mas dá pra entender kkk

    System.out.println(cachorro.getNome() +" esta ");
    cachorro.correr();
    System.out.println("\n");

    System.out.println(piranha.getNome() +" esta ");
    piranha.nadar();
    System.out.println("\n");


    System.out.println(aguia.getNome() + " esta");
    aguia.voa();
    System.out.println("\n");


    
   



    }

    
}