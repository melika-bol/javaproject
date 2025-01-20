package View;

import tourproject.PLACES.EntityPlace;
import tourproject.PLACES.ServicePlace;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PlaceForm extends javax.swing.JFrame{

    EntityPlace entityPlace;
    ServicePlace servicePlace;

    public PlaceForm() {
        initComponents();
    }
    private void initComponents()
    {
        jTabbedPane1 = new javax.swing.JTabbedPane();

        jPanel1 = new javax.swing.JPanel();
        codetxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();


        jPanel4 = new javax.swing.JPanel();
        searchcodetxt = new javax.swing.JTextField();
        searchnametxt = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();



        jPanel2 = new javax.swing.JPanel();
        removecodetxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jPanel3 = new javax.swing.JPanel();
        editcodetxt = new javax.swing.JTextField();
        editnametxt = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codetxt.setText("کد مکان را وارد کنید");
        nametxt.setText("نام مکان را وارد کنید");
        jButton1.setText("ثبت");

        jButton1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
            private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
            {
               EntityPlace entityPlace=new EntityPlace();
               ServicePlace servicePlace=new ServicePlace();
                entityPlace.setPlCode(Integer.parseInt(codetxt.getText()));
                entityPlace.setPlName(nametxt.getText());
                String msg="";
                try
                {
                    servicePlace.save(entityPlace);
                }
                catch (Exception ex)
                {
                    msg=ex.getMessage();
                }

            }});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                     .addGap(157, 157, 157)
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(codetxt)
                     .addComponent(nametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                     .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                     .addContainerGap(199, Short.MAX_VALUE)));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                     .addGap(55, 55, 55)
                     .addComponent(codetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(31, 31, 31)
                     .addComponent(jButton1)
                      .addContainerGap(201, Short.MAX_VALUE)));
        jTabbedPane1.addTab("افزودن مکان دیدنی", jPanel1);
/////ثبت تموم/


        searchcodetxt.setText("کد مکان را وارد کنید");
        searchnametxt.setEnabled(false);
        jButton4.setText("جستجو");

        jButton4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
            private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
            {
                EntityPlace entityPlace=new EntityPlace();
                ServicePlace servicePlace=new ServicePlace();

                String code=searchcodetxt.getText();
                String msg="";
                try
                {
                    entityPlace=servicePlace.search(Long.parseLong(code));
                    searchnametxt.setText(entityPlace.getPlName());
                }
                catch (Exception ex)
                {
                    msg=ex.getMessage();
                }

            }});

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);

        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(searchcodetxt)
                                .addComponent(searchnametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(199, Short.MAX_VALUE)));

        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(searchcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton4)
                        .addContainerGap(201, Short.MAX_VALUE)));
        jTabbedPane1.addTab("جستجوی مکان دیدنی", jPanel4);



        removecodetxt.setText("کدمکان را وارد کنید");
        jButton2.setText("حذف");

        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
            private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
            {
                servicePlace=new ServicePlace();
                try
                {
                    servicePlace.delete(Integer.parseInt(removecodetxt.getText()));
                }
                catch (Exception ex)
                {
                    Logger.getLogger(Controller.PlaceForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);

        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel2Layout.createSequentialGroup()
                     .addGap(168, 168, 168)
                     .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(removecodetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                     .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                     .addContainerGap(189, Short.MAX_VALUE)));

        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel2Layout.createSequentialGroup()
                     .addGap(68, 68, 68)
                     .addComponent(removecodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(26, 26, 26)
                     .addComponent(jButton2)
                     .addContainerGap(218, Short.MAX_VALUE)));
        jTabbedPane1.addTab("حذف مکان دیدنی", jPanel2);
//////////تب حذف تموم

        editcodetxt.setText("کدمکان را وارد کنید");
        editnametxt.setText("نام مکان را وارد کنید");
        jButton3.setText("ویرایش");

        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
            private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                // TODO add your handling code here:
                entityPlace=new EntityPlace();
                entityPlace.setPlCode(Integer.parseInt(editcodetxt.getText()));
                entityPlace.setPlName(editnametxt.getText());
                servicePlace=new ServicePlace();
                try
                {
                    servicePlace.edit(entityPlace);
                }
                catch (Exception ex)
                {
                    Logger.getLogger(Controller.PlaceForm.class.getName()).log(Level.SEVERE, null, ex);
                }

            }});

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);

        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(editcodetxt)
                                        .addComponent(editnametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(206, Short.MAX_VALUE)));

        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(editcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jButton3)
                                .addContainerGap(192, Short.MAX_VALUE)));
        jTabbedPane1.addTab("ویرایش مکان دیدنی", jPanel3);
//////تب ویرایش تموم

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(69, Short.MAX_VALUE)));

        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(40, Short.MAX_VALUE)));

        pack();
    }


    private javax.swing.JTextField codetxt;
    private javax.swing.JTextField editcodetxt;
    private javax.swing.JTextField editnametxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;

    private javax.swing.JTextField searchcodetxt;
    private javax.swing.JTextField searchnametxt;


    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;

    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField removecodetxt;
}
