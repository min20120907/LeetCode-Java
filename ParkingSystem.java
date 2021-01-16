class ParkingSystem {
    int big, medium, small;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.small = small;
        this.medium = medium;
    }
    
    public boolean addCar(int carType) {
        switch(carType) {
            case 1:
                big--;
                if(big>=0) return true;
                break;
            case 2:
                medium--;
                if(medium>=0) return true;
                break;
            case 3:
                small--;
                if(small>=0) return true;
                break;
        }
        return false;
    }
}
