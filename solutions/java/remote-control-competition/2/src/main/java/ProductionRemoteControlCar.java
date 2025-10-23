class ProductionRemoteControlCar implements RemoteControlCar,Comparable<ProductionRemoteControlCar>{
    int distance = 0;
    int victory = 0;
    public void drive() {
        distance += 10;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return victory;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victory = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar c)
    {
        return c.victory - this.victory;
    }
}
