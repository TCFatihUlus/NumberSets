/**
 *ComplexN is a class that includes all sets of numbers
 * @author Fatih Mücahit ULUS-190101022
 * */
public class ComplexN{
  private double x;
  private double y;
  
  /** 
   *The constructor
   * @param x the real part of a complex number
   * @param y the imaginary part of complex number
   */
  public ComplexN(double x, double y){
    this.x=x;
    this.y=y;
  }
  
  /**
   *The getter method getRealPart()
   * @return x value the real part of a complex number
   */
  public double getRealPart(){
    return x;
  }
  
  /**
   *The getter method getImaginaryPart()
   * @return y value the imaginary part of a complex number
   */
  public double getImaginaryPart(){
    return y;
  }
  
  /**
   *It overrides toString() method
   * @return the complex number as a string
   */
  @Override
  public String toString(){
    if(getRealPart()==0&&getImaginaryPart()==0){
      return 0.0+"";
    }
    else if(getRealPart()==0){
     
      return getImaginaryPart()+"i";
      
    }
    else if(getImaginaryPart()==0){
      return getRealPart()+"";
    }
    else if(getImaginaryPart()>0){
      return getRealPart()+"+"+getImaginaryPart()+"i";
    }
    else 
      return getRealPart()+""+getImaginaryPart()+"i";
    
    
  }
  
  /** 
   *It controls whether two complex numbers are equal
   * @param Object obj
   * @return true or false depends on the situation
   */
  @Override
  public boolean equals(Object obj){
    if(obj==this){
      return true;
    }
    if (!(obj instanceof ComplexN)) {
            return false;
    }
    ComplexN obj2=(ComplexN)obj;
    return Double.compare(getRealPart(), obj2.getRealPart())==0&&Double.compare(getImaginaryPart(),obj2.getImaginaryPart())==0;
  }
}