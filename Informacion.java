import java.util.HashMap;

// Clase Usuario
public class Usuario {
    private String nombre;
    private String ID;
    private String contrasena;  // Añadimos un atributo para la contraseña

    public Usuario(String nombre, String ID, String contrasena) {
        this.nombre = nombre;
        this.ID = ID;
        this.contrasena = contrasena;
    }

    // Getters y setters para los atributos

    // Otros métodos relacionados con el usuario
}

// Clase BaseDatos
public class BaseDatos {
    private HashMap<String, Usuario> usuarios;  // Usamos un HashMap para almacenar usuarios por su ID

    public BaseDatos() {
        usuarios = new HashMap<>();
    }

    // Métodos para guardar y obtener información de usuarios
    public void guardarUsuario(Usuario usuario) {
        usuarios.put(usuario.getID(), usuario);
    }

    public Usuario obtenerUsuario(String ID) {
        return usuarios.get(ID);
    }
}

// Clase AplicacionReservas
public class AplicacionReservas {
    private BaseDatos baseDatos;
    private Usuario usuarioActual;  // Mantenemos un seguimiento del usuario que ha iniciado sesión

    public AplicacionReservas(BaseDatos baseDatos) {
        this.baseDatos = baseDatos;
        this.usuarioActual = null;  // Inicialmente, no hay usuario autenticado
    }

    // Método para iniciar sesión
    public boolean iniciarSesion(String ID, String contrasena) {
        Usuario usuario = baseDatos.obtenerUsuario(ID);
        if (usuario != null && usuario.getContrasena().equals(contrasena)) {
            usuarioActual = usuario;
            return true;  // Inicio de sesión exitoso
        }
        return false;  // Inicio de sesión fallido
    }

    // Método para registrar un nuevo usuario
    public boolean registrarUsuario(String nombre, String ID, String contrasena) {
        if (baseDatos.obtenerUsuario(ID) == null) {
            Usuario nuevoUsuario = new Usuario(nombre, ID, contrasena);
            baseDatos.guardarUsuario(nuevoUsuario);
            return true;  // Registro exitoso
        }
        return false;  // El usuario ya existe
    }

    // Otros métodos para la lógica de reservas
}
