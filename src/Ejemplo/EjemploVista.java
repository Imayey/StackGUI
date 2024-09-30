package Ejemplo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class EjemploVista {
    private JPanel pPrincipal;
    private JButton bAgregar;
    private JButton bQuitar;
    private JTextField tfRecordatorio;
    private JTextPane tpMostrar;

    public EjemploVista() {
        Stack<String> stack = new Stack<>();
        bAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Recordatorio recordatorio = new Recordatorio();
                String elemento = tfRecordatorio.getText();
                if (recordatorio.estaLlena()) {
                    JOptionPane.showMessageDialog(null, "Error: La pila está llena.");
                    return;
                }
                stack.push(elemento);
                tfRecordatorio.setText("");
                String todosRecordatorios = "";
                for (String record : stack) {
                    todosRecordatorios = todosRecordatorios + record + "\n";
                }
                tpMostrar.setText(todosRecordatorios);
            }
        });

        bQuitar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Recordatorio recordatorio = new Recordatorio();
                if (!stack.isEmpty()) {
                    String elemento = stack.pop();
                } else {
                    JOptionPane.showMessageDialog(null, "La pila está vacía.");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("EjemploVista");
        frame.setContentPane(new EjemploVista().pPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
    }

}
