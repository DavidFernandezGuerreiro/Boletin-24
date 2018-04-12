
package boletin24;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author dfernandezguerreiro
 */
public class Eventos implements ActionListener {
    
    JFrame marco;
    JPanel panel;
    JButton bPintar,bLimpar;
    JTextField mostra;
    JLabel circulo;
    boolean dibujar=false;
    
    public Eventos() {
        marco=new JFrame("Boletin 24");
        panel=new JPanel();
        bPintar=new JButton("pintar");
        bLimpar=new JButton("limpar");
        circulo=new JLabel("Circulos: ");
        mostra=new JTextField(8);
        marco.setSize(800, 400);
        panel.add(bPintar);
        panel.add(bLimpar);
        panel.add(circulo);
        panel.add(mostra);
        marco.add(panel);
        bPintar.addActionListener(this);
        bLimpar.addActionListener(this);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Graphics g=panel.getGraphics();
        Object boton=e.getSource();
        if(boton==bPintar){
           g.setColor(Color.RED);
            int circulos=Integer.parseInt(mostra.getText());
            for(int i=0;i<circulos;i++){
                int x1= (int) (Math.random()*100)+60;
                int y1= (int) (Math.random()*100)+80;
                g.drawOval(x1, y1, 200, 200);
            }
        }else if(boton==bLimpar){
            panel.paint(g);
        }
        
        }
    
}
