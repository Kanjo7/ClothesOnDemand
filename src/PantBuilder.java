public class PantBuilder {

    Pants pants = new Pants();

    // Sätter dit material
    public PantBuilder addMaterial(String material) {
        pants.setMaterial(material);
        return this;
    }

    // Sätter dit byxtyp
    public PantBuilder addType(String type) {
        pants.setType(type);
        return this;
    }

    // Sätter dit passform
    public PantBuilder addFit(String fit) {
        pants.setFit(fit);
        return this;
    }

    // Checkar av så att alla villkor är uppfyllda innan programmet bygger ihop objektet
    public Pants build() {
        if (pants.getMaterial() == "" || pants.getType() == "" || pants.getFit() == "") {
            throw new RuntimeException("Saknar inmatning");
        }
        return pants;
    }
}
