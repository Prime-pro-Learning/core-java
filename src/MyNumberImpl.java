public class MyNumberImpl implements MyNumber{
    @Override
    public double getValue() {
        return Math.random()*250;
    }
}
