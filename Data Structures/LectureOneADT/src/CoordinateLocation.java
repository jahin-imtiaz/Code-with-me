public class CoordinateLocation extends Location{
    public CoordinateLocation(double xInitial, double yInitial) {
        super(xInitial, yInitial);
    }

    @Override
    public Object clone() {
        CoordinateLocation newCoordinate = new CoordinateLocation(this.x, this.y);
        return newCoordinate;
    }
}
