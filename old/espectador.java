
import java.util.*;

// -------------------------Clase Espectador------------------------------------
class Espectador {
    // intnto d crida a la class aux
    //private aux aux= new aux();
    String nom;               //Nom espectador.
    int edat;                 // edat espctador.
    double diners;            // diners espectador en el walet. 
    boolean majorEdat;        // major de edat si o no
    boolean teDiners=false;         // Te diner per pagar l'entrada si o no
    //String seient= " ";
    // un que accepte 3 arguments (nom, edat i diners)
    public Espectador(String nom, int edat,double diners ){
        this.nom=nom;
        this.edat=edat;
        this.diners=diners;
    }
    //un que accepte 2 arguments (edat i diners), el nom el posarem com «anonim».
    public Espectador( int edat,double diners ){
        this.nom="anonim";
        this.edat=edat;
        this.diners=diners;
    }
    //un que accepte 1 argument (diners), el nom el posarem com «anonim» i edat a 99.
    //public Espectador(String seient ){
       // this.seient= " ";
   // }
    // Dona valor a nom
    public String getNom(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introdueix el teu nom");
        this.nom= entrada.nextLine();    // this indica que es refereix a la variable de la clase, no la del constructor.
        return this.nom;
    }
    //Dona valor a edat
    public int getEdat(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introdueix la teva edat: ");
        this.edat= entrada.nextInt() ;
        return this.edat;
    }
    // Comprova si usuari es major d'edat.
    public boolean getMajorEdat(){
        if(edat>=18){
            this.majorEdat= true;
        }else{
            this.majorEdat=false;
        }
        return this.majorEdat;
    }
    public boolean teDiners( double preuEntrada){
        //boolean teDiners;
        if(this.diners>=preuEntrada){
            this.teDiners=true;
        }
        return this.teDiners;
    }
    //Comprova si hi han prou diners, Resta el preu entrada de diners, cambia els diners
    public double getPagarEntrada(double preuEntrada){
        if (teDiners=true&&diners>0){
            double resta= this.diners- preuEntrada;
            // this.diners - preuEntrada;
            if(resta>0){
                this.diners= resta;
            }
            
        }else if(teDiners=false&&diners>0){
            //System.out.println("No tens prous diners al moneder!");
        }
        return this.diners;
    } 
    // missatge benvinguda
    public void walet(){
        System.out.println("Per agrair els nostres nous espectadors regalem 2€ al teu moneder!");
    }
    //regal 2€
    public double getWalet(){
        //newWalet = 2;
        this.diners= +2.00;
        return this.diners;
    // Fer una rcarrega    
    } public double getRecarrega(){
        double recarregaWalet = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quants dinrs vols recarregar en el moneder? ");
        recarregaWalet= entrada.nextInt() ;
        this.diners= this.diners + recarregaWalet;
        return this.diners;
    }
    // String info usuari
    @Override
    public String toString(){
        String infoUser= this.nom;
        //"L'usuari "+this.nom+ " amb l'edad de "+ this.edat+", és major d'edat?  "+this.majorEdat+" ,cuants diners te? "+this.diners+ "€. Te prous diners per pagar l'entrada? "+ this.teDiners;
        return infoUser;
    }
    //Marcar seient que vol comprar
    public void getSeients(String [][]a, String seient){
        if (teDiners=true){
        switch(seient){
            case "A1":
            a [1] [1]= " X " ;
            break;
            case "B1":
            a [1] [2]= " X " ;
            break;
            case "C1":
            a [1] [3]= " X " ;
            break;
            case "D1":
            a [1] [4]= " X " ;
            break;
            case "A2":
            a [2] [1]= " X " ;
            break;
            case "B2":
            a [2] [2]= " X " ;
            break;
            case "C2":
            a [2] [3]= " X " ;
            break;
            case "D2":
            a [2] [4]= " X " ;
            break;
            case "A3":
            a [3] [1]= " X " ;
            break;
            case "B3":
            a [3] [2]= " X " ;
            break;
            case "C3":
            a [3] [3]= " X " ;
            break;
            case "D3":
            a [3] [4]= " X " ;
            break;
            case "A4":
            a [4] [1]= " X " ;
            break;
            case "B4":
            a [4] [2]= " X " ;
            break;
            case "C4":
            a [4] [3]= " X " ;
            break;
            case "D4":
            a [4] [4]= " X " ;
            break;
        }
    }
    
    }
    
// ----------------------funcions main-----------------
  // Creem la sala posem els index per a que el usuari identifique la linea i la fila 
  public static void creaSala(String a [] [], int index) {
    a [0] [0] =  "  " ;
    a [0] [1] = " A ";
    a [0] [2] = " B ";
    a [0] [3] = " C ";
    a [0] [4] = " D ";
    a [1] [0] = "1 ";
    a [2] [0] = "2 ";
    a [3] [0] = "3 ";
    a [4] [0] = "4 ";

// Posem tots els seients en buit marcan amb un "_"
    for(int i= 1 ; i < index;i++  ){
        for (int j = 1; j < index; j++){
            a [i] [j]= " _ " ;
        }
    } 
       
    for(int i= 0 ; i < index;i++){
        for (int j = 0; j < 1; j++){
                System.out.print(a[i][j]);
                System.out.print(a[i][j+1]);
                System.out.print(a[i][j+2]);
                System.out.print(a[i][j+3]);
                System.out.print(a[i][j+4]+"\n");  

            }
        }
    }
    // Imprimim el resultat
    public static void imprimirSeients(String [][]a,int index){
        for(int i= 0 ; i < index;i++){
            for (int j = 0; j < 1; j++){
                    System.out.print(a[i][j]);
                    System.out.print(a[i][j+1]);
                    System.out.print(a[i][j+2]);
                    System.out.print(a[i][j+3]);
                    System.out.print(a[i][j+4]+"\n");  
    
                }
            }
    }
    // Misatge no disponible
    public static void nodisponible (){
        System.out.println("No disponible temporalment");
      }

       
    //----------------------Main------------------------  
    public static void main (String [] args){
        //variables Espectador
        String nom;
        int edat;
        double diners;
        boolean teDiners;
        double preuEntrada= 4.23;
        boolean majorEdat;
        String infoUser;
        //----- Declarem usuari i l'iniciem donan valors inicials
        Espectador usuari1 ;
        usuari1 = new Espectador("usuari",0,0.0);
        // variables menu
        Scanner entrada = new Scanner(System.in);
        int index= 5;
        String [] [] seients = new String [index] [index];
        

        // Accions usuari
                    //usuari1.getNom();
                    //usuari1.getEdat();
                    //usuari1.walet();
                    //usuari1.getWalet();
                    usuari1.getMajorEdat();
                    usuari1.teDiners(preuEntrada);
                    infoUser= usuari1.toString();
                    System.out.println(infoUser);
               // imprimir sala
                    creaSala(seients, index);
                    //imprimirSeients(seients,index);

                //reserva i paga
                    System.out.println("Quin seient vols reservar, indica primer la lletra i despres el num de fila");
                    String seient= " ";
                    seient=entrada.nextLine();
                    
                    usuari1.getSeients(seients,seient);
            
        }  
}

