package Q1;

public class ButterBreadFactory extends BreadFactory{
    @Override
    protected Bread makeBread() {
        return new ButterBread("butter", 100, 100, 50);
    }
}
