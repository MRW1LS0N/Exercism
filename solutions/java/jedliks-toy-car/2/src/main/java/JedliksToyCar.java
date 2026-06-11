public class JedliksToyCar {
    private int distance =0;
    private int battery=100;
    public static JedliksToyCar buy() {
      return new JedliksToyCar();
    }

    public String distanceDisplay() {
       return String.format("Driven %s meters", distance);
    }

    public String batteryDisplay() {
        // if(battery != 0){
        //     return "Battery at " + battery+ "%";
        // }
        // else{
        //     return "Battery empty";
        // }
        return battery != 0 ? String.format("Battery at %s%%", battery) : "Battery empty";
    }

    public void drive() {
        if(battery != 0){
        distance +=20;
        battery -=1;
        }        
    }
}
