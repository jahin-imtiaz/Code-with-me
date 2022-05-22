public class Location {
    double x;
    double y;
    public Location (double xInitial, double yInitial) {
        x = xInitial;
        y = yInitial;
    }

    public Object clone() {
        Location newLoc = new Location(this.x, this.y);
        return newLoc;
    }

    public Object returnSameLocation(){
        return this;
    }

    public static double distance(Location p1, Location p2){
        if(p1 == null || p2 == null){
            return Double.NaN;
        }

        double a = (p2.x - p2.y) * (p2.x - p2.y); // (x2 - x1 ) ^2
        double b = (p2.y - p1.y) * (p2.y - p1.y); // (y2 - y1) ^ 2
        double result = Math.sqrt(a + b); // root over a + b
        return result;
    }

    public boolean equals(Object obj){
        if (obj == null || obj instanceof Location){
            return false;
        }
        else {
            Location secondLocation = (Location) obj;
            if(this.x == secondLocation.x && this.y == secondLocation.y){
                return true;
            }
            else return false;
        }
    }
}
