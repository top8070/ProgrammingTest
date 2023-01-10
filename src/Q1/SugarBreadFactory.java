package Q1;

public class SugarBreadFactory extends BreadFactory{
    @Override
    protected Bread makeBread() {
        return new SugarBread("sugar", 100, 50, 200);
    }
}
