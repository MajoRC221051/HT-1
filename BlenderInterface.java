public interface BlenderInterface {
    void turnOn();
    void fill(String content);
    void increaseSpeed();
    int getSpeed();
    boolean isFull();
    boolean isOn(); // Nuevo método para verificar si está encendida
    void emptyBlender();
}
