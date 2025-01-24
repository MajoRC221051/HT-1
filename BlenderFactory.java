public class BlenderFactory {
    public static BlenderInterface createBlender() {
        return new Blender(); // Cambiar aquí por `new AdvancedBlender()` si se desea usar la implementación avanzada
    }
}
