package View;

import tourproject.VEHICLES.EntityVehicle;
import tourproject.VEHICLES.ServiceVehicle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VehicleForm extends javax.swing.JFrame{

    EntityVehicle entityVehicle;
    ServiceVehicle serviceVehicle;

    public VehicleForm() {
        initComponents();
    }

    private void initComponents() {
        jTabbedPane1 = new javax.swing.JTabbedPane();

        jPanel1 = new javax.swing.JPanel();
        codetxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        propertytxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();



        jPanel4 = new javax.swing.JPanel();
        searchcodetxt = new javax.swing.JTextField();
        searchnametxt = new javax.swing.JTextField();
        searchpropertytxt = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        jPanel2 = new javax.swing.JPanel();
        removecodetxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jPanel3 = new javax.swing.JPanel();
        editcodetxt = new javax.swing.JTextField();
        editnametxt = new javax.swing.JTextField();
        editproperttxt = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codetxt.setText("کد وسیله را وارد کنید");
        nametxt.setText("نام وسیله را وارد کنید");
        propertytxt.setText("مشخصات وسیله را وارد کنید");
        jButton1.setText("ثبت");

        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
            private void jButton1ActionPerformed(ActionEvent evt)
            {
                entityVehicle =new EntityVehicle();
                serviceVehicle=new ServiceVehicle();
                entityVehicle.setvCode(Integer.parseInt(codetxt.getText()));
                entityVehicle.setvName(nametxt.getText());
                entityVehicle.setvSpecifi(propertytxt.getText());
                try
                {
                    serviceVehicle.save(entityVehicle);
                }
                catch (Exception ex)
                {
                    Logger.getLogger(Controller.VehicleForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                     .addGap(180, 180, 180)
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(propertytxt, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                     .addComponent(nametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                     .addComponent(codetxt)
                     .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                     .addContainerGap(253, Short.MAX_VALUE)));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                     .addGap(46, 46, 46)
                     .addComponent(codetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(propertytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(46, 46, 46)
                     .addComponent(jButton1)
                     .addContainerGap(173, Short.MAX_VALUE)));
        jTabbedPane1.addTab("افزودن وسیله نقلیه", jPanel1);
/////تب ثثبت تموم



        searchcodetxt.setText("کد وسیله را وارد کنید");
        searchnametxt.setEnabled(false);
        searchpropertytxt.setEnabled(false);
        jButton4.setText("جستجو");

        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
            private void jButton1ActionPerformed(ActionEvent evt)
            {
                entityVehicle =new EntityVehicle();

                String code=searchcodetxt.getText();
                try
                {
                    serviceVehicle.save(entityVehicle);
                }
                catch (Exception ex)
                {
                    Logger.getLogger(Controller.VehicleForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }});

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);

        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(searchpropertytxt, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addComponent(searchnametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addComponent(searchcodetxt)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(253, Short.MAX_VALUE)));

        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(searchcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchpropertytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButton4)
                        .addContainerGap(173, Short.MAX_VALUE)));
        jTabbedPane1.addTab("جستجوی وسیله نقلیه", jPanel4);



        removecodetxt.setText("کد وسیله را وارد کنید");
        jButton2.setText("حذف");

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
            private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
            {
                serviceVehicle=new ServiceVehicle();
                try
                {
                    serviceVehicle.delete(Integer.parseInt(removecodetxt.getText()));
                }
                catch (Exception ex)
                {
                    Logger.getLogger(Controller.VehicleForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);

        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel2Layout.createSequentialGroup()
                     .addGap(179, 179, 179)
                     .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(removecodetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                     .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                     .addContainerGap(249, Short.MAX_VALUE)));

        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel2Layout.createSequentialGroup()
                     .addGap(73, 73, 73)
                     .addComponent(removecodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(18, 18, 18)
                     .addComponent(jButton2)
                     .addContainerGap(224, Short.MAX_VALUE)));
        jTabbedPane1.addTab("حذف وسیله نقلیه", jPanel2);
///////////تب حذف تموم

        editcodetxt.setText("کد وسیله را وارد کنید");
        editnametxt.setText("نام وسیله را وارد کنید");
        editproperttxt.setText("مشخصات وسیله را وارد کنید");
        jButton3.setText("ویرایش");

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
            private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)
            {
                entityVehicle =new EntityVehicle();
                serviceVehicle=new ServiceVehicle();
                entityVehicle.setvCode(Integer.parseInt(editcodetxt.getText()));
                entityVehicle.setvName(editnametxt.getText());
                entityVehicle.setvSpecifi(editproperttxt.getText());
                try
                {
                    serviceVehicle.edit(entityVehicle);
                }
                catch (Exception ex)
                {
                    Logger.getLogger(Controller.VehicleForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }});

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);

        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel3Layout.createSequentialGroup()
                     .addGap(180, 180, 180)
                     .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(editproperttxt, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                     .addComponent(editnametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                     .addComponent(editcodetxt)
                     .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                     .addContainerGap(246, Short.MAX_VALUE)));

        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel3Layout.createSequentialGroup()
                     .addGap(59, 59, 59)
                     .addComponent(editcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(editnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(editproperttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(37, 37, 37)
                     .addComponent(jButton3)
                     .addContainerGap(169, Short.MAX_VALUE)));
        jTabbedPane1.addTab("ویرایش وسیله نقلیه", jPanel3);
////تب ویرایش تموم

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGap(0, 630, Short.MAX_VALUE)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
              .addGap(0, 25, Short.MAX_VALUE)
              .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(0, 26, Short.MAX_VALUE))));

        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGap(0, 453, Short.MAX_VALUE)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
              .addGap(0, 34, Short.MAX_VALUE)
              .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(0, 34, Short.MAX_VALUE))));
        pack();
    }


    private javax.swing.JTextField codetxt;
    private javax.swing.JTextField editcodetxt;
    private javax.swing.JTextField editnametxt;
    private javax.swing.JTextField editproperttxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField propertytxt;
    private javax.swing.JTextField removecodetxt;

    private javax.swing.JTextField searchcodetxt;
    private javax.swing.JTextField searchnametxt;
    private javax.swing.JTextField searchpropertytxt;

}
