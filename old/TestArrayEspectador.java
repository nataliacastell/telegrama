
// -------------------CLASS PROVA ------------------

class TestArrayEspectador {
    public static void main(String[] args){

        Espectador [] llista = new Espectador [4];
        llista[0] = new Espectador("Pere",30,300.50);
        llista [1] = new Espectador("Joana",28,1000.20);
        llista [3]=new Espectador(" ");
        //---------------------------------------------
        int index= 5;
        Espectador [] [] seients = new Espectador [index] [index];
        //---------------------------------------------
        
        double preuEntrada= 8.50;
        // Comprovacions
        llista[0].getMajorEdat();
        llista[0].teDiners(preuEntrada);
        llista[1].getMajorEdat();
        llista[1].teDiners(preuEntrada);
        // imprimim usuaris
        //System.out.println(llista[0]);
       // System.out.println(llista[1]);
        

//-------------------------------------------
        //Assignem seient a usuaris
        seients [2] [3]= llista[0];
        seients [2] [4] = llista[1];

// Imprimir array
for(int i= 0 ; i < index;i++){
    for (int j = 0; j < 1; j++){
            System.out.print(seients[i][j]+" ");
            System.out.print(seients[i][j+1]+" ");
            System.out.print(seients[i][j+2]+" ");
            System.out.print(seients[i][j+3]+" ");
            System.out.print(seients[i][j+4]+"\n");  

        }
    }
    }
}
