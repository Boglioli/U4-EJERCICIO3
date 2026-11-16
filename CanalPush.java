public class CanalPush extends CanalMensajeria {
    @Override
    public void enviarMensaje(String destinatario, String texto) {
        System.out.println("conectando con servidor de Push");
        System.out.println("enviando notificación a: " + destinatario);
        System.out.println("mensaje: " + texto);
        System.out.println("notificación enviada correctamente");
    }
}
