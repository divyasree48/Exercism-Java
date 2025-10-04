public class CarsAssemble {

    public double productionRatePerHour(int speed) 
    {
        double total = 221 * speed;
        double fault;
        if(speed <= 4)
        {
            fault = 0.0;
        }
        else if(speed <= 8)
        {
            fault = total / 10;
        }
        else if(speed == 9)
        {
            fault = total / 5;
        }
        else
        {
            fault = (total * 23) / 100;
        }
         return total - fault;   
        
    }

    public int workingItemsPerMinute(int speed) {
        
         return (int)(productionRatePerHour(speed))/60;   
    }
}
