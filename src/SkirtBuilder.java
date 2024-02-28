public class SkirtBuilder {

    Skirt skirt = new Skirt();

    public SkirtBuilder addMaterial(String material) {
        skirt.setMaterial(material);
        return this;
    }

    public SkirtBuilder addWaistline(String waistline) {
        skirt.setWaistline(waistline);
        return this;
    }

    public SkirtBuilder addPattern(String pattern) {
        skirt.setPattern(pattern);
        return this;
    }

    public Skirt build() {
        if (skirt.getMaterial() == "" || skirt.getWaistline() == "" || skirt.getPattern() == "") {
            throw new RuntimeException("Saknar inmatning");
        }
        return skirt;
    }
}
