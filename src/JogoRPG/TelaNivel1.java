/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JogoRPG;

import Ferramentas.Arquivo;
import Ferramentas.Globais;
import java.awt.Dialog;

/**
 *
 * @author mari
 */
public class TelaNivel1 extends javax.swing.JFrame {

    Arquivo objArquivo;
    Personagens objPersonagem;
    int cont=-1;

    /**
     * Creates new form TelaNivel1
     */
    public TelaNivel1() {
        initComponents();
        Globais.ajustarImagem(getClass().getResource("/imagens/Hospital.jpg"), lblLy);
        Globais.ajustarImagem(getClass().getResource("/imagens/sr.jpeg"), lblIsrC);

        objArquivo = new Arquivo("Personagem.txt");
        objArquivo.abrirLeitura();
        String linha = objArquivo.lerLinha();
        if (linha != null && linha.equals("Marie Curie")) {
            objPersonagem = new Personagens("Marie Curie", "Radiação", 70, 30);
             Globais.ajustarImagem(getClass().getResource("/imagens/MarieCurie.png"), lblIHerroi);

        } else if (linha != null && linha.equals("Nikola Tesla")) {
            objPersonagem = new Personagens("Nikola Tesla", "Eletricidade", 90, 20);
             Globais.ajustarImagem(getClass().getResource("/imagens/NikolaTesla.png"), lblIHerroi);
        } else if (linha != null && linha.equals("Charles Darwin")) {
            objPersonagem = new Personagens("Charles Darwin", "Transformação", 100, 10);
             Globais.ajustarImagem(getClass().getResource("/imagens/CharlesDarwin.png"), lblIHerroi);
        } else if (linha != null && linha.equals("Albert Einstein")) {
            objPersonagem = new Personagens("Albert Einstein", "Relatividade", 80, 30);
             Globais.ajustarImagem(getClass().getResource("/imagens/AlbertEinstein.png"), lblIHerroi);
        } else if (linha != null && linha.equals("Ada Lovelace")) {
            objPersonagem = new Personagens("Ada Lovelace", "Lógica", 90, 20);
            Globais.ajustarImagem(getClass().getResource("/imagens/AdaLovelace.png"), lblIHerroi);
        } else if (linha != null && linha.equals("Sigmund Freud")) {
            objPersonagem = new Personagens("Sigmund Freud", "Controle da mente", 80, 30);
            Globais.ajustarImagem(getClass().getResource("/imagens/freudsf.png"), lblIHerroi);
            
            
        }

        objArquivo.fecharArquivo();
      
        lblHsrC1.setText("<html> Precisamos da sua ajuda " + objPersonagem.getNome()
                + "<br>" + " os nazistas estão vencendo a guerra!");
       lblHerroi.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnHeroi = new javax.swing.JPanel();
        lblHerroi = new javax.swing.JLabel();
        bntAvancar = new javax.swing.JButton();
        lblIHerroi = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblHsrC1 = new javax.swing.JLabel();
        lblIsrC = new javax.swing.JLabel();
        lblLy = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnHeroi.setBackground(new java.awt.Color(51, 51, 0));
        pnHeroi.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CIENTISTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        pnHeroi.setForeground(new java.awt.Color(102, 102, 0));

        lblHerroi.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        lblHerroi.setForeground(new java.awt.Color(255, 255, 255));
        lblHerroi.setText("jLabel1");

        javax.swing.GroupLayout pnHeroiLayout = new javax.swing.GroupLayout(pnHeroi);
        pnHeroi.setLayout(pnHeroiLayout);
        pnHeroiLayout.setHorizontalGroup(
            pnHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeroiLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblHerroi, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        pnHeroiLayout.setVerticalGroup(
            pnHeroiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeroiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHerroi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(pnHeroi, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 330, 120));

        bntAvancar.setBackground(new java.awt.Color(102, 102, 0));
        bntAvancar.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        bntAvancar.setForeground(new java.awt.Color(255, 255, 255));
        bntAvancar.setText("Avançar");
        bntAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAvancarActionPerformed(evt);
            }
        });
        getContentPane().add(bntAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 110, 40));

        lblIHerroi.setText("jLabel1");
        getContentPane().add(lblIHerroi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 109, 143));

        jPanel2.setBackground(new java.awt.Color(51, 51, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHURCHILL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(102, 102, 0));

        lblHsrC1.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        lblHsrC1.setForeground(new java.awt.Color(255, 255, 255));
        lblHsrC1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHsrC1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblHsrC1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 330, 150));

        lblIsrC.setText("jLabel1");
        getContentPane().add(lblIsrC, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 109, 143));

        lblLy.setText("jLabel1");
        getContentPane().add(lblLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAvancarActionPerformed
       try{
        cont++;
        
        if (cont == 1) {
            lblHsrC1.setText("<html>Se eles ganharem o mundo estará em mãos "
                    + "de pessoas muito perigosas...</html>");
            lblHerroi.setText("");
        } else if (cont == 2) {
            lblHsrC1.setText("");
            lblHerroi.setText("Como eu posso ajudar?");
        } else if (cont == 3) {
            lblHsrC1.setText("<html>Você precisa passar pelas questões da enigma, "
                    + "chegar até a localização dos nazistas e elimina-los...</html>");
            lblHerroi.setText("");
        } else if (cont == 4) {
            lblHsrC1.setText("<html>Passe por todos os capangas até chegar em Hittler,"
                    + " derrote-o e venceremos a guerra.</html>");
            lblHerroi.setText("");
           
        } else if (cont == 5) {
             lblHsrC1.setText("Se aprece o mundo está em suas mãos!");
        }  else if (cont == 6) {
            lblHerroi.setText("Pode contar comigo senhor!");
            lblHsrC1.setText("");
            bntAvancar.setText("Começar");
            
        } else if (cont == 7){
            new TelaMapa().setVisible(true);
            dispose();
         
        }
       }catch(Exception ex){
           System.out.println("Erro btnAvancar: " +ex.getMessage());
       }
    }//GEN-LAST:event_bntAvancarActionPerformed

    

    

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
            java.util.logging.Logger.getLogger(TelaNivel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNivel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNivel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNivel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNivel1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAvancar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblHerroi;
    private javax.swing.JLabel lblHsrC1;
    private javax.swing.JLabel lblIHerroi;
    private javax.swing.JLabel lblIsrC;
    private javax.swing.JLabel lblLy;
    private javax.swing.JPanel pnHeroi;
    // End of variables declaration//GEN-END:variables
}
