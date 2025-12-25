class Darts {
    int score(double x, double y) {
        double dis = Math.sqrt((x*x)+(y*y));
        int c = 0;
        if(dis <= 1) c = 10;
        else if(dis <= 5) c = 5;
        else if(dis <= 10) c = 1;
        return c;
        
    }
}
