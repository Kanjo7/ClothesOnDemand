public class SkirtBuilder {

    Skirt skirt = new Skirt();

    // Sätter dit material
    public SkirtBuilder addMaterial(String material) {
        skirt.setMaterial(material);
        return this;
    }
    // Sätter dit midja
    public SkirtBuilder addWaistline(String waistline) {
        skirt.setWaistline(waistline);
        return this;
    }

    // Sätter dit mönster
    public SkirtBuilder addPattern(String pattern) {
        skirt.setPattern(pattern);
        return this;
    }
    // Checkar av så att alla villkor är uppfyllda innan programmet bygger ihop objektet
    public Skirt build() {
        if (skirt.getMaterial() == "" || skirt.getWaistline() == "" || skirt.getPattern() == "") {
            throw new RuntimeException("Saknar inmatning");
        }
        return skirt;
    }
}
