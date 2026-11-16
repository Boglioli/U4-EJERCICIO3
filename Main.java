public class Main {
    public static void main(String[] args) {
        CanalMensajeria email = new CanalEmail();
        CanalMensajeria sms = new CanalSMS();
        CanalMensajeria push = new CanalPush();
        ServicioNotificaciones servicio = new ServicioNotificaciones();
        servicio.enviar(email, "usuario@gmal.com", "bienvenido al sistema");
        System.out.println("--------------------------------------------------");
        servicio.enviar(sms, "1234567890", "su cuenta fue actualizada");
        System.out.println("--------------------------------------------------");
        servicio.enviar(push, "dispositivo 001", "tienes un nuevo mensaje");
    }
}