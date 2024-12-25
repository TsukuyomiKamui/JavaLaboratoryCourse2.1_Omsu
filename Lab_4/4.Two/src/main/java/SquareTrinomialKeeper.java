public class SquareTrinomialKeeper {

    private SquareTrinomial squareTrinomial;
    public SquareTrinomialKeeper(double a, double b, double c){
        squareTrinomial = new SquareTrinomial(a, b, c);
    }

    public double getGreaterRoot() throws IllegalArgumentException{
        double result;
        try {
            double[] roots = squareTrinomial.getRoots();
            result = Math.max(roots[0], roots[1]);
        }
        catch (IllegalArgumentException exception){
            throw new IllegalArgumentException("Корней нет");
        }
        return result;
    }
}
