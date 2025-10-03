public class JedliksToyCar {
    public int meters = 0;
    public int battery = 100;
    public static JedliksToyCar buy() {
        JedliksToyCar obj = new JedliksToyCar();
        return obj;
    }

    public String distanceDisplay() {
        return "Driven "+meters+ " meters";
    }

    public String batteryDisplay() {
        if(battery == 0) return "Battery empty";
        return "Battery at "+battery+"%";
    }

    public void drive() 
    {
        if(battery != 0){
        meters += 20;
        battery -= 1;
        }
    }
}
