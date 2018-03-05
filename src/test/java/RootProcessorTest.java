
import org.junit.Test;

import static org.junit.Assert.*;

public class RootProcessorTest {

    SquarePolynom squarePolynom = new SquarePolynom();
    RootProcessor work = new RootProcessor(squarePolynom);

    @Test
    public void solutionsOfSquarePolynomWhitTwoRoots() throws Exception {
        double root = 0.5;
        double[] coef = {2., 3., -2.};
        squarePolynom.setCoefficients(coef);
        work.maxRoot();
        assertEquals(root, work.maxRoot(), 0);
    }

    @Test
    public void solutionsOfSquarePolynomWhitOneRoot() throws Exception {
        double root = 1.;
        double[] coef = {1., -2., 1.};
        squarePolynom.setCoefficients(coef);
        work.maxRoot();
        assertEquals(root, work.maxRoot(), 0);
    }


    @Test(expected = IllegalArgumentException.class)
    public void solutionsOfSquarePolynomWhitoutRoots() {
        double[] coef = {1, 1, 8};
        squarePolynom.setCoefficients(coef);
        work.maxRoot();
    }
}