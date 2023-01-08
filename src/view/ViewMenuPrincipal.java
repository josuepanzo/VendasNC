/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Joshua
 */
public class ViewMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ViewMenuPrincipal
     */
    public ViewMenuPrincipal() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
        setColor(btn_Produtos); 
        ind_1.setOpaque(true);
        resetColor(new JPanel[]{btn_Pdv,btn_Clientes,btn_Usuarios,btn_Vendas}, new JPanel[]{ind_2,ind_3, ind_4, ind_5});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Menu = new javax.swing.JPanel();
        pnl_top = new javax.swing.JPanel();
        btn_exit = new javax.swing.JLabel();
        pnl_lateral = new javax.swing.JPanel();
        btn_Produtos = new javax.swing.JPanel();
        ind_1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_Pdv = new javax.swing.JPanel();
        ind_2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_Clientes = new javax.swing.JPanel();
        ind_3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_Usuarios = new javax.swing.JPanel();
        ind_4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btn_Vendas = new javax.swing.JPanel();
        ind_5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        uJPanelImagem1 = new componentes.UJPanelImagem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_Menu.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_top.setBackground(new java.awt.Color(71, 120, 197));
        pnl_top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Exit_25px.png"))); // NOI18N
        btn_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_exitMousePressed(evt);
            }
        });
        pnl_top.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, -1, 20));

        pnl_Menu.add(pnl_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 1250, 50));

        pnl_lateral.setBackground(new java.awt.Color(23, 35, 51));
        pnl_lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Produtos.setBackground(new java.awt.Color(23, 35, 51));
        btn_Produtos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_ProdutosMousePressed(evt);
            }
        });

        ind_1.setOpaque(false);
        ind_1.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(ind_1);
        ind_1.setLayout(ind_1Layout);
        ind_1Layout.setHorizontalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_1Layout.setVerticalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Produtos");

        javax.swing.GroupLayout btn_ProdutosLayout = new javax.swing.GroupLayout(btn_Produtos);
        btn_Produtos.setLayout(btn_ProdutosLayout);
        btn_ProdutosLayout.setHorizontalGroup(
            btn_ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_ProdutosLayout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel8)
                .addGap(0, 44, Short.MAX_VALUE))
        );
        btn_ProdutosLayout.setVerticalGroup(
            btn_ProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_ProdutosLayout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_ProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_lateral.add(btn_Produtos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 130, -1));

        btn_Pdv.setBackground(new java.awt.Color(23, 35, 51));
        btn_Pdv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Pdv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_PdvMouseReleased(evt);
            }
        });

        ind_2.setOpaque(false);
        ind_2.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_2Layout = new javax.swing.GroupLayout(ind_2);
        ind_2.setLayout(ind_2Layout);
        ind_2Layout.setHorizontalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_2Layout.setVerticalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PDV");

        javax.swing.GroupLayout btn_PdvLayout = new javax.swing.GroupLayout(btn_Pdv);
        btn_Pdv.setLayout(btn_PdvLayout);
        btn_PdvLayout.setHorizontalGroup(
            btn_PdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_PdvLayout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addGap(0, 70, Short.MAX_VALUE))
        );
        btn_PdvLayout.setVerticalGroup(
            btn_PdvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_PdvLayout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_PdvLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_lateral.add(btn_Pdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 130, -1));

        btn_Clientes.setBackground(new java.awt.Color(23, 35, 51));
        btn_Clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_ClientesMousePressed(evt);
            }
        });

        ind_3.setOpaque(false);
        ind_3.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_3Layout = new javax.swing.GroupLayout(ind_3);
        ind_3.setLayout(ind_3Layout);
        ind_3Layout.setHorizontalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_3Layout.setVerticalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Clientes");

        javax.swing.GroupLayout btn_ClientesLayout = new javax.swing.GroupLayout(btn_Clientes);
        btn_Clientes.setLayout(btn_ClientesLayout);
        btn_ClientesLayout.setHorizontalGroup(
            btn_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_ClientesLayout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel10)
                .addGap(0, 50, Short.MAX_VALUE))
        );
        btn_ClientesLayout.setVerticalGroup(
            btn_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_ClientesLayout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_ClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_lateral.add(btn_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 130, -1));

        btn_Usuarios.setBackground(new java.awt.Color(23, 35, 51));
        btn_Usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_UsuariosMousePressed(evt);
            }
        });

        ind_4.setOpaque(false);
        ind_4.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_4Layout = new javax.swing.GroupLayout(ind_4);
        ind_4.setLayout(ind_4Layout);
        ind_4Layout.setHorizontalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_4Layout.setVerticalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Usuários");

        javax.swing.GroupLayout btn_UsuariosLayout = new javax.swing.GroupLayout(btn_Usuarios);
        btn_Usuarios.setLayout(btn_UsuariosLayout);
        btn_UsuariosLayout.setHorizontalGroup(
            btn_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_UsuariosLayout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel11)
                .addGap(0, 47, Short.MAX_VALUE))
        );
        btn_UsuariosLayout.setVerticalGroup(
            btn_UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_UsuariosLayout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_UsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_lateral.add(btn_Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 130, -1));

        btn_Vendas.setBackground(new java.awt.Color(23, 35, 51));
        btn_Vendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Vendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_VendasMouseReleased(evt);
            }
        });

        ind_5.setOpaque(false);
        ind_5.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_5Layout = new javax.swing.GroupLayout(ind_5);
        ind_5.setLayout(ind_5Layout);
        ind_5Layout.setHorizontalGroup(
            ind_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_5Layout.setVerticalGroup(
            ind_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Vendas");

        javax.swing.GroupLayout btn_VendasLayout = new javax.swing.GroupLayout(btn_Vendas);
        btn_Vendas.setLayout(btn_VendasLayout);
        btn_VendasLayout.setHorizontalGroup(
            btn_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_VendasLayout.createSequentialGroup()
                .addComponent(ind_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel12)
                .addGap(0, 54, Short.MAX_VALUE))
        );
        btn_VendasLayout.setVerticalGroup(
            btn_VendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_VendasLayout.createSequentialGroup()
                .addComponent(ind_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_VendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_lateral.add(btn_Vendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 130, -1));

        pnl_Menu.add(pnl_lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 770));

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1250, Short.MAX_VALUE)
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        pnl_Menu.add(uJPanelImagem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 1250, 720));

        getContentPane().add(pnl_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ProdutosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProdutosMousePressed
        // TODO add your handling code here:
        setColor(btn_Produtos);
        ind_1.setOpaque(true);
        resetColor(new JPanel[]{btn_Pdv,btn_Clientes,btn_Usuarios,btn_Vendas}, new JPanel[]{ind_2,ind_3, ind_4, ind_5});
        new ViewProduto().setVisible(true);
    }//GEN-LAST:event_btn_ProdutosMousePressed

    private void btn_PdvMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PdvMouseReleased
        // TODO add your handling code here:
        setColor(btn_Pdv);
        ind_2.setOpaque(true);
        resetColor(new JPanel[]{btn_Produtos,btn_Clientes,btn_Usuarios, btn_Vendas}, new JPanel[]{ind_1,ind_3, ind_4, ind_5});
        new ViewPDV().setVisible(true);
    }//GEN-LAST:event_btn_PdvMouseReleased

    private void btn_ClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ClientesMousePressed
        // TODO add your handling code here:
        setColor(btn_Clientes);
        ind_3.setOpaque(true);
        resetColor(new JPanel[]{btn_Pdv,btn_Produtos,btn_Usuarios,btn_Vendas}, new JPanel[]{ind_2,ind_1, ind_4, ind_5});
        new ViewCliente().setVisible(true);
    }//GEN-LAST:event_btn_ClientesMousePressed

    private void btn_UsuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UsuariosMousePressed
        // TODO add your handling code here:
        setColor(btn_Usuarios);
        ind_4.setOpaque(true);
        resetColor(new JPanel[]{btn_Pdv,btn_Clientes,btn_Produtos,btn_Vendas}, new JPanel[]{ind_2,ind_3, ind_1, ind_5});
        new ViewUsuario().setVisible(true);
    }//GEN-LAST:event_btn_UsuariosMousePressed

    private void btn_exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMousePressed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_btn_exitMousePressed

    private void btn_VendasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VendasMouseReleased
        // TODO add your handling code here:
        setColor(btn_Vendas);
        ind_5.setOpaque(true);
        resetColor(new JPanel[]{btn_Pdv,btn_Clientes,btn_Produtos, btn_Usuarios}, new JPanel[]{ind_2,ind_3, ind_1, ind_4});
        new ViewVenda().setVisible(true);
    }//GEN-LAST:event_btn_VendasMouseReleased

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
            java.util.logging.Logger.getLogger(ViewMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMenuPrincipal().setVisible(true);
            }
        });
    }
    
    private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(41,57,80));
    }
    
    private void resetColor(JPanel [] pane, JPanel [] indicators)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(23,35,51));
           
        } for(int i=0;i<indicators.length;i++){
           indicators[i].setOpaque(false);           
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_Clientes;
    private javax.swing.JPanel btn_Pdv;
    private javax.swing.JPanel btn_Produtos;
    private javax.swing.JPanel btn_Usuarios;
    private javax.swing.JPanel btn_Vendas;
    private javax.swing.JLabel btn_exit;
    private javax.swing.JPanel ind_1;
    private javax.swing.JPanel ind_2;
    private javax.swing.JPanel ind_3;
    private javax.swing.JPanel ind_4;
    private javax.swing.JPanel ind_5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnl_Menu;
    private javax.swing.JPanel pnl_lateral;
    private javax.swing.JPanel pnl_top;
    private componentes.UJPanelImagem uJPanelImagem1;
    // End of variables declaration//GEN-END:variables
}
