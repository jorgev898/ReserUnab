import java.util.ArrayList;
import java.util.Date;

// Clase Usuario
public class Usuario {
    private String nombre;
    private String ID;
    // Otros atributos de perfil del usuario

    // Constructor
    public Usuario(String nombre, String ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    // Getters y setters para los atributos

    // Otros métodos relacionados con el usuario
}

// Clase Espacio
public class Espacio {
    private String nombre;
    private int capacidad;
    private ArrayList<String> recursos; // Recursos disponibles en el espacio

    // Constructor
    public Espacio(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.recursos = new ArrayList<>();
    }

    // Getters y setters para los atributos

    // Otros métodos relacionados con el espacio
}

// Clase Reserva
public class Reserva {
    private int IDReserva;
    private Usuario usuario;
    private Espacio espacio;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private ArrayList<String> recursosAdicionales;
    private String comentarios;
    private String estado;

    // Constructor
    public Reserva(int IDReserva, Usuario usuario, Espacio espacio, Date fechaInicio, Date fechaFinalizacion) {
        this.IDReserva = IDReserva;
        this.usuario = usuario;
        this.espacio = espacio;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.recursosAdicionales = new ArrayList<>();
        this.comentarios = "";
        this.estado = "Pendiente"; // Estado inicial
    }

    // Getters y setters para los atributos

    // Otros métodos relacionados con la reserva
}

// Clase AplicacionReservas
public class AplicacionReservas {
    // Lógica central de la aplicación

    // Métodos para crear, modificar, cancelar reservas y generar informes
}

// Clase InterfazUsuario
public class InterfazUsuario {
    // Interfaz gráfica para que los usuarios interactúen con la aplicación
}

// Clase BaseDatos
public class BaseDatos {
    // Métodos para guardar y obtener información de usuarios, espacios y reservas
}

// Clase Validacion
public class Validacion {
    // Métodos para validar la entrada del usuario y garantizar la coherencia de los datos
}
