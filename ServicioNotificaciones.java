public class ServicioNotificaciones {
    public void enviar(CanalMensajeria canal, String destinatario, String texto) {
        canal.enviarMensaje(destinatario, texto);
    }
}
