import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.UUID;

public class TShirt {

    // Variabler
    private String id = UUID.randomUUID().toString();

    private String name = "Tshirt";

    private String size;

    private double price = 199.99;

    private String material;

    private String color;

    private String sleeves;

    private String neck;

    // Klass som tillhandhåller support för att lyssna på förändringar i vårt objekt
    private PropertyChangeSupport propertyChangeSupport;
    private boolean receivedOrder = false;
    private boolean finishedManufacturing = false;

    // sätter this som referens till det här objektet
    public TShirt() {
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    // Konstruktor
    public TShirt(String id, String name, String size, double price, String material, String color, String sleeves, String neck, PropertyChangeSupport propertyChangeSupport, boolean receivedOrder, boolean finishedManufacturing) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.price = price;
        this.material = material;
        this.color = color;
        this.sleeves = sleeves;
        this.neck = neck;
        this.propertyChangeSupport = propertyChangeSupport;
        this.receivedOrder = receivedOrder;
        this.finishedManufacturing = finishedManufacturing;
    }

    // Skickar in en lyssnare och lägger till listener
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSleeves() {
        return sleeves;
    }

    public void setSleeves(String sleeves) {
        this.sleeves = sleeves;
    }

    public String getNeck() {
        return neck;
    }

    public void setNeck(String neck) {
        this.neck = neck;
    }

    public PropertyChangeSupport getPropertyChangeSupport() {
        return propertyChangeSupport;
    }

    public void setPropertyChangeSupport(PropertyChangeSupport propertyChangeSupport) {
        this.propertyChangeSupport = propertyChangeSupport;
    }

    public boolean isReceivedOrder() {
        return receivedOrder;
    }

    public void setReceivedOrder(boolean receivedOrder) {
        // Rapporterar förändring och lagrar gammal beställning
        boolean oldState = this.receivedOrder;
        this.receivedOrder = receivedOrder;
        // tar emot tre stycken paramterar
        this.propertyChangeSupport.firePropertyChange("en order har mottagits", oldState, this.receivedOrder);
    }

    public boolean isFinishedManufacturing() {
        return finishedManufacturing;
    }

    public void setFinishedManufacturing(boolean finishedManufacturing) {
        boolean oldState = this.finishedManufacturing;
        this.finishedManufacturing = finishedManufacturing;
        this.propertyChangeSupport.firePropertyChange("en Tshirt har tillverkats", oldState, this.receivedOrder);
    }
}
