import java.util.*;
import teatregrama.Espectador;
import teatregrama.Obra;
import teatregrama.Sessio;
public class main {
//-------------------Funcions menú---------------------
    public static String[] menu(String[] opcions) {

        opcions = new String[11];
    
        opcions[1] = "";
        opcions[2] = "a. Nou usuari";
        opcions[3] = "b. Nova obra";
        opcions[4] = "c. Nova sessio";
        opcions[5] = "d. Llistar espectadors";
        opcions[6] = "e. Llistar obra";
        opcions[7] = "f. Llistar sessio";
        opcions[8] = "g. Comprar entrada";
        opcions[9] = "h. Mostrar afluencia espectadors";
        opcions[10] = "i. Sortir";


        return opcions;
    }
    public static void imprimirMenu (String []vector){
        System.out.println("Escull una opcio");
        for (int i = 1; i< vector.length; i++){
            System.out.println(vector[i]);
        }
      }
    public static char demanaropcio(String a) {
        Scanner entrada = new Scanner(System.in);
        a= entrada.nextLine();
        char b=a.charAt(0);
            return b;
        }

 //--------------------------funcions accions ---------------------------       
    public static int dadesObra(Obra cartelera[], int x){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Nom de l'obra: ");
        String a= sc.nextLine();
        System.out.println("Durada de l'obra: ");
        String b= sc.nextLine();
        System.out.println("Nom autor de l'obra: ");
        String c= sc.nextLine();
        System.out.println("Edat minima autoritzada de l'obra: ");
        int d= sc.nextInt();
        cartelera[x] = new Obra(a,b,c,d);
        x++;
        return x;
    }
    public static int nouUsuari(Espectador llista[],int x){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Nom Usuari: ");
        String a= sc.nextLine();
        System.out.println("Edat Usuari: ");
        int b= sc.nextInt();
        System.out.println("Diners Usuari: ");
        double c = sc.nextDouble(); 
        System.out.println(a+" " + b +" "+ c);
        llista[x]= new Espectador(a,b,c);
        x++;
        //llista[x].toString();
        System.out.println("El teu numero de usuari es "+x+" recorda'l per comprar una entrada");
        return x;
    }
    public static void llistarUsuaris(Espectador llista [], int x){
        for (int i = 0 ; i < x; i++){
            System.out.println(llista[i].toString());
        }
    }
    public static void llistarSessions(Sessio sessions [], int x, Obra[]cartelera){
        //System.out.println("Llistat avans --> "+p);
        for (int i = 0 ; i < x; i++){
            String linea= sessions[i].toString();
            String data= sessions[i].getDate();
            double preuEntrada= sessions[i].getPreu();
            System.out.println(linea + " amb el preu de"+ preuEntrada);
        }
    }
    public static void llistarObra(Obra cartelera [], int x){
        //System.out.println("llista obra");
        for (int i = 0 ; i < x; i++){
            System.out.println(i);
            System.out.println(cartelera[i].toString());
        }
    }
    public static int dadesSessio(Sessio [] sessions, int x,Obra [] cartelera, int z){
        Scanner sc = new Scanner(System.in); 
        llistarObra(cartelera,z);
        System.out.println("A quina obra pertenix? ");
        int n = sc.nextInt();   
        n =n -1;    
        System.out.println(n) ;
        String titul =" ";
        titul= (titul+sessions[n].getNomObra());
        System.out.println("Preu entrada de l'obra "+ titul + ":");
        double b= sc.nextDouble();
        System.out.println("Digues el dia i l'hora : ");
        
        String data = sc.next(); 
        sessions [n]= new Sessio(cartelera[z], b,data);
        System.out.println("Nova sessio creada ");
        x++;
        return x;

    }
    
    public static void crearSalaBuida(Espectador [][]seients){
        int index= 5;
        for(int i= 0 ; i < index;i++){
            for (int j = 0; j < index; j++){
                seients[i][j] = new Espectador(" O ",0,0.0); // buit O // ocupat X
            }
        }
    }
    public static int comprarEntrades(Sessio [] sessions,Espectador seients [][],int comptar_compres, Espectador []llista, Obra []cartelera, int comptar_obra, int comptar_sessio){
        Scanner sc = new Scanner(System.in); 
        llistarObra(cartelera, comptar_obra);
        int obra;
        System.out.println("Quina obra vols veure?");
        obra=sc.nextInt();
        llistarSessions(sessions,comptar_sessio,cartelera);
        System.out.println("A quina sessio vols veure-la?");
        int sessio;
        sessio=sc.nextInt();
        crearSalaBuida(seients);
        imprimirSala(seients);
        comptar_compres=seientBuit(seients, comptar_compres,llista);

        return comptar_compres;

    }

    private static void imprimirSala(Espectador[][] seients) {
        String linea ="";
            int index= 5;
            for(int i= 0 ; i < index-1;i++){
                for (int j = 0; j <= index-1; j++){
                    String nom = seients[i][j].getNom();
                    if (nom.equals(" O ")){
                        if (j == index-1){
                            linea = linea + "\n";
                        }else{
                            linea = linea + nom + " ";
                        }
                    }else{
                        nom = " X ";
                        if (j == index-1){
                            linea = linea + "\n";
                        }else{
                            linea = linea + nom + " ";
                        }
                        
                    }
            }
            System.out.print(linea);
        
    }
}

    private static int seientBuit(Espectador[][] seients, int comptar_compres, Espectador[] llista) {
        int index= 5;
        for(int i= 0 ; i < index;i++){
            for (int j = 0; j < index; j++){
                seients[i][j] = new Espectador(" O ",0,0.0); // buit O // ocupat X
            }
        }
        return comptar_compres;
    }
    public static void imprimirAfluencia(String [] afluenciaEspectador, int comptar_compres){
        for (int i =0;i < comptar_compres; i++ ){
            System.out.println(afluenciaEspectador[i]);
        }

    }
    
    public static void main(String[] args) {
        //Variables:
        String[] opcions = new String[7];
        String seleccio="";
		char eleccio = ' ';
        boolean end = false;
        int index= 5;
        int comptar_usuaris=0;
        int comptar_obra=0;
        int comptar_sessio=0;
        int comptar_compres=0;
        String [] afluenciaEspectador= new String [10];

        Obra [] cartelera = new Obra [10];
        Espectador [] llista = new Espectador [10];
        Espectador [] [] seients = new Espectador [index] [index];
        Sessio [] sessions= new Sessio [10];


        //Accions:
        opcions = menu(opcions);

       do{ imprimirMenu(opcions);
        eleccio= demanaropcio (seleccio);
        switch(eleccio){
            // nou usuari
            case 'a':
                comptar_usuaris=nouUsuari(llista,comptar_usuaris);
            break;

            //Nova obra
            case 'b':
                comptar_obra=dadesObra(cartelera,comptar_obra);
            break;

            //Nova sessio
            case 'c':
                comptar_sessio=dadesSessio(sessions,comptar_sessio,cartelera, comptar_obra);
                
            break;

            //Llistar espectadors 
            case 'd':
                llistarUsuaris(llista,comptar_usuaris);
            break;

            //Comprar entrada
            case 'e':
                System.out.println("case e"+ comptar_obra);
                
                llistarObra(cartelera,comptar_obra);
            break;
            //llistar Sessions
            case 'f':
                llistarSessions(sessions,comptar_sessio,cartelera);
            break;

            case 'g':
                comptar_compres=comprarEntrades(sessions,seients,comptar_compres, llista, cartelera, comptar_obra, comptar_sessio);
            
            break;

            case 'h':
                imprimirAfluencia(afluenciaEspectador,comptar_compres);
            break;

            case 'i':
            end=true;
            break;
        }
    }while(!end);

    } 


    

   
}

