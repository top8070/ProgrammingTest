package Q1;

public class ButterBread extends Bread{
    public ButterBread(String breadType, int flour, int water, int butter) {
        this.breadType = breadType;
        recipe.put("flour", flour);
        recipe.put("water", water);
        recipe.put("butter", butter);
    }
}
