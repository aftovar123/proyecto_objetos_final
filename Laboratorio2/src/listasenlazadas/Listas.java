/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author mduarte
 */
public class Listas extends javax.swing.JFrame {

    public Listas() {
        initComponents();
        DefaultListModel model = new DefaultListModel();
        lista.setModel(model);
        ptr = null;
        DefaultListModel model2 = new DefaultListModel();
        lista2.setModel(model2);
        ptr2 = null;
        DefaultListModel model3 = new DefaultListModel();
        lista3.setModel(model3);
        ptr3 = null;
    }

    class Nodo{
        int num;
        Nodo Link;
    }
    
    Nodo ptr;
    Nodo ptr2;
    Nodo ptr3;
    
    Nodo addpila(Nodo ptr, int num){
        Nodo q = new Nodo();
        q.num = num;
        q.Link = ptr;
        ptr = q;
        return ptr;
    }
    
    Nodo addcola(Nodo ptr, int num){
        Nodo p = ptr;
        Nodo q = new Nodo();
        q.num = num;
        if(ptr == null){
            ptr = q;
        }else{
            while(p.Link != null){
                p = p.Link;
            }
            p.Link = q;
        }
        return ptr;
    }
    
    Nodo Ordenado(Nodo ptr, int num){
        
        if(ptr == null){
            Nodo q = new Nodo();
            q.num = num;
            ptr = q;
        }else{
            Nodo antp = null;
            Nodo p = ptr;
            while(p.num<num && p.Link != null){
                antp = p;
                p = p.Link;
            }
            if(p.num == num){
              // JOptionPane.showMessageDialog(null, "No se aceptan repetidos");
            {
                Nodo q = new Nodo();
                q.num = num;
                
                if(p.num >= num){
                    if(p == ptr){
                        q.Link = ptr;
                        ptr = q;
                    }else{
                        antp.Link = q;
                        q.Link = p;
                    }
                }else{
                    p.Link = q;
                    q.Link = null;
                }
            }
                   
            }else{
                Nodo q = new Nodo();
                q.num = num;
                
                if(p.num > num){
                    if(p == ptr){
                        q.Link = ptr;
                        ptr = q;
                    }else{
                        antp.Link = q;
                        q.Link = p;
                    }
                }else{
                    p.Link = q;
                    q.Link = null;
                }
            }
        }
        
        return ptr;
    }
    
    Nodo Interseccion(Nodo ptr, Nodo ptr2, Nodo ptr3){
        
        Nodo p = ptr;
        ptr3 = null;
        while(p != null){
            Nodo q = ptr2;
            while(q != null){
                if(p.num == q.num){
                    Nodo k = ptr3;
                    Nodo z = new Nodo();
                    z.num = p.num;
                    z.Link = ptr3;
                    ptr3 = z;
                    q = null;
                }else{
                    q = q.Link;
                }
            }
            p = p.Link;
        }
        
        return ptr3;
    }
    
    
    void showList(Nodo ptr){
        DefaultListModel model = (DefaultListModel) lista.getModel();
        model.clear();
        Nodo p = ptr;
        while(p != null){
            model.addElement(p.num);
            p = p.Link;
        }
    }
    
    void showList2(Nodo ptr){
        DefaultListModel model2 = (DefaultListModel) lista2.getModel();
        model2.clear();
        Nodo p = ptr;
        while(p != null){
            model2.addElement(p.num);
            p = p.Link;
        }
    }
    
    void showList3(Nodo ptr){
        DefaultListModel model3 = (DefaultListModel) lista3.getModel();
        model3.clear();
        Nodo p = ptr;
        while(p != null){
            model3.addElement(p.num);
            p = p.Link;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        num = new javax.swing.JTextField();
        Pila = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Cola = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        Eliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lista3 = new javax.swing.JList<>();
        ALista1 = new javax.swing.JButton();
        Alista2 = new javax.swing.JButton();
        Interseccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pila.setText("Agregar Pila");
        Pila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nodo:");

        Cola.setText("Agregar Cola");
        Cola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColaActionPerformed(evt);
            }
        });

        lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lista);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        jButton1.setText("Eliminar Todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lista2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lista2);

        lista3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lista3);

        ALista1.setText("Agregar Lista 1");
        ALista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ALista1ActionPerformed(evt);
            }
        });

        Alista2.setText("Agregar Lista 2");
        Alista2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alista2ActionPerformed(evt);
            }
        });

        Interseccion.setText("Interseccion");
        Interseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterseccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ALista1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Eliminar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pila, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(Cola, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(176, 176, 176)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(Alista2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)
                                .addComponent(Interseccion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pila)
                            .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(Cola)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Alista2)
                            .addComponent(Interseccion))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ALista1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Eliminar)
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilaActionPerformed
        
        String numero = num.getText();
        if(!numero.isEmpty()){
            int num = Integer.parseInt(numero);
            ptr = addpila(ptr,num);
            showList(ptr);
        }
        
    }//GEN-LAST:event_PilaActionPerformed

    private void ColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColaActionPerformed
        String numero = num.getText();
        if(!numero.isEmpty()){
            int num = Integer.parseInt(numero);
            ptr = addcola(ptr,num);
            showList(ptr);
        }
    }//GEN-LAST:event_ColaActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int cont;
        cont=0;
        
        Nodo ant = null;
        Nodo p = ptr;
        String numero = num.getText();
        int num = Integer.parseInt(numero);
        if(!numero.isEmpty() && ptr != null){
           /* while(p.Link != null && p.num != num){
                ant = p;
                p = p.Link;
            }*/
            while(p.Link != null){ 
            if(p.num == num){
               
             cont=cont+1; 
             }
            p=p.Link;
            
            } 
             JOptionPane.showMessageDialog(null, cont);
            
        }
           ant = null;
            p = ptr;
        while(cont-1>0){
         
         if(!numero.isEmpty() && ptr != null){
            while(p.Link != null && p.num != num){
                ant = p;
                p = p.Link;
            }
            
            if(p.num == num){
                if(p == ptr){
                   ptr = ptr.Link;
                   p = ptr;
                }else{
                    ant.Link = p.Link;
                }
            }
            showList(ptr);
        }
        cont=cont-1;
    }//GEN-LAST:event_EliminarActionPerformed
   
    
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Nodo ant = null;
        Nodo p = ptr;
        String numero = num.getText();
        int num = Integer.parseInt(numero);
        if(!numero.isEmpty() && ptr != null){
            while(p != null){

            if(p.num == num){
                if(p == ptr){
                    ptr = ptr.Link;
                    p = ptr;
                }else{
                    ant.Link = p.Link;
                    p = ant.Link;
                }
            }else{
                ant = p;
                p = p.Link;
            }
            }
            showList(ptr);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ALista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ALista1ActionPerformed
       
        //lista1
        String numero = num.getText();
        if(!numero.isEmpty()){
            int num = Integer.parseInt(numero);
            ptr = Ordenado(ptr,num);
            showList(ptr);
        }
    }//GEN-LAST:event_ALista1ActionPerformed

    private void InterseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterseccionActionPerformed
        ptr3 = Interseccion(ptr, ptr2, ptr3);
        showList3(ptr3);
    }//GEN-LAST:event_InterseccionActionPerformed

    private void Alista2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alista2ActionPerformed
        String numero = num.getText();
        if(!numero.isEmpty()){
            int num = Integer.parseInt(numero);
            ptr2 = Ordenado(ptr2,num);
            showList2(ptr2);
        }
    }//GEN-LAST:event_Alista2ActionPerformed

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
            java.util.logging.Logger.getLogger(Listas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ALista1;
    private javax.swing.JButton Alista2;
    private javax.swing.JButton Cola;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Interseccion;
    private javax.swing.JButton Pila;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lista;
    private javax.swing.JList<String> lista2;
    private javax.swing.JList<String> lista3;
    private javax.swing.JTextField num;
    // End of variables declaration//GEN-END:variables
}
