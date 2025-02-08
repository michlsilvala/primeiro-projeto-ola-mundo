
package classe;


public class TelaMensagem extends javax.swing.JFrame {
    
    static int cont = 0;

    
    public TelaMensagem() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msg1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Primeiro Programa");
        setResizable(false);

        msg1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        msg1.setForeground(new java.awt.Color(0, 0, 255));
        msg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msg1.setText("Aqui vai aparecer uma mensagem.");
        msg1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 51, 51));
        btn1.setText("Clique aqui!");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Primeiro Programa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(msg1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1)
                    .addComponent(jLabel1))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addComponent(msg1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btn1)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        
           
           if(cont == 0){
               msg1.setText("Olá mundo!");
               cont++;
           }else{
               msg1.setText("Aqui vai aparecer uma mensagem.");
               cont = 0;
           }
        
    }//GEN-LAST:event_btn1ActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMensagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel msg1;
    // End of variables declaration//GEN-END:variables
}
