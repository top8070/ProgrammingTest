package Q1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Bread creamBread = new CreamBreadFactory().makeBread();
        Bread sugarBread = new SugarBreadFactory().makeBread();
        Bread butterBread = new ButterBreadFactory().makeBread();

        List<Bread> breads = new ArrayList<>();
        breads.add(creamBread);
        breads.add(sugarBread);
        breads.add(butterBread);

        for (Bread bread : breads) {
            System.out.printf("breadType: %s%n", bread.breadType);
            System.out.println("recipe");
            bread.recipe.entrySet()
                    .forEach(b -> System.out.println(b.getKey() + ": " + b.getValue()));
            System.out.println();
        }
    }
}
