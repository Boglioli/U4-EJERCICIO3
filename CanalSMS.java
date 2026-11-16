public class CanalSMS extends CanalMensajeria {
    @Override
    public void enviarMensaje(String destinatario, String texto) {
        System.out.println("conectando con servidor de SMS");
        System.out.println("enviando SMS a: " + destinatario);
        System.out.println("mensaje: " + texto);
        System.out.println("SMS enviado correctamente");
    }

}
