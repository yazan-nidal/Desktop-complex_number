package complex_number;
import java.text.DecimalFormat;
import java.text.NumberFormat;

final class Complex
{

    private double realPart;
    private double imaginaryPart;
    
    //Constructor realPart=rp , imaginaryPart=ip
    public Complex(double rp, double ip) { this.setRealPart(rp); this.setImaginaryPart(ip); }

    //Constructor realPart=rp , imaginaryPart=0
    public Complex(double rp) { this(rp,0); }
   
    //Constructor realPart=0 , imaginaryPart=0
    public Complex() { this(0,0); }
    
    //Copy Constructor 
    public Complex(Complex obj) {this(obj.getRealPart(),obj.getImaginaryPart()); }
    
    public Complex(String cm){ setString(cm); }
    
    public int setString(String cm)
    {
     
       try{
      if(cm.isEmpty()
     ||(cm.contains("+.i"))
     ||(cm.contains("-.i"))
     ||(cm.contains(".."))
     ||(cm.contains("++"))
     ||(cm.contains("--"))
     ||(cm.contains("+-"))
     ||(cm.contains("-+")))
      { this.setRealPart(0); this.setImaginaryPart(0); return 0; }
      
      int ii=0; int i=0;
      if((cm.charAt(0) =='+')||(cm.charAt(0) =='-'))ii=i++;
      
      boolean flag=true; String p="";
      
      for(; (i<cm.length()) && flag ;i++)
      {
        if((cm.charAt(i)=='.')||(cm.charAt(i) >= '0') && (cm.charAt(i) <= '9')){p+=cm.charAt(i);}
        else
        {
        if((cm.charAt(i) =='i')||(cm.charAt(i) =='I')){ flag=false; i--; }
        else
        {
        if((cm.charAt(i) =='+')||(cm.charAt(i) =='-')){ flag=false; i--; } 
        }
        }
      }
       
       if(i >= cm.length())
       {
         
         if(cm.charAt(ii)=='-'){ this.setRealPart(-1*Double.parseDouble(p)); }
         else {this.setRealPart(Double.parseDouble(p));}
          this.setImaginaryPart(0); 
          
          return 1;
       }
       
       if((cm.charAt(i) =='i')||(cm.charAt(i) =='I'))
       {
           
       if(!p.isEmpty())
       {
         if(cm.charAt(ii)=='-'){ this.setImaginaryPart(-1*Double.parseDouble(p)); }
         else {this.setImaginaryPart(Double.parseDouble(p));}
       }
       else
       {
          if(cm.charAt(ii)=='-'){this.setImaginaryPart(-1);}
          else{ this.setImaginaryPart(1); }
       }
       
       if((i+1) >= cm.length())
       { this.setRealPart(0); return 1; }
       
      if((cm.charAt(i+1) =='+')||(cm.charAt(i+1) =='-'))
      {
          ii=i+1; i++; p="";
          
          for(;(i<cm.length());i++)
          {
            if((cm.charAt(i)=='.')||(cm.charAt(i) >= '0') && (cm.charAt(i) <= '9'))p+=cm.charAt(i); 
          }
          
       if(p.isEmpty())
       { this.setRealPart(0); }
       else
       {
         if(cm.charAt(ii)=='-'){ this.setRealPart(-1*Double.parseDouble(p)); }
         else {this.setRealPart(Double.parseDouble(p));}
       }    
      }
      return 1; }
      
     if((cm.charAt(i) =='+')||(cm.charAt(i) =='-'))
     {
      
        if(cm.charAt(ii)=='-'){ this.setRealPart(-1*Double.parseDouble(p)); }
        else {this.setRealPart(Double.parseDouble(p));}
       
       if((i+1) >= cm.length())
       { this.setImaginaryPart(0); return 1; } //setRealPart setImaginaryPart
       
        ii=i; i++; p=""; flag=true;
        for(;(i<cm.length() && flag);i++)
        {
         if((cm.charAt(i)=='.')||(cm.charAt(i) >= '0') && (cm.charAt(i) <= '9')){p+=cm.charAt(i);}
         else
         {
           if((cm.charAt(i) =='i')||(cm.charAt(i) =='I')){ flag=false; i--; }
         }
        }
        
        if(p.isEmpty())
        {
            if(cm.charAt(ii) == '-')this.setImaginaryPart(-1);
            else this.setImaginaryPart(1);
        }
        else
        {
          if(cm.charAt(ii) == '-')this.setImaginaryPart(-1*Double.parseDouble(p));
          else this.setImaginaryPart(Double.parseDouble(p));
        }
        
        return 1; 
     }
       }
        catch (Exception e) {return 0;}
     return 0;
  
    }
    
    public final double getRealPart() { return realPart; }
 
    public void setRealPart(double realPart) { this.realPart = realPart; }

    public final double getImaginaryPart() { return imaginaryPart; }
    
    public void setImaginaryPart(double imaginaryPart) { this.imaginaryPart = imaginaryPart; }
    
    //Add
    public static Complex add(Complex a, Complex b) 
      {
        return new Complex( ( a.getRealPart() + b.getRealPart() ) , ( a.getImaginaryPart() + b.getImaginaryPart() ) );
      }
    
    public Complex add(Complex b){ return Complex.add(this, b); }
    
    //Subtract
    public static Complex subtract(Complex a, Complex b) 
      {
        return new Complex( ( a.getRealPart() - b.getRealPart() ) , ( a.getImaginaryPart() - b.getImaginaryPart() ) );
      }
    
    public Complex subtract(Complex b){ return Complex.subtract(this, b); }
    
    //multiply
    public static Complex multiply(Complex a, Complex b)
    {
        double r=(a.getRealPart()*b.getRealPart()) - (a.getImaginaryPart()*b.getImaginaryPart());
        double i=(a.getRealPart()*b.getImaginaryPart()) + (b.getRealPart()*a.getImaginaryPart());
        return new Complex(r,i);
    }
    
    public Complex multiply(Complex b){ return Complex.multiply(this, b); }
    
    //divide
    public static Complex divide(Complex a, Complex b)
    {
         double d=Math.pow(b.mod(),2);
         double r=(a.getRealPart()*b.getRealPart()+a.getImaginaryPart()*b.getImaginaryPart())/d;
         double i=(a.getImaginaryPart()*b.getRealPart()-a.getRealPart()*b.getImaginaryPart())/d;
         if(d==0)return null;
         return new Complex(r,i);
    }
    
    public Complex divide(Complex b)
    {
        return Complex.divide(this,b);
    }
    
    //compare
    public static int compare(Complex a, Complex b) 
    {
        if(a.getImaginaryPart() != b.getImaginaryPart()) return 2; // invalid compare " we can't compare "
        if(a.getRealPart() == b.getRealPart()) return 0; // a equals b
        if(a.getRealPart() > b.getRealPart()) return 1; // a bigger than b
        return -1; // a smaller than b
    }
    
    public int compare(Complex b){ return Complex.compare(this, b); }
    
    //toString
    @Override
    public String toString() 
    { 
       NumberFormat formatter = new DecimalFormat("#0.0");
       if(this.getImaginaryPart() == 0) return formatter.format(this.getRealPart()) + "";
       if(this.getRealPart() == 0)if(Math.abs(this.getImaginaryPart()) == 1)return (this.getImaginaryPart()==1)?"i":"-i";
       else return formatter.format(this.getImaginaryPart()) + "i";
       String f="";
       if(Math.abs(this.getImaginaryPart()) == 1)f=(this.getImaginaryPart()==1)?" + i":" - i";
       else if (this.getImaginaryPart() <  0) f=" - " + formatter.format(Math.abs(this.getImaginaryPart())) + "i";
       else f=" + " + formatter.format(this.getImaginaryPart()) + "i";
       return formatter.format(this.getRealPart()) + f;
    }
    
    //finalize
    @Override
    protected void finalize() throws Throwable {super.finalize();
}
    
    private double mod() 
    {
    if (this.getRealPart()!=0 || this.getImaginaryPart()!=0) 
    {
      return Math.sqrt(this.getRealPart()*this.getRealPart()+this.getImaginaryPart()*this.getImaginaryPart());
    } 
    else return 0.0;
       
    }
   
    
}

public class Complex_number {

  
    public static void main(String[] args) {
        
   new GUI();
        
        
    }
    
}
