package Modelo;

/**
 *
 * @author Franco Luna
 */
public class SesionActiva {
    private static MiembroMesa usuarioActivo;

    public static MiembroMesa getUsuarioActivo() {
        return usuarioActivo;
    }

    public static void setUsuarioActivo(MiembroMesa usuario) {
        usuarioActivo = usuario;
    }

    public static void cerrarSesion() {
        usuarioActivo = null;
    }
}
