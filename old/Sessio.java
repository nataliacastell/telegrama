import java.util.*;


//----------------------- CLASE Sessio ------------------------
class Sessio{
    String obra;                    // Titul de la obra
    double preu;                    // Preu entrada
    String data;             // Data i hora de la sessio
    // cridar a l'array seients de Espectador??????
    



    //constructor sessio
    public Sessio(String obra, double preu, String data){
        this.obra=obra;
        this.preu=preu;
        this.data= data;
    }

    public String getNomObra(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introdueix el titul de l'obra que vols crear una nova sessio");
        this.obra= entrada.nextLine();    
        return this.obra;
    }
    public double getPreu(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introdueix el preu d el'entrada");
        this.preu= entrada.nextDouble();    
        return this.preu;
    }
    public String getDate() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digues quin dia es l'obra");
        String dia= entrada.nextLine();
        System.out.println("Digues quin mes es l'obra");
        String mes= entrada.nextLine();
        System.out.println("Digues quin any es l'obra");
        String any= entrada.nextLine();
        System.out.println("Digues a quina hora es l'obra, separat per dos punts");
        String hora=entrada.nextLine();
        String [] fecha =new String[4];
        fecha[0]=any;
        fecha[1]=mes;
        fecha[2]=dia;
        fecha[3]=hora;
        String data= fecha[0]+"-"+fecha[1]+"-"+fecha[2]+" "+fecha[3];
        return data;
        
    }
    // informacio de sessio
@Override
    public String toString(){
        String infoSessio="La sessio de l'obra "+this.obra+" te el preu de "+ this.preu +" la sessio nova te la data i hora de inici:  "+ this.data;
        return infoSessio;
}
    //---------------------Main--------------------------
    public static void main (String [] args){
    String obra;                    // Titul de la obra
    double preu;                    // Preu entrada
    String data;             // Data i hora de la sessio
    // cridar a l'array seients de Espectador??????

    
    //---------Declarem sessio i iniciem donan valors basics
    Sessio sessio;
    sessio = new Sessio(" ", 0.0,"00-00-00 00:00");
    String [] fecha =new String[4];
    
    // Accions sessio

        sessio.getNomObra();
        sessio.getPreu();
        data=sessio.getDate();

    }
}