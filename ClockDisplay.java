
/**
 * @author Milan Palmer
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
   private NumberDisplay hoursDisplay;
   private NumberDisplay minutesDisplay;
   private NumberDisplay secondsDisplay;

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        // initialise instance variables
        hoursDisplay = new NumberDisplay(24);
        minutesDisplay = new NumberDisplay(60);
        secondsDisplay = new NumberDisplay(60);
        updateDisplay();
      
    }
    public void timeTick() {
        minutesDisplay.increment();
        if(minutesDisplay.getValue() == 0) {
            // it just rolled over!
            hoursDisplay.increment();
        }
        updateDisplay();
    }

    public void updateDisplay() {
        System.out.println(hoursDisplay.getValue() + ":" + minutesDisplay.getValue() + ":" + secondsDisplay.getValue());
    }
    
    public NumberDisplay getHoursDisplay() {
        return hoursDisplay;
    }
    
    public NumberDisplay getMinutesDisplay() {
        return minutesDisplay;
    }
  
    public NumberDisplay getSecondsDisplay() {
        return secondsDisplay;
    }
}
