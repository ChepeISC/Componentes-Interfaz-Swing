import javax.swing.*;
import java.awt.*;

 public class AddAtomicComponents{

  public static void main(String[] args){
      
   JFrame frame=new JFrame("Ejemplo de Componentes");
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setBounds(50,50,300,300);
   Container cp=frame.getContentPane();
   FlowLayout fl=new FlowLayout();
   cp.setLayout(fl); 
   JLabel etiqueta=new JLabel("Etiqueta");
   cp.add(etiqueta);
    
   JButton boton=new JButton("Close");
   cp.add(boton);
   frame.setVisible(true);
   }
}
