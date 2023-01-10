package Q1;

public class CreamBread extends Bread{
    public CreamBread(String breadType, int flour, int water, int cream) {
        this.breadType = breadType;
        recipe.put("flour", flour);
        recipe.put("water", water);
        recipe.put("cream", cream);
    }
}
