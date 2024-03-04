public class TShirtBuilder {

    TShirt tShirt = new TShirt();

    // Sätter dit material
    public TShirtBuilder addMaterial(String material) {
        tShirt.setMaterial(material);
        return this;
    }

    // Sätter dit armlängd
    public TShirtBuilder addSleeves(String sleeves) {
        tShirt.setSleeves(sleeves);
        return this;
    }

    // Sätter dit krage
    public TShirtBuilder addNeck(String neck) {
        tShirt.setNeck(neck);
        return this;
    }

    // Checkar av så att alla villkor är uppfyllda innan programmet bygger ihop objektet
    public TShirt build() {
        if (tShirt.getMaterial() == "" || tShirt.getSleeves() == "" || tShirt.getNeck() == "") {
            throw new RuntimeException("Saknar inmatning");
        }
        return tShirt;
    }
}
