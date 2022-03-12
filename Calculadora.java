//GUDIÑO GALINDO JOSE MIGUEL 
//TOPICOS A
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
public class Calculadora extends JFrame
{
   //RESERVA
  JLabel lblN1, lblN2, Letrero, lblR;
  JButton btnMultiplicar, btnDividir, btnSalir, btnSumar, btnRestar;
  JTextField txtCant1, txtCant2, txtRes;
  JPanel Panel1;
  
  public Calculadora()
  {
   initComponents();
  }
  
  private void initComponents()
  {
   //INICIAZION
    setSize(200,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    txtCant1 = new JTextField(10);
    txtCant2 = new JTextField(10);
    txtRes = new JTextField(10);
    txtRes.setEditable(false);
   
    
    Letrero = new JLabel("CASIO-001");
    lblN1 = new JLabel("\nIngresa N1: ");
    lblN2 = new JLabel("Ingresa N2: ");
    lblR = new JLabel("RESULTADO ");
    
    btnSumar = new JButton("SUMA");
    btnSumar.setMnemonic('s');
    btnRestar = new JButton("RESTA");
    btnRestar.setMnemonic('R');
    btnMultiplicar = new JButton("MULTIPLICACION");
    btnMultiplicar.setMnemonic('M');
    btnDividir = new JButton("DIVICION");
    btnDividir.setMnemonic('D');
    btnSalir = new JButton("EXIT");
    btnSalir.setMnemonic('S');
    
    btnSumar.addMouseListener(new Suma());
    btnRestar.addMouseListener(new Resta());
    btnDividir.addMouseListener(new Divicion());
    btnMultiplicar.addMouseListener(new Multiplicacion());
    btnSalir.addMouseListener(new MyListener());
    
    Panel1 = new JPanel();
    Panel1.add(Letrero);
    Panel1.add(lblN1);
    Panel1.add(txtCant1);
    Panel1.add(lblN2);
    Panel1.add(txtCant2);
    Panel1.add(lblR);
    Panel1.add(txtRes);
    Panel1.add(btnSumar);
    Panel1.add(btnRestar);
    Panel1.add(btnMultiplicar);
    Panel1.add(btnDividir);
    Panel1.add(btnSalir);
    
    setTitle("TopicosAvanzados");
    Panel1.setBackground(Color.BLUE);
    setContentPane(Panel1);
    setVisible(true);
  }
  //operaciones
   private class Suma extends MouseAdapter{
    float numero1 = 0, numero2 = 0, suma;
   
    public void mouseClicked(MouseEvent event){ 
       String num1 = txtCant1.getText();
       numero1 = Integer.parseInt(num1);
       String num2 = txtCant2.getText();
       numero2 = Integer.parseInt(num2);
      try{
           suma = numero1 + numero2;
           txtRes.setText(String.valueOf(suma));       
      }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "INGRESE UN NUMERO ");
        txtCant1.setText(" "); 
        txtCant1.requestFocus();
        txtCant2.setText(" "); 
        txtCant2.requestFocus();
        txtRes.setText("0.00");
      }
    }
  }
  private class Resta extends MouseAdapter{
    float numero1 = 0, numero2 = 0, resta;
   
    public void mouseClicked(MouseEvent event){ 
       String num1 = txtCant1.getText();
       numero1 = Integer.parseInt(num1);
       String num2 = txtCant2.getText();
       numero2 = Integer.parseInt(num2);
      try{
           resta = numero1 - numero2;
           txtRes.setText(String.valueOf(resta));       
      }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "INGRESE UN NUMERO ");
        txtCant1.setText(" "); 
        txtCant1.requestFocus();
        txtCant2.setText(" "); 
        txtCant2.requestFocus();
        txtRes.setText("0.00");
      }
    }
  }
  private class Multiplicacion extends MouseAdapter{
    float numero1 = 0, numero2 = 0, multiplicacion;
   
    public void mouseClicked(MouseEvent event){ 
       String num1 = txtCant1.getText();
       numero1 = Integer.parseInt(num1);
       String num2 = txtCant2.getText();
       numero2 = Integer.parseInt(num2);
      try{
           multiplicacion = numero2 * numero1;
           txtRes.setText(String.valueOf(multiplicacion));         
      }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "INGRESE UN NUMERO ");
        txtCant1.setText(" "); 
        txtCant1.requestFocus();
        txtCant2.setText(" "); 
        txtCant2.requestFocus();
        txtRes.setText("0.00");
      }
    }
  }
  private class Divicion extends MouseAdapter{
    float numero1 = 0, numero2 = 0, divicion;
   
    public void mouseClicked(MouseEvent event){ 
       String num1 = txtCant1.getText();
       numero1 = Integer.parseInt(num1);
       String num2 = txtCant2.getText();
       numero2 = Integer.parseInt(num2);
      try{
           divicion = numero1 / numero2;
           txtRes.setText(String.valueOf(divicion));      
      }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "INGRESE UN NUMERO ");
        txtCant1.setText(" "); 
        txtCant1.requestFocus();
        txtCant2.setText(" "); 
        txtCant2.requestFocus();
        txtRes.setText("0.00");
      }
    }
  }
  
  private class MyListener extends MouseAdapter
  {
   public void mouseClicked(MouseEvent event)
   {
      //ABANDONAR
      System.exit(0);
   }
  }
}