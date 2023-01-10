package Q1;

public abstract class BreadFactory {
    public Bread orderBread() {
        Bread bread = makeBread();

        return bread;
    }

    protected abstract Bread makeBread();

    /*private Q1.Bread makeBread(String breadType) {
        Q1.Bread bread = null;
        if (breadType.equalsIgnoreCase("cream")) {
            bread = new Q1.CreamBread();
        } else if (breadType.equalsIgnoreCase("sugar")) {
            bread = new Q1.SugarBread();
        } else if (breadType.equalsIgnoreCase("butter")) {
            bread = new Q1.ButterBread();
        }
        return bread;
    }*/
}
