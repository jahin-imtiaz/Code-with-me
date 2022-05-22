public class MainClass {
    public static void main(String... args){
        Location firstLocation = new Location(2, 3);
        System.out.println(firstLocation.x);
        System.out.println(firstLocation.y);

        Location secondLocation = (Location) firstLocation.clone();
        Location thirdLocation = (Location) firstLocation.returnSameLocation();

        System.out.println(secondLocation.x);
        System.out.println(secondLocation.y);
        System.out.println(thirdLocation.x);
        System.out.println(thirdLocation.y);

        System.out.println(firstLocation);
        System.out.println(secondLocation);
        System.out.println(thirdLocation);

        System.out.println(firstLocation.y);
        System.out.println(thirdLocation.y);
        System.out.println(secondLocation.y);
        firstLocation.y = 100;
        System.out.println(firstLocation.y);
        System.out.println(thirdLocation.y);
        System.out.println(secondLocation.y);

        System.out.println(Location.distance(firstLocation, secondLocation));
    }
}
