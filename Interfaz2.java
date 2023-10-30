import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InterfazGrafica extends JFrame {
    private ArrayList<Reserva> reservas;

    public InterfazGrafica(ArrayList<Reserva> reservas) {
        this.reservas = reservas;

        setTitle("Aplicación de Reservas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Bienvenido a la aplicación de reservas");
        panel.add(label, BorderLayout.NORTH);

        JTextArea reservaTextArea = new JTextArea();
        panel.add(new JScrollPane(reservaTextArea), BorderLayout.CENTER);

        JButton obtenerReservasButton = new JButton("Obtener Reservas");
        obtenerReservasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarReservas();
            }
        });
        panel.add(obtenerReservasButton, BorderLayout.SOUTH);

        add(panel);
    }

    private void mostrarReservas() {
        // Obtener y mostrar la lista de reservas en el JTextArea
        StringBuilder reservasText = new StringBuilder();
        for (Reserva reserva : reservas) {
            reservasText.append(reserva.toString()).append("\n");
        }
        reservaTextArea.setText(reservasText.toString());
    }

    public static void main(String[] args) {
        // Supongamos que tienes una lista de reservas
        ArrayList<Reserva> reservas = new ArrayList<>();
        // Agrega reservas a la lista según tus necesidades

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfazGrafica(reservas).setVisible(true);
            }
        });
    }
}
