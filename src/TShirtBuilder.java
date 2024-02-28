public class TShirtBuilder {

    TShirt tShirt = new TShirt();

    public TShirtBuilder addMaterial(String material) {
        tShirt.setMaterial(material);
        return this;
    }

    public TShirtBuilder addSleeves(String sleeves) {
        tShirt.setSleeves(sleeves);
        return this;
    }

    public TShirtBuilder addNeck(String neck) {
        tShirt.setNeck(neck);
        return this;
    }

    public TShirt build() {
        if (tShirt.getMaterial() == "" || tShirt.getSleeves() == "" || tShirt.getNeck() == "") {
            throw new RuntimeException("Saknar inmatning");
        }
        return tShirt;
    }
}
