
package sesion35zavalaED_pila2;

import java.util.Stack;
import javax.swing.JOptionPane;

public class TestLibroPila extends javax.swing.JFrame {
//declaracion de pila de libros
    Stack<Libro> pila= new Stack<Libro>();
    
    Libro libro1= new Libro("Ceballos","C++",2024, "ED. Rama");
    Libro libro2= new Libro("Deltel","Java",2023, "ED. Oscara Wilde");
    Libro libro3= new Libro("Grossman","Angular",2024, "ED. Planeta");
    Libro libro4= new Libro("Ceballo","C",2023, "ED. Trillas");
    Libro libro5= new Libro("Garcia","Android",2024, "ED. Rama");
    
    public TestLibroPila() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnConsultarLibros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setText("Operaciones Libros Biblioteca ZAVALA");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 16, -1, -1));

        btnConsultarLibros.setText("Consultar Libros");
        btnConsultarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarLibrosActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultarLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarLibrosActionPerformed
        //agreagar informacion de libros
        pila.push(libro1);
        pila.push(libro2);
        pila.push(libro3);
        pila.push(libro4);
        pila.push(libro5);
        //imprimir informacion de libros (en la pila)
       
        
       while (!pila.isEmpty()) {//inicia while
            JOptionPane.showMessageDialog(null, "DATOS DE LIBROS"
                                                +"\nAutor :"+pila.peek().getAutor()
                                                +"\nTitulo :"+pila.peek().getTitulo()
                                                +"\nFecha de publicacion :"+pila.peek().getAnio()
                                                +"\nEditorial :"+pila.peek().getEditorial());
            pila.pop();//ultimo elemento de la pila, arroja datos
        }//termina while
    }//GEN-LAST:event_btnConsultarLibrosActionPerformed

    /**
     * @param args the command line arguments
         */
     public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestLibroPila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarLibros;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
