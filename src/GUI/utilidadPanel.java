package GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
/*
Si no va, hacer el JPanel del tamaño de la imagen (JComponent)
*/
/**
 *
 * @author OrlandoPadrón
 */
public class utilidadPanel extends JPanel {
    private BufferedImage imag; 
    
    public void setImag(BufferedImage imag) {
        this.imag = imag; 
    }

    @Override 
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setSize(imag.getWidth(),imag.getHeight());
        g.drawImage(imag, 0, 0,this);            
    }


}
