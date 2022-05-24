/**
 * @author nataliaCastell
 * @version 1.0
 */
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
    /**
     * Imprimeix el menu
     * @param opcions: llistar del menu
     * @param i: recorrer array
     * @return no retorna res
     */
    public static void imprimirMenu (String []vector){
        System.out.println("Escull una opcio");
        for (int i = 1; i< vector.length; i++){
            System.out.println(vector[i]);
        }
      }
      /**
       * Convertir String en char per elegir del l'opcio del menu
       * @param a: demanem el string 
       * @param b: on guardem el char 
       * @return 
       */
    public static char demanaropcio(String a) {
        Scanner entrada = new Scanner(System.in);
        a= entrada.nextLine();
        char b=a.charAt(0);
            return b;
        }

 //--------------------------funcions accions ---------------------------   
        /**
         * funcio per demanar dades de la obra
         * @param a: guardem nom de l'obra
         * @param b: guardem la durada de l'obra
         * @param c: guardem l'autor de l'obra
         * @param d: guardem l'edat minima
         * @param x: index de l'array cartelera
         * @return index de l'array cartelera
         */
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
    /**
     * Guarda les dades de un nou usuari
     * @param a: guardem el nom de l'usuari
     * @param b: guardem edat de l'usuari
     * @param c: guardem els diners de l'usuari
     * @param llista[]: array de Espectador on guardem els usuaris
     * @param x: comptar_usuaris creats
     * @return Torna el comptador i s'emmagatazema en comptar_usuaris
     */
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
    /**
     * imprimir llistat de usuaris
     * @param llista[]: array de Espectador on guardem els usuaris
     * @return void: no retorna res
     */
    public static void llistarUsuaris(Espectador llista [], int x){
        for (int i = 0 ; i < x; i++){
            System.out.println(llista[i].toString());
        }
    }
    /**
     * imprimir llistat de sessions
     * @param sessions: array de tipus sessio on guardem les sessions
     * @param x: comptar_sessio
     * @param i: recorrer l'array
     * @return no retorna res
     */
    public static void llistarSessions(Sessio sessions [], int x){
        //System.out.println("Llistat avans --> "+p);
        for (int i = 0 ; i < x; i++){
            String linea= sessions[i].toString();
            String data= sessions[i].getDate();
            double preuEntrada= sessions[i].getPreu();
            System.out.println(linea + " amb el preu de"+ preuEntrada);
        }
    }
    /**
     * imprimir llistat de Obres
     * @param cartelera[]: array de tipus obra
     * @param x: comptar_obra
     * @param i: recorrer l'array
     * @return no retorna res
     */
    public static void llistarObra(Obra cartelera [], int x){
        //System.out.println("llista obra");
        for (int i = 0 ; i < x; i++){
            System.out.println(i);
            System.out.println(cartelera[i].toString());
        }
    }
    /**
     * Demanem les dades de sessions i guardem en l'array de tipus Obra
     * @param sessions[]: array de sessions de tipus sessions
     * @param x: comptar_sessio
     * @param cartelera[]: array de tipus obra
     * @param z: comptar_obra
     * @return torna un enter i el guardem en comptar_sessio
     */
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
    /**
     * Creem visualment un seient buit per defecte a tots els seients
     * @param seients[][]: array de tipus Espectador
     * @param i: recorrer l'array
     */
    public static void crearSalaBuida(Espectador [][]seients){
        int index= 5;
        for(int i= 0 ; i < index;i++){
            for (int j = 0; j < index; j++){
                seients[i][j] = new Espectador(" O ",0,0.0); // buit O // ocupat X
            }
        }
    }
    /**
     * Comprar entrades 
     * @param sessions[]:  array de tipus Sessio
     * @param seients[]: array de tipus Espectador
     * @param comptar_compres: comptador de compres realitzades
     * @param llista[]: array de tipus Espectador 
     * @param cartelera[]: array de tipus obra
     * @param comptar_obra: comptador de obres
     * @param comptar_sessio: compradors de sessions
     * @return no retorna res
     */
    public static int comprarEntrades(Sessio [] sessions,Espectador seients [][],int comptar_compres, Espectador []llista, Obra []cartelera, int comptar_obra, int comptar_sessio){
        Scanner sc = new Scanner(System.in); 
        llistarObra(cartelera, comptar_obra);
        int obra;
        System.out.println("Quina obra vols veure?");
        obra=sc.nextInt();
        llistarSessions(sessions,comptar_sessio);
        System.out.println("A quina sessio vols veure-la?");
        int sessio;
        sessio=sc.nextInt();
        crearSalaBuida(seients);
        imprimirSala(seients);
        comptar_compres=seientBuit(seients, comptar_compres,llista);

        return comptar_compres;

    }

    /**
     * Imprimeix la sala de butaques si troba l'element per defecte O = buit l'imprimeix si no imprimeix un X = ocupat
     * @param seients array bidimensional de tipus espectador
     * @param index: indx array bidimensional
     * @param i: recorre el primer for del array bidimensional
     * @param j: recorre el segon for del array bidimensional
     * @param linea: String que imprimirem despres de formar la sala 
     * @param nom: guardem el parametre X qu s'imprimeix en comptes del nom del espectador
     * @return no retorna res     
     */
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

/**
     * Creem per defecte seients buits en l'array
     * @param seients array bidimensional de tipus espectador
     * @param comprar_compres comptador de compres realitzades
     * @param llista[] array de Espectador on guardem els usuaris
     * @return returna un enter     
     */

    private static int seientBuit(Espectador[][] seients, int comptar_compres, Espectador[] llista) {
        int index= 5;
        for(int i= 0 ; i < index;i++){
            for (int j = 0; j < index; j++){
                seients[i][j] = new Espectador(" O ",0,0.0); // buit O // ocupat X
            }
        }
        return comptar_compres;
    }
    /**
     * imprimim l'Afluencia dels espectador
     * @param afluenciaEspectador array de String
     * @param comptar_compres comptador de compres realitzades
     * @param i: recorrer l'array
     * @return no retorna res     
     */
    public static void imprimirAfluencia(String [] afluenciaEspectador, int comptar_compres){
        for (int i =0;i < comptar_compres; i++ ){
            System.out.println(afluenciaEspectador[i]);
        }

    }
    /**
     * Main desde on cridem a les diferents funcions
     * @param opcions[]: array del menu 
     * @param seleccio: guadem l'opcio entrada per l'usuari
     * @param eleccio: guardem el primer char de seleccio
     * @param end: Variable que tanca el do While 
     * @param index: index de l'array bidimensional
     * @param comptar_usuaris:
     * @param comptar_obra:
     * @param comptar_sessio:
     * @param comptar_compres:
     * @param afluenciaEspectador[]:
     * @param cartelera[]: array de tipus obra
     * @param llista[]: array de Espectador on guardem els usuaris
     * @param seients[][]: array de tipus Espectador
     * @param sessions[]:  array de tipus Sessio
     */
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

                //llistar Obra
                case 'e':
                    //System.out.println("case e"+ comptar_obra);
                    llistarObra(cartelera,comptar_obra);
                break;

                //llistar Sessions
                case 'f':
                    llistarSessions(sessions,comptar_sessio);
                break;

                // comprar entrada, guarda compres i les compta amb el comptador comptar_compres
                case 'g':
                    comptar_compres=comprarEntrades(sessions,seients,comptar_compres, llista, cartelera, comptar_obra, comptar_sessio);
                break;

                // imprimir l'Afluencia de espectadors
                case 'h':
                    imprimirAfluencia(afluenciaEspectador,comptar_compres);
                break;
                
                //sortir
                case 'i':
                    end=true;
                break;
        }
    }while(!end);

    } 


    

   
}

