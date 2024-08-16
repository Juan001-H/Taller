package co.edu.uniquindio.poo;

public class NotificacionFactory {

    public Notificaciones createNotificacion(String type) {
        switch (type.toLowerCase()) {
            case "email":
                return new NotificacionEmail();
            case "sms":
                return new NotificacionSms();
            default:
                throw new IllegalArgumentException("tipo de Notificacion desconocido" + type);
        }
    }
}
