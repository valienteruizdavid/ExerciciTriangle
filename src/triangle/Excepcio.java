
package triangle;


public class Excepcio extends Exception {
   
    //Inicialitzem un nombre enter que serà referent com un codi d'error.
    private int error;
    
    public Excepcio(int codi){
        this.error = codi;
    }
    
    public String missatgeError(){
        //Fem un switch case que, depenent el número que li posem al error sortirà un missatge o altre.
        String resultat = "";
        
        switch (error){
            case 1:
                resultat = "La base no pot ser 0 ni negatiu";
                break;
            case 2:
                resultat = "El costat no pot ser 0 ni negatiu";
                break;
        }
        return resultat;
    }

    
    
    
}
