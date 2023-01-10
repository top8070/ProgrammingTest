package Q1;

public class SugarBread extends Bread{
    public SugarBread(String breadType, int flour, int water, int sugar) {
        this.breadType = breadType;
        recipe.put("flour", flour);
        recipe.put("water", water);
        recipe.put("sugar", sugar);
    }
}
