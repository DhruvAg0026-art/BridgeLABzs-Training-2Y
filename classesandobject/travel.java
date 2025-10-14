
class travel {
    String fromCity;
    String toCity;
    double distance;
    travel(String fromCity, String toCity, double distance) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.distance = distance;
    }
    void displayTravelInfo() {
        System.out.println("Traveling from " + fromCity + " to " + toCity + " covers " + distance + " km.");
    }
}

class Main {
    public static void main(String[] args) {
        travel travel = new travel("Chennai", "Bangalore", 345.6);
        travel.displayTravelInfo();
    }
}
