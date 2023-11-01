package Modelos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class BotãoExcl {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo");
        JTextField textField = new JTextField();
        JButton button = new JButton("Limpar");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });

        frame.add(textField);
        frame.add(button);

        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}