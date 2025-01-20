package View;

import Controller.MainForm;

public class LoginForm extends javax.swing.JFrame {
    public LoginForm() {
        initComponents();
    }

    private void initComponents() {
        ustxt = new javax.swing.JTextField();
        pstxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ustxt.setText("نام کاربری را وارد کنید");
        pstxt.setText("رمز عبور را وارد کنید");
        jButton1.setText("ورود");

        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
            private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
            {

                if(ustxt.getText().equals("admin")&&pstxt.getText().equals("admin"))
                {
                    Controller.MainForm mainForm=new MainForm();

                    new View.MainForm().setVisible(true);
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ustxt, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                        .addComponent(pstxt)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(160, Short.MAX_VALUE)));

        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(ustxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButton1)
                                .addContainerGap(137, Short.MAX_VALUE)));

        pack();
    }



    private javax.swing.JButton jButton1;
    private javax.swing.JTextField pstxt;
    private javax.swing.JTextField ustxt;

}
