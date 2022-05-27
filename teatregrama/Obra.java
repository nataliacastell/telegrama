package teatregrama;
//----------------------- CLASE OBRA ------------------------
public class Obra{
    String titul;           // Titul de la obra
    String durada;          // Data i hora de la sessio
    String autor;           // Nom del autor obra
    int edatMinima;         // Edat minima per veure l'obra
    
   
    // demana nom a una obra
    public String getTitul(){
       return this.titul;
    }
    //donar titul a obra
    public String setTitul(String a){
        this.titul= a;    
        return this.titul;
    }
    // demana la durada de l'obra
    public String getDurada(){
       return this.durada;
    }
    // donar una durada a una obra
    public String setDurada(String x){
        this.durada= x;    
        return this.durada;
    }
    // demanar nom del l'autor
    public String getAutor(){
        return this.autor;
    }
    // donar nom al autor de una obra
    public String setAutor(String x){
        this.autor= x;    
        return this.autor;
    }
    // demanar l'edad minima
    public int getEdatMinima(){
        return this.edatMinima;
    }
    // donar edatminima
    public int setEdatMinima(int x){
        this.edatMinima=x;
        return this.edatMinima;
    }
    // informacio de l'obra
    @Override
    public String toString(){
        String infoObra="L'obra "+this.titul+" del autor "+ this.autor +" amb la durada de "+ this.durada+". Has de tenir l'edad  "+ this.edatMinima +" anys  com a minim per veure-la.";
        return infoObra;
    }
    public String setNom(String nom){
        this.titul=nom;
        return this.titul;
    }
    public String getNom(){
        return this.titul;   
    }
}
