package Q1;

public class CreamBreadFactory extends BreadFactory{
    @Override
    protected Bread makeBread() {
        return new CreamBread("cream", 100, 100, 200);
    }
}
