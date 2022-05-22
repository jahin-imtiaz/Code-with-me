public class GeometricLocation extends Location{
    public GeometricLocation(double xInitial, double yInitial) {
        super(xInitial, yInitial);
    }

    @Override
    public Object clone() {
        GeometricLocation newCoordinate = new GeometricLocation(this.x, this.y);
        return newCoordinate;
    }
}
