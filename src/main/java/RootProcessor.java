public class RootProcessor {

    private SquarePolynom polynom;
    private double max;

    public RootProcessor(SquarePolynom polynom){
        this.polynom = polynom;
    }
    public double maxRoot() {
        double[] roots = new double[polynom.solutions().length];
        for (int i = 0; i < roots.length; i++) {
            roots[i] = polynom.getRoot(i);
        }
        if (roots.length == 1) {
            max = roots[0];
        } else {
            if (roots[0] > roots[1]) {
                max = roots[0];
            } else {
                max = roots[1];
            }
        }
        return max;
    }
}
