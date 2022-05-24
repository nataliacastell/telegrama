package teatregrama;
// -------------------------Clase Espectador------------------------------------
public class Espectador {
    // intnto d crida a la class aux
    //private aux aux= new aux();
    String nom;               // Nom espectador.
    int edat;                 // edat espectador.
    double diners;            // diners espectador en el walet. 
    boolean majorEdat;        // major de edat si o no
    boolean teDiners=false;   // Te diner per pagar l'entrada si o no
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
   //Agafar nom
   public String getNom(){
       this.nom=nom;
    return this.nom;
    }
    // Dona valor a nom
    public String setNom(String nom){
        this.nom= nom;    // this indica que es refereix a la variable de la clase, no la del constructor.
        return this.nom;
    }
    // Agafar valor edat
    public int getEdat(){
        return this.edat;
    }
    //Dona valor a edat
    public int setEdat(int x){
        this.edat= x ;
        return this.edat;
    }
    // demanar diners
    public double getDiners(){
        return this.diners;
    }
    // Comprova si usuari es major d'edat.
    public boolean majorEdat(int edatmin){
        if(edatmin>=edat){
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
    public void pagarEntrada(double preuEntrada){
        double resta= diners- preuEntrada;
            if(resta>0){
             this.diners= resta;
        } 
    }
    //Comprova si hi han prou diners, Resta el preu entrada de diners, cambia els diners
    public boolean comprarEntrada(double preuEntrada, int edatMinima){
        boolean potComprar= false;
        if(majorEdat(edatMinima)){
            if (teDiners(preuEntrada)){
                pagarEntrada(preuEntrada);
                potComprar= true;
                }
        }else if(teDiners=false&&diners>0){
            potComprar=false;
            //System.out.println("No tens prous diners al moneder!");
        } 
        return potComprar;

    }
        
    // String info usuari
    @Override
    public String toString(){
        String infoUser=" ";
        infoUser= "L'usuari "+this.nom+ " amb l'edad de "+ this.edat+" ,cuants diners te? "+this.diners+ "€.";
        return infoUser;
    }
     
    // Fer una rcarrega
    public double setRecarrega(int x){
        this.diners= this.diners + x;
        return this.diners;
    }
    
}