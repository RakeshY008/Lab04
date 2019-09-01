public class Task {
    public double calculateAreaOfPolygon(int numberOfSides, double lengthOfOneSide) {

        return numberOfSides * lengthOfOneSide * lengthOfOneSide / (4.0 * Math.tan(Math.PI / numberOfSides));

    }
}