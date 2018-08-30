public class MonteCarloBox {
    public static void main(String[] args) {
        double xmin = Double.parseDouble(args[0]);
        double xmax = Double.parseDouble(args[1]);
        double ymin = Double.parseDouble(args[2]);
        double ymax = Double.parseDouble(args[3]);

        Interval1D xint = new Interval1D(xmin, xmax);
        Interval1D yint = new Interval1D(ymin,ymax);
        
    }
}
