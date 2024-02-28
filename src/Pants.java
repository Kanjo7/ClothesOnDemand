import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.UUID;

public class Pants {
    private String id = UUID.randomUUID().toString();
    private String name = "Byxor";
    private String type;
    private String size;
    private double price = 699.99;
    private String color;
    private String fit;
    private String length;
    private String material;
    private PropertyChangeSupport propertyChangeSupport;
    private boolean receivedOrder = false;
    private boolean finishedManufacturing = false;

    public Pants() {
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public Pants(String id, String name, String type, String size, double price, String color, String fit, String length, String material, PropertyChangeSupport propertyChangeSupport, boolean receivedOrder, boolean finishedManufacturing) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.size = size;
        this.price = price;
        this.color = color;
        this.fit = fit;
        this.length = length;
        this.material = material;
        this.propertyChangeSupport = propertyChangeSupport;
        this.receivedOrder = receivedOrder;
        this.finishedManufacturing = finishedManufacturing;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
        boolean oldState = this.receivedOrder;
        this.receivedOrder = receivedOrder;
        this.propertyChangeSupport.firePropertyChange("en order har mottagits", oldState, this.receivedOrder);
    }
    public boolean isFinishedManufacturing() {
        return finishedManufacturing;
    }

    public void setFinishedManufacturing(boolean finishedManufacturing) {
        boolean oldState = this.finishedManufacturing;
        this.finishedManufacturing = finishedManufacturing;
        this.propertyChangeSupport.firePropertyChange("ett par byxor har tillverkats", oldState, this.receivedOrder);
    }
}