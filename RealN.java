/**
 *RealN is a class that extends ComplexN and includes rational and irrational numbers
 * @author Fatih Mücahit ULUS-190101022
 */
public class RealN extends ComplexN{
  private double x;
  
  /**
   *The constructor
   * @param x the real number
   */
  public RealN(double x){
    super(x,0);
    this.x = x;
  }
  
  /** 
   *The getter method getValue()
   * @return x value
   */
  public double getValue(){
    return x;

  }
  
  /**
   *It overrides toString() method
   * @return getValue() as a string
   */
  @Override
  public String toString(){
    return getValue()+"";
  }
  
  /**
   *It controls whether two real numbers are equal
   * @param Object obj
   * @return true or false depends on the situation
   */
  @Override
  public boolean equals(Object obj){
    if(obj==this){
      return true;
    }
    if (!(obj instanceof RealN)) {
            return false;
    }
    RealN obj2=(RealN)obj;
    return Double.compare(getValue(), obj2.getValue())==0;
  }
}
