public class ResourceController {
    private static ResourceController instance;

    private ResourceController() {
        // Simulación de una operación costosa en tiempo (por ejemplo, carga de configuración)
        try {
            Thread.sleep(100); // 100 ms de retardo para simular la carga
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static synchronized ResourceController getInstance() {
        if (instance == null) {
            instance = new ResourceController();
        }
        return instance;
    }

    public void performAction() {
        // Simulación de una acción en el recurso
        System.out.println("Acción realizada por " + Thread.currentThread().getName());
    }
}