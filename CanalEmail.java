public class CanalEmail extends CanalMensajeria {
    @Override
    public void enviarMensaje(String destinatario, String texto) {
        System.out.println("conectando con servidor de Email");
        System.out.println("enviando correo a: " + destinatario);
        System.out.println("mensaje: " + texto);
        System.out.println("correo enviado correctamente");
    }
}
