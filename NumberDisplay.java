
/**
 * @author Milan Palmer
 */
public class NumberDisplay
{
   private int value;
   private int limit;
   
    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int limit)
    {
        this.limit = limit;
        value = 0;      
       
    }
    
    public int getValue() {
        return value;
    }
    
    public int getLimit() {
        return limit;
    }

    public void increment() {
        ++value;
        if(value == limit) {
            value = 0;
        }
    }
}
