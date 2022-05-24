import java.util.*;
    public class aux {
        public static String[] menu(String[] opcions) {

            opcions = new String[8];
        
            opcions[1] = "";
            opcions[2] = "a. Nou usuari";
            opcions[3] = "b. Consultar seients";
            opcions[4] = "c. Reserva plaça i paga";
            opcions[5] = "d. Recarrega";
            opcions[6] = "e. Consultar recaudacio";
            opcions[7] = "f. Afegir nova Obra";
            opcions[8] = "g. Guarda usuari";
            opcions[9] = "h. Veure espectadors";
            opcions[10] = "i. Sortit";
            


            return opcions;
          }
          public static void imprimirMenu (String []vector){
            System.out.println("Escull una opcio");
            for (int i = 0; i< vector.length; i++){
            System.out.println(vector[i]);}
          }
          public static char demanaropcio(String a) {
            Scanner entrada = new Scanner(System.in);
            a= entrada.nextLine();
            char b=a.charAt(0);
                return b;
            }
          public static void salaBuida(String a [] [], int index) {
            a [0] [0] =  "" ;
            a [0] [1] = "A";
            a [0] [2] = "B";
            a [0] [3] = "C";
            a [0] [4] = "D";


                for(int i= 1 ; i < index;i++  ){
                    
                    for (int j = 0; j < index; j++)
                        a [i] [j]= " _ " ;

                } 
                for (int i = 0; i < index; i++){
                    for (int j = 0; j < index; j++){
                        System.out.println("seients[" + i + "][" + j + "] = "
                                   + a[i][j]);
                    }
                }

            }
            public static void nodisponible (){
                System.out.println("No disponible temporalment");
              }
              // ----------------------funcions main-----------------
 /* // Creem la sala posem els index per a que el usuari identifique la linea i la fila 
  public static Espectador [] [] creaSala( Espectador[][] a , int index) {
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
    public static void imprimirSeients(Espectador [][]a,int index){
        for(int i= 0 ; i < index;i++){
            for (int j = 0; j < 1; j++){
                    System.out.print(a[i][j]);
                    System.out.print(a[i][j+1]);
                    System.out.print(a[i][j+2]);
                    System.out.print(a[i][j+3]);
                    System.out.print(a[i][j+4]+"\n");  
    
                }
            }
        }   */    
     }
    