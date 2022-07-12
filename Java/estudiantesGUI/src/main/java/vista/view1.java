package vista;

import javax.swing.JButton;

public class view1 extends javax.swing.JFrame {
    public view1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_header = new javax.swing.JLabel();
        lbl_subheader = new javax.swing.JLabel();
        btn_new = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        btn_modify = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_show = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_header.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_header.setText("Universidad de Antioquia");

        lbl_subheader.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_subheader.setText("Main Menu - Select an Option");

        btn_new.setText("Register New Student");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_search.setText("Search Student Register");

        btn_modify.setText("Modify Student Register");
        btn_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifyActionPerformed(evt);
            }
        });

        btn_delete.setText("Delete Student Register");

        btn_show.setText("Show Student Register");

        btn_exit.setText("Exit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lbl_header)
                .addGap(0, 51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_exit)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_subheader)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_search)
                            .addComponent(btn_new)
                            .addComponent(btn_modify)
                            .addComponent(btn_show)
                            .addComponent(btn_delete))
                        .addGap(174, 174, 174))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl_header)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_subheader)
                .addGap(47, 47, 47)
                .addComponent(btn_new)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_modify)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_show)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btn_exit)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed

    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifyActionPerformed

    }//GEN-LAST:event_btn_modifyActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_modify;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_show;
    private javax.swing.JLabel lbl_header;
    private javax.swing.JLabel lbl_subheader;
    // End of variables declaration//GEN-END:variables

    public JButton getBtn_delete() {
        return btn_delete;
    }

    public void setBtn_delete(JButton btn_delete) {
        this.btn_delete = btn_delete;
    }

    public JButton getBtn_exit() {
        return btn_exit;
    }

    public void setBtn_exit(JButton btn_exit) {
        this.btn_exit = btn_exit;
    }

    public JButton getBtn_modify() {
        return btn_modify;
    }

    public void setBtn_modify(JButton btn_modify) {
        this.btn_modify = btn_modify;
    }

    public JButton getBtn_new() {
        return btn_new;
    }

    public void setBtn_new(JButton btn_new) {
        this.btn_new = btn_new;
    }

    public JButton getBtn_search() {
        return btn_search;
    }

    public void setBtn_search(JButton btn_search) {
        this.btn_search = btn_search;
    }

    public JButton getBtn_show() {
        return btn_show;
    }

    public void setBtn_show(JButton btn_show) {
        this.btn_show = btn_show;
    }



}
