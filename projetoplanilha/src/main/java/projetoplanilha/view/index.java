package projetoplanilha.view;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Font;

public class index extends JFrame {

    JButton buttonCancel = new JButton( "Cancelar");
    JLabel label = new JLabel("Relatórios dos produtos");

    public index(){
        setTitle("Relatorio Produtos");
        setSize(900,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());

        label.setFont(new Font("Serif", Font.BOLD, 36));
        buttonCancel.addActionListener(e->dispose());
        
        add(label);
        add(buttonCancel);

        setVisible(true);
    }

    
}
