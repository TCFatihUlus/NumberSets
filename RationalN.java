/** 
 *RationalN is a class that extends RealN
 * @author Fatih Mücahit ULUS-190101022 
 */
public class RationalN extends RealN{
  private int x;
  private int y;
  
  /**
   *The constructor
   * @param x the numerator
   * @param y the denominator
   * @throws ArithmeticException prevents the denominator from being zero
   */
  public RationalN(int x, int y){
    
    super((double)x / (double)y);
 
    this.x=x;
    this.y=y;
    if(y==0){
      throw new ArithmeticException("Error of division by zero");
    }
  }
 
  /** 
  *The getter method getNumerator()
  * @return x the value of numerator
  */
  public int getNumerator(){
    return x;
  }
  
  /**
   *The getter method getDenominator()
   * @return y the value of denominator
   */
  public int getDenominator(){
     
    return y;
  }
  
 
  int a=getNumerator();
  int b=getDenominator();
  public static int temp1=0;
  public static int GCD=0;
  
  /**
   *The getGCD() method computes the greatest common divisor of two numbers
   * @param a the first number
   * @param b the second number
   * @return GCD the greatest common divisor of a and b
   */
  public static int getGCD(int a, int b){
   
      while(b!=0){
        temp1=b;
        b=a%b;
        a=temp1;
      }
      GCD=a;
    
    return GCD;
  }
  
  /**
   *The getLCM() method computes the least common multiple of two numbers
   * @param a the first number
   * @param b the second number
   * @return the least common multiple of a and b
   */
  public static int getLCM(int a, int b){
    return a*b/getGCD(a,b);
  }
  
  /**
   *It overrides toString()
   * @return the rational number in fractional form
   */
  @Override
  public String toString(){
      
    int num1=getNumerator();
    int num2=getDenominator();
    
    if(getNumerator()==getDenominator()){
      return 1+"";
    }
    if(getNumerator()==(-1)*getDenominator()){
      return -1+"";
    }
    if(getNumerator()==0){
      return 0+"";
    }
   
    if(getDenominator()==1){
      return getNumerator()+"";
    }
    if(getDenominator()==-1){
      return getNumerator()*(-1)+"";
    }
    if(num1<0){
      num1=num1*(-1);
    }
    if(num2<0){
      num2=num2*(-1);
    }
                   
  
    
    if(getGCD(num1,num2)>1){
      if(getDenominator()/getGCD(num1,num2)==1){
      return getNumerator()/getGCD(num1,num2)+"";
      }
      if(getDenominator()/getGCD(num1,num2)==-1){
      return (-1)*getNumerator()/getGCD(num1,num2)+"";
      }
      if(getNumerator()>0&&getDenominator()<0){
      return "-"+getNumerator()/getGCD(num1,num2)+"/"+getDenominator()/getGCD(num1,num2)*(-1);
      }
      if(getDenominator()<0&&getNumerator()<0){
      return (-1)*getNumerator()/getGCD(num1,num2)+"/"+(-1)*getDenominator()/getGCD(num1,num2);
      }
      return getNumerator()/getGCD(num1,num2)+"/"+getDenominator()/getGCD(num1,num2);
    }
   
    
    if(getNumerator()<0&&getDenominator()<0){
      return getNumerator()*(-1)+"/"+getDenominator()*(-1);
    }
    if(getNumerator()>0&&getDenominator()<0){
      return "-"+getNumerator()+"/"+getDenominator()*(-1);
    }
    return getNumerator()+"/"+getDenominator();
  }
  
  /**
   *It controls whether two rational numbers are equal
   * @param Object obj
   * @return true or false depends on the situation
   */
  @Override
  public boolean equals(Object obj){
   
    if(obj==this){
      return true;
    }
    if (!(obj instanceof RationalN)) {
            return false;
    }
    RationalN obj2=(RationalN)obj;
    return Double.compare(getValue(), obj2.getValue())==0;
  }
}