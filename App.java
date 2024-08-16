package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {

        NotificacionFactory notificacionFactory = new NotificacionFactory();
        Notificaciones notificacion1 = notificacionFactory.createNotificacion("EMAIL");
        Notificaciones notificacion2 = notificacionFactory.createNotificacion("SMS");

        notificacion1.enviarNotificacion();
        notificacion2.enviarNotificacion();
    }
}
