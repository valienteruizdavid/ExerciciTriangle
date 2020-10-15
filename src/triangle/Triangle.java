
package triangle;


public class Triangle {
    
    private double base;
    private double altura;
    private double h;

    public Triangle(double base, double altura, double h){
        this.base = base;
        this.altura = altura;
        this.h = h;
        //Si la base, l'altura o el costat son 0 o menor, sortirà e missatge d'error corresponent.
        if(this.base <= 0){
           Excepcio ex = new Excepcio(1);
           throw new IllegalArgumentException(ex.missatgeError()); 
        }else if(this.altura <= 0){
          Excepcio ex = new Excepcio(2);
           throw new IllegalArgumentException(ex.missatgeError());  
        }else if(this.h <= 0){
          Excepcio ex = new Excepcio(3);
           throw new IllegalArgumentException(ex.missatgeError());  
        }
    }
    
    public void setBase(double base){   
        this.base = base; 
    }
    
    public void setAltura(double altura){
        this.altura = altura;
        
    }

    public void setH(double h) { 
        
        this.h = h;   
    }
    
    public double getBase(){
        
        
        return base;
    }
    
    public double getAltura(){
        Excepcio ex = new Excepcio(2);
        if(altura <= 0){
            throw new IllegalArgumentException(ex.missatgeError());
        }
        return altura;
            
    }
    
    public double getH() {
        Excepcio ex = new Excepcio(3);
        if(h <= 0){
            throw new IllegalArgumentException(ex.missatgeError());
        }
        return h;
    }
    
    public double perimetre(){
        double resultat = base+altura+altura;
        return resultat;
    }
    
    public double area(){
        double resultat = (base*h)/2;
        return resultat;
    }

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    
    
    public static void main(String[] args) {
        Triangle t = new Triangle(10,4,8);
        System.out.println("TRIANGLE");
        System.out.println(t);
        System.out.println("==========================");
        System.out.println("PERIMETRE");
        System.out.println(t.perimetre());
        System.out.println("==========================");
        System.out.println("AREA");
        System.out.println(t.area());
    }
    
}
