public class Blender implements BlenderInterface {
    private int speed;         // La velocidad de la licuadora
    private boolean isOn;      // Estado de encendido
    private boolean isFull;    // Estado de contenido

    public Blender() {
        this.speed = 0;        // Empieza apagada
        this.isOn = false;
        this.isFull = false;
    }

    @Override
    public void turnOn() {
        if (!isOn) {
            this.isOn = true;
            System.out.println("La licuadora está ENCENDIDA con funciones avanzadas.");
        } else {
            System.out.println("La licuadora ya está ENCENDIDA.");
        }
    }

    @Override
    public void fill(String content) {
        if (!isOn) {
            System.out.println("Primero enciende la licuadora.");
            return;
        }
        if (!isFull) {
            this.isFull = true;
            System.out.println("Licuadora llena con: " + content + " (control de mezcla activado).");
        } else {
            System.out.println("La licuadora ya está llena.");
        }
    }

    @Override
    public void increaseSpeed() {
        if (!isOn) {
            System.out.println("Licuadora apagada. Enciéndela primero.");
            return;
        }
        if (!isFull) {
            System.out.println("Licuadora vacía. Llénala primero.");
            return;
        }
        if (speed < 10) { // Velocidad máxima aumentada
            speed++;
            System.out.println("Velocidad de la licuadora aumentada a: " + speed);
        } else {
            System.out.println("La licuadora alcanzó su velocidad máxima.");
        }
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public boolean isFull() {
        return this.isFull;
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void emptyBlender() {
        if (isFull) {
            this.isFull = false;
            this.speed = 0; // Resetear velocidad al vaciar
            System.out.println("Licuadora vaciada. Activando función de autolimpieza...");
        } else {
            System.out.println("La licuadora ya está vacía.");
        }
    }
}
