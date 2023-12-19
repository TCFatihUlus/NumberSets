/**
 *IntegerN is a class that extends RationalN and includes the integers from minus infinity to infinity 
 * @author Fatih Mücahit ULUS-190101022
 */
public class IntegerN extends RationalN{
  private int x;
  
  /**
   *The constructor
   *@param x the integer
    */
  public IntegerN(int x){
    super(x,1);
    this.x=x;
  }
  
  /** 
   *The getter method getX()
   * @return x value
   */
  public int getX(){
    return x;
  }
  
  /**
    *It overrides toString() method
    * @return getX() as a string
    */
  @Override
  public String toString(){
    return getX()+"";
  }
  
  /** 
   *It controls whether two integers are equal
   * @param Object obj
   * @return true or false depends on the situation
   */
  @Override
  public boolean equals(Object obj){
    if(obj==this){
      return true;
    }
    if (!(obj instanceof IntegerN)) {
            return false;
    }
    IntegerN obj2=(IntegerN)obj;
    return Integer.compare(getX(), obj2.getX())==0;
  }
}