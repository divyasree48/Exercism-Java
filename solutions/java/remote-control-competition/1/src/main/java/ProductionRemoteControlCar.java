class ProductionRemoteControlCar implements RemoteControlCar,Comparable<ProductionRemoteControlCar>{
    int distance = 0;
    int win = 0;
    public void drive() 
    {
        distance += 10;
    }

    public int getDistanceTravelled() 
    {
        return distance;
    }

    public int getNumberOfVictories() {
        return win;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.win = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar c)
    {
        return Integer.compare(c.win,this.win);
    }
    
}
