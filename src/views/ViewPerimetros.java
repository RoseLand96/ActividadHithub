/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author AlfrEdO..XD
 */
public class ViewPerimetros extends javax.swing.JPanel {

    /**
     * Creates new form Perimetros
     */
    public ViewPerimetros() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jl_num1 = new javax.swing.JLabel();
        jl_num2 = new javax.swing.JLabel();
        jtf_num1 = new javax.swing.JTextField();
        jtf_altura = new javax.swing.JTextField();
        jcb_figuras = new javax.swing.JComboBox<>();
        jbtn_calcular = new javax.swing.JButton();
        jl_resultado = new javax.swing.JLabel();
        jtf_resultado = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jl_num1.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jl_num1.setForeground(new java.awt.Color(255, 255, 255));
        jl_num1.setText("Ingresa cualquier numero");

        jl_num2.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jl_num2.setForeground(new java.awt.Color(255, 255, 255));
        jl_num2.setText("ingresar cualquier numero");

        jcb_figuras.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jcb_figuras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Esfera", "Cubo", "Prisma" }));
        jcb_figuras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_figurasActionPerformed(evt);
            }
        });

        jbtn_calcular.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jbtn_calcular.setText("Calcular");

        jl_resultado.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jl_resultado.setForeground(new java.awt.Color(255, 255, 255));
        jl_resultado.setText("Resultado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jl_num2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jl_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_num1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(97, 97, 97))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_resultado)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcb_figuras, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn_calcular)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jtf_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_num1)
                    .addComponent(jtf_num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_num2)
                    .addComponent(jtf_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_figuras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_calcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_resultado)
                    .addComponent(jtf_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcb_figurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_figurasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_figurasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel jPanel1;
    public javax.swing.JButton jbtn_calcular;
    public javax.swing.JComboBox<String> jcb_figuras;
    public javax.swing.JLabel jl_num1;
    public javax.swing.JLabel jl_num2;
    javax.swing.JLabel jl_resultado;
    public javax.swing.JTextField jtf_altura;
    public javax.swing.JTextField jtf_num1;
    public javax.swing.JTextField jtf_resultado;
    // End of variables declaration//GEN-END:variables
}
