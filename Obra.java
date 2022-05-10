import java.util.*;

//----------------------- CLASE OBRA ------------------------
class Obra{
String titul;           // Titul de la obra
String durada;       // Data i hora de la sessio
String autor;           // Nom del autor obra
int edatMinima;         // Edat minima per veure l'obra

//Contructor per a una obra
public Obra(String nom, String durada, String autor, int edatMinima){
    this.titul=titul;
    this.durada= durada;
    this.autor= autor;
    this.edatMinima= edatMinima;
}
// donar nom a una obra
public String getTitul(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Introdueix el titol de l'obra");
    this.titul= entrada.nextLine();    // this indica que es refereix a la variable de la clase, no la del constructor.
    return this.titul;
}
// donar una durada a una obra
public String getDurada(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Introdueix la durada de l'obra");
    this.durada= entrada.nextLine();    // this indica que es refereix a la variable de la clase, no la del constructor.
    return this.durada;
}
// donar nom al autor de una obra
public String getAutor(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Introdueix el no de l'autor de l'obra");
    this.autor= entrada.nextLine();    // this indica que es refereix a la variable de la clase, no la del constructor.
    return this.autor;
}
// dir quina es l'edat minima per accedir a l'obra
public int getEdatMinima(){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Introdueix la Edat minima per veure l'obra");
    this.edatMinima= entrada.nextInt();    // this indica que es refereix a la variable de la clase, no la del constructor.
    return this.edatMinima;
}
// informacio de l'obra
@Override
public String toString(){
    String infoObra="L'obra "+this.titul+" del autor "+ this.autor +" amb la durada de "+ this.durada+". Has de tenir l'edad  "+ this.edatMinima +" anys  com a minim per veure-la.";
    return infoObra;
}
//---------------------Main--------------------------
public static void main (String [] args){
    // Variables obra
    String titul;           // Titul de la obra
    String durada;          // Data i hora de la sessio
    String autor;           // Nom del autor obra
    int edatMinima;         // Edat minima per veure l'obra
    String infoObra;
    //---------Declarem obra i iniciem donan valors basics
    Obra obra;
    obra = new Obra(" ", " "," ", 0);

    // Accions obra  Nova obra demanar i donar valors
    obra.getTitul();
    obra.getDurada();
    obra.getAutor();
    obra.getEdatMinima();
    infoObra= obra.toString();
    System.out.println(infoObra);

}


}
