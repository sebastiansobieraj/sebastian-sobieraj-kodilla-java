package lotto;

public class Excerscise {

    public double power (double a, double b) throws NumberNotEqualZeroException, TwoNumbersShouldBePositiveException{
        if (a == 0){
            throw new NumberNotEqualZeroException("A can't be 0");
        }
        if (a < 0 || b < 0) {
            throw new TwoNumbersShouldBePositiveException("A and B should be positive");
        }
        return Math.pow(a, b);
    }
}
