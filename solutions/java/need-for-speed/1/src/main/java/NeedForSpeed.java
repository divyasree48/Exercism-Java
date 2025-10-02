class NeedForSpeed {
    int speed ,batteryDrain;
    int battery = 100;
    int distance = 0;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if(!batteryDrained()){
        distance += this.speed;
         battery -= this.batteryDrain;   
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed obj = new NeedForSpeed(50,4);
        return obj;
    }
}

class RaceTrack {
    private int dist;
    RaceTrack(int distance) {
        this.dist = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        float drain = ((float)this.dist / car.speed) * car.batteryDrain;
        
        return (100 - drain) >= 0;
    }
}
