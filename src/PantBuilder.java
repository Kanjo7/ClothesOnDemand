public class PantBuilder {

    Pants pants = new Pants();

    public PantBuilder addMaterial(String material) {
        pants.setMaterial(material);
        return this;
    }

    public PantBuilder addType(String type) {
        pants.setType(type);
        return this;
    }

    public PantBuilder addFit(String fit) {
        pants.setFit(fit);
        return this;
    }

    public Pants build() {
        if (pants.getMaterial() == "" || pants.getType() == "" || pants.getFit() == "") {
            throw new RuntimeException("Saknar inmatning");
        }
        return pants;
    }
}
