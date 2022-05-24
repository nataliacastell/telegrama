package teatregrama;
import java.util.*;
//----------------------- CLASE Sessio ------------------------
public class Sessio{
    Obra obra;                      // Titul de la obra
    double preu;                    // Preu entrada
    String data;                    // Data i hora de la sessio
    

    //constructor sessio
    public Sessio(Obra obra, double preu, String data){
        this.obra=obra;
        this.preu=preu;
        this.data= data;
    }
    // demanar nom obra
    public Obra getNomObra(){   
        return this.obra;
    }
    // donar nom al objecte obra
    public Obra setNomObra(Obra x){   
        this.obra= x;
        return this.obra;
    }
    // donar valor a preu sessio
    public double setPreu(double x){
        this.preu= x;    
        return this.preu;
    }
    // demanar preu sessio
    public double getPreu(){
        return this.preu;
    }
    // demanar data
    public String getDate() {
        return this.data; 
    }
    // donar una data
    public String setDate(String x) {
        this.data= x;
        return this.data; 
    }
    //enregistrar els espectadors de cada obra i cada sessio
    public static String afluencia(Espectador [] llista,int user, int columna, int fila){
        String nom= "";
        int edat=0;
        double diners= 0.0;
        String files=" ";
        nom=llista[user].getNom();
        edat=llista[user].getEdat();
        diners=llista[user].getDiners();
        files= "L'Espectador "+ nom +" de "+ edat+"anys "+ "amb "+ diners+" diners ha comprat el seient " +fila+ " "+columna;
        return files;
    }
    //Comprova si el seient esta buit
    public  int seientBuit(Espectador seients [][], int comprar,Espectador llista[], String [] afluenciaEspectador, int comptar_compres){
        System.out.println("Vols comprovar si el seient esta buit?");
        Scanner entrada = new Scanner(System.in);
        String opcio= entrada.nextLine();

        switch(opcio){
            case "si":
                System.out.println("Quin seient vols comprar? indica la columna primer, despres la fila");
                int columna=entrada.nextInt();
                int fila=entrada.nextInt();
                boolean teDiners;
                boolean majorEdat;
                double diners;
                double preuEntrada;
                preuEntrada= getPreu();
                if(seients[columna][fila].equals(" _ ")){
                    System.out.println("Quin es el teu numero de usuari?");
                    int user= entrada.nextInt();
                    if(llista[user].teDiners(preu)){
                        int edatMin=obra.getEdatMinima();
                        if(llista[user].comprarEntrada(preu,edatMin)){
                            seients[columna-1][fila-1]= llista[user];
                            llista[user].pagarEntrada(preuEntrada);
                            afluenciaEspectador[comptar_compres]=afluencia(llista,user,columna,fila);
                        comprar++;
                        break;
                        }
                    }
                }else{
                    System.out.println("Seient no disponible!");
                    break;
                } 
            case "no":
                break;
        }
        return comprar;
    } 


        public  void imprimirSala(Espectador seients[][]){
            String linea ="";
            int index= 5;
            
            for(int i= 0 ; i < index;i++){
                for (int j = 0; j <= index; j++){
                        if (j == index){
                            linea = linea + "\n";
                        }else{
                            if(seients[i][j].equals(" O ")){
                                linea = linea + seients[i][j] + " ";
                            }else{
                                linea = linea + " X  ";
                            }
                            
                        }
                    }
            }
            System.out.print(linea);
        }
       
       
    
    // informacio de sessio

    @Override
    public String toString(){
        String infoSessio="La sessio de l'obra "+this.obra +" te el preu de "+ preu +" la sessio nova te la data i hora de inici:  "+ this.data;
        return infoSessio;
    }
    public String stringRecaudacio (int comprar){
        String total="La recaudacio de l'obra "+obra+" es de "+ comprar ;
        return total;
    }
}

