//Importamos las bibliotecas necesarias.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Declaramos la clase ComponentesMenuSwing
public class ComponentesMenuSwing extends JFrame implements ActionListener{
    //Declaramos los objetos
    private JMenuBar mb;
    private JMenu menu1;
    private JMenuItem mi1,mi2,mi3;
    public ComponentesMenuSwing() {
        setLayout(null);
	//Objeto de la clase JMenuBar
        mb=new JMenuBar();
        setJMenuBar(mb);
	//Objeto de la clase JMenu
        menu1=new JMenu("Opciones");
        mb.add(menu1);
	//Objeto de la clase JMenuItem
        mi1=new JMenuItem("Rojo");
        mi1.addActionListener(this);
        menu1.add(mi1);
        mi2=new JMenuItem("Verde");
        mi2.addActionListener(this);
        menu1.add(mi2);
        mi3=new JMenuItem("Azul");
        mi3.addActionListener(this);
        menu1.add(mi3);               
    }
//Referencia al panel asociado con el JFrame
public void actionPerformed(ActionEvent e) {
    	Container f=this.getContentPane();
       //If para identificar el JMenuItem seleccionado.
       if (e.getSource()==mi1) {
            f.setBackground(new Color(255,0,0));
        }
        if (e.getSource()==mi2) {
            f.setBackground(new Color(0,255,0));
        }
        if (e.getSource()==mi3) {
            f.setBackground(new Color(0,0,255));
        }        
    }
    
    public static void main(String[] ar) {
        ComponentesMenuSwing formulario1=new ComponentesMenuSwing();
        formulario1.setBounds(10,20,300,200);
        formulario1.setVisible(true);
    }    
}
