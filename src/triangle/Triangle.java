
package triangle;


public class Triangle {
    
    private double base;
    private double altura;
 

    public Triangle(double base, double altura){
        this.base = base;
        this.altura = altura;
        //Si la base, l'altura o el costat son 0 o menor, sortirà e missatge d'error corresponent.
        if(this.base <= 0){
           Excepcio ex = new Excepcio(1);
           throw new IllegalArgumentException(ex.missatgeError()); 
        }else if(this.altura <= 0){
          Excepcio ex = new Excepcio(2);
           throw new IllegalArgumentException(ex.missatgeError());  
        }
    }
    
    public void setBase(double base){   
        this.base = base; 
    }
    
    public void setAltura(double altura){
        this.altura = altura;
        
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
    
    public double perimetre(){
        return hipotenusa() * 2;
    }
    
    public double area(){
        double resultat = base*altura/2;
        return resultat;
    }

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    private double hipotenusa(){
       return Math.sqrt(Math.pow(base/2,2.0)+Math.pow(altura,2.0));
    }
    
    
    
    
    public static void main(String[] args) {
        Triangle t = new Triangle(12,16.16);
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
