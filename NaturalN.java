/**
 *NaturalN is a class that extends IntegerN and includes the numbers from 0 to infinity
 * @author Fatih Mücahit ULUS-190101022 
 */
public class NaturalN extends IntegerN{
  private int x;
  
  /** 
   *The constructor
   * @param x the natural number
   * @throws ArithmeticException obstruct entering numbers less than zero
   */
  public NaturalN(int x){
    super(x);
    this.x=x;
    if(x<0){
    throw new ArithmeticException("Natural numbers go from 0 to adjacent to infinity.");
    }
  }
  
  /**
   * The getter method getX
   * @return x value
   */
  public int getX(){
    return x;
  }
  
  /**
   * It overrides toString() method
   * @return getX() as a string
   * */
  @Override
  public String toString(){
    return getX()+"";
  }
  
  /** 
   *It controls whether two natural numbers are equal
   * @param Object obj
   * @return true or false depends on the situation
   */
  @Override
  public boolean equals(Object obj){
    if(obj==this){
      return true;
    }
    if (!(obj instanceof NaturalN)) {
            return false;
    }
    NaturalN obj2=(NaturalN)obj;
    return Integer.compare(x, obj2.x)==0;
  }
}