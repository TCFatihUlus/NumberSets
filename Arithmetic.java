/** 
 *Arithmetic class is a class that performs four operations between number classes
 * @author Fatih Mücahit ULUS-190101022
 */
public class Arithmetic{

  /** 
    *It performs addition between two natural numbers
    * @param x
    * @param y
    * @return the addition of x and y
    */
  public static NaturalN add(NaturalN x, NaturalN y){
    return new NaturalN(x.getX()+y.getX());
  }
  
  /** 
    *It performs subtraction between two natural numbers
    * @param x
    * @param y
    * @return the subtraction of x and y
    * @throws prevents y from being zero
    */
  public static NaturalN subtract(NaturalN x, NaturalN y){
    if(y.getX()==0){
      throw new ArithmeticException("Error of division by zero");
    }
    return new NaturalN(x.getX()-y.getX());
    
  }
  
  /** 
    *It performs multiplication between two natural numbers
    * @param x
    * @param y
    * @return the multiplication of x and y
    */
  public static NaturalN multiply(NaturalN x, NaturalN y){
    return new NaturalN(x.getX()*y.getX());
  }
  
  /** 
    *It performs division between two natural numbers
    * @param x
    * @param y
    * @return the divison of x and y
    */
  public static NaturalN divide(NaturalN x, NaturalN y){
    return new NaturalN(x.getX()/y.getX());
  }
  
  /** 
    *It performs addition between two integers
    * @param x
    * @param y
    * @return the addition of x and y
    */
  public static IntegerN add(IntegerN x, IntegerN y){
    return new IntegerN( x.getX()+y.getX());
  }
  
  /** 
    *It performs subtraction between two integers
    * @param x
    * @param y
    * @return the subtraction of x and y
    */
  public static IntegerN subtract(IntegerN x, IntegerN y){
    return new IntegerN( x.getX()-y.getX());
  }
  
  /** 
    *It performs multiplication between two integers
    * @param x
    * @param y
    * @return the multiplication of x and y
    */
  public static IntegerN multiply(IntegerN x, IntegerN y){
    return new IntegerN( x.getX()*y.getX());
  }
  
  /** 
    *It performs division between two integers
    * @param x
    * @param y
    * @return the division of x and y
    * @throws prevents y from being zero
    */
  public static IntegerN divide(IntegerN x, IntegerN y){
    if(y.getX()==0){
      throw new ArithmeticException("Error of division by zero");
    }
    return new IntegerN( x.getX()/y.getX());
  }
  
  /** 
    *It performs addition between two rational numbers
    * @param x
    * @param y
    * @return the addition of x and y as a string
    */
  public static String add(RationalN x, RationalN y){
   
    RationalN a= new RationalN(((x.getNumerator()*(RationalN.getLCM(x.getDenominator(),y.getDenominator())/x.getDenominator()))+
                         (y.getNumerator()*(RationalN.getLCM(x.getDenominator(),y.getDenominator())/y.getDenominator()))),RationalN.getLCM(x.getDenominator(),y.getDenominator()));
    return a.toString();
  }
  
   /** 
    *It performs subtraction between two rational numbers
    * @param x
    * @param y
    * @return the subtraction of x and y as a string
    */
  public static String subtract(RationalN x, RationalN y){
   
    RationalN a= new RationalN(((x.getNumerator()*(RationalN.getLCM(x.getDenominator(),y.getDenominator())/x.getDenominator()))-
                         (y.getNumerator()*(RationalN.getLCM(x.getDenominator(),y.getDenominator())/y.getDenominator()))),RationalN.getLCM(x.getDenominator(),y.getDenominator()));
    return a.toString();
  }
  
   /** 
    *It performs multiplication between two rational numbers
    * @param x
    * @param y
    * @return the multiplication of x and y as a string
    */
  public static String multiply(RationalN x, RationalN y){
    RationalN a=new RationalN(x.getNumerator()*y.getNumerator(),x.getDenominator()*y.getDenominator());
    
    return a.toString();
  }
  
   /** 
    *It performs division between two rational numbers
    * @param x
    * @param y
    * @return the division of x and y as a string
    */
  public static String divide(RationalN x, RationalN y){
    RationalN a=new RationalN(x.getNumerator()*y.getDenominator(),x.getDenominator()*y.getNumerator());
    if(y.getNumerator()==0){
      throw new ArithmeticException("Error of division by zero");
    }
    return a.toString();
  }
  
  /** 
    *It performs addition between two real numbers
    * @param x
    * @param y
    * @return the addition of x and y
    */
  public static RealN add(RealN x, RealN y){
    return new RealN(x.getValue()+y.getValue());
  }
  
  /** 
    *It performs subtraction between two real numbers
    * @param x
    * @param y
    * @return the subtraction of x and y
    */
  public static RealN subtract(RealN x, RealN y){
    return new RealN(x.getValue()-y.getValue());
  }
  
  /** 
    *It performs multiplication between two real numbers
    * @param x
    * @param y
    * @return the multiplication of x and y 
    */
  public static RealN multiply(RealN x, RealN y){
    return new RealN(x.getValue()*y.getValue());
  }
  
  /** 
    *It performs division between two real numbers
    * @param x
    * @param y
    * @return the division of x and y
    * @throws ArithmeticException prevents y from being zero
    */
  public static RealN divide(RealN x, RealN y){
    if(y.getValue()==0){
      throw new ArithmeticException("Error of division by zero");
    }
    return new RealN(x.getValue()/y.getValue());
  }
  
  /** 
    *It performs addition between two complex numbers
    * @param x
    * @param y
    * @return the addition of x and y
    */
  public static ComplexN add(ComplexN x, ComplexN y){
    return new ComplexN((x.getRealPart()+y.getRealPart()),(x.getImaginaryPart()+y.getImaginaryPart()));
  }
  
  /** 
    *It performs subtraction between two complex numbers
    * @param x
    * @param y
    * @return the subtraction of x and y
    */
  public static ComplexN subtract(ComplexN x, ComplexN y){
    return new ComplexN((x.getRealPart()-y.getRealPart()),(x.getImaginaryPart()-y.getImaginaryPart()));
  }
  
  /** 
    *It performs multiplication between two complex numbers
    * @param x
    * @param y
    * @return the multiplication of x and y
    */
  public static ComplexN multiply(ComplexN x, ComplexN y){
    return new ComplexN ((x.getRealPart()*y.getRealPart())+(x.getImaginaryPart()*y.getImaginaryPart())*-1,(x.getRealPart()*y.getImaginaryPart()+y.getRealPart()*x.getImaginaryPart()));
  }
  
  /** 
    *It performs division between two complex numbers
    * @param x
    * @param y
    * @return the division of x and y
    * @throws ArithmeticException prevents y from being zero
    */
  public static ComplexN divide(ComplexN x, ComplexN y){
    if(y.getRealPart()==0&&y.getImaginaryPart()==0){
      throw new ArithmeticException("Error of division by zero");
    }
    return new ComplexN(Arithmetic.multiply(x,Arithmetic.conjugate(y)).getRealPart()/Arithmetic.conjugateProduct(y),Arithmetic.multiply(x,Arithmetic.conjugate(y)).getImaginaryPart()/Arithmetic.conjugateProduct(y));
  }
  
  /**
   *It computes the conjugate of a complex number
   *@param x
   *@return the conjugate of x
   */
  public static ComplexN conjugate(ComplexN x){
    ComplexN a=new ComplexN(x.getRealPart(),x.getImaginaryPart()*-1);
    return a;
  }
  
  /**
   *It computes the product of a complex number with its conjugate
   *@param x
   *@return the product of x and its conjugate
   */
  public static double conjugateProduct(ComplexN x){
    ComplexN a=Arithmetic.conjugate(x);
    return Arithmetic.multiply(x,a).getRealPart();
  }
}