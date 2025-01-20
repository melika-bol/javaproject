package View;

import tourproject.PEOPLES.EntityPeople;
import tourproject.PEOPLES.ServicePeople;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PeopleForm extends javax.swing.JFrame{

    EntityPeople entityPeople;
    ServicePeople servicePeople;

    public PeopleForm() { initComponents(); }
    private void initComponents() {
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        codetxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        phonetxt = new javax.swing.JTextField();
        addresstxt = new javax.swing.JTextField();
        tourcodetxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();


        jPanel4 = new javax.swing.JPanel();
        searchcodetxt = new javax.swing.JTextField();
        searchnametxt = new javax.swing.JTextField();
        searchphonetxt = new javax.swing.JTextField();
        searchaddresstxt = new javax.swing.JTextField();
        searchtourcodetxt = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();


        jPanel2 = new javax.swing.JPanel();
        removecodetxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jPanel3 = new javax.swing.JPanel();
        editcodetxt = new javax.swing.JTextField();
        editnametxt = new javax.swing.JTextField();
        editphonetxt = new javax.swing.JTextField();
        editaddresstxt = new javax.swing.JTextField();
        edittourcodetxt = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codetxt.setText("کدملی را وارد کنید");
        nametxt.setText("نام و نام خانوادگی را وارد کنید");
        phonetxt.setText("شماره تلفن را وارد کنید");
        addresstxt.setText("ادرس را وارد کنید");
        tourcodetxt.setText("کدتور را وارد کنید");
        jButton1.setText("ثبت ");

        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
            private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
            {
                entityPeople =new  EntityPeople();
                entityPeople.setCode(Integer.parseInt(codetxt.getText()));
                entityPeople.setFullName(nametxt.getText());
                entityPeople.setAddress(addresstxt.getText());
                entityPeople.setPhone(Long.parseLong(phonetxt.getText()));
                entityPeople.setTourCode(Integer.parseInt(tourcodetxt.getText()));
                servicePeople=new ServicePeople();
                try {
                    servicePeople.save(entityPeople);
                } catch (Exception ex) {
                    Logger.getLogger(Controller.PeopleForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tourcodetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(addresstxt, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(phonetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(nametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(codetxt)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(210, Short.MAX_VALUE)));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(codetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tourcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jButton1)
                                .addContainerGap(127, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("افزودن مسافر", jPanel1);
///////تب ثبت تموم

        searchcodetxt.setText("کدملی را وارد کنید");

        jButton4.setText("جستجو ");
        searchaddresstxt.setEnabled(false);
        searchnametxt.setEnabled(false);
        searchphonetxt.setEnabled(false);
        searchtourcodetxt.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }
            private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)
            {
                entityPeople =new  EntityPeople();
                servicePeople=new ServicePeople();
                try {
                   entityPeople= servicePeople.search(Long.parseLong(searchcodetxt.getText()));
                   searchphonetxt.setText(String.valueOf(entityPeople.getPhone()));


                   searchnametxt.setText(entityPeople.getFullName());

                   searchaddresstxt.setText(entityPeople.getAddress());

                   searchtourcodetxt.setText(String.valueOf(entityPeople.getTourCode()));


                } catch (Exception ex) {
                    Logger.getLogger(Controller.PeopleForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }});

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);

        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(searchtourcodetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(searchaddresstxt, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(searchphonetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(searchnametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(searchcodetxt)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(210, Short.MAX_VALUE)));

        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(searchcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchphonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchaddresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchtourcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton4)
                        .addContainerGap(127, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("جستجوی مسافر", jPanel4);





        removecodetxt.setText("کدمسافر را وارد کنید");
        jButton2.setText("حذف مسافر");

        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
            private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
            {
                servicePeople=new ServicePeople();
                try {
                    servicePeople.delete(Integer.parseInt(removecodetxt.getText()));
                } catch (Exception ex) {
                    Logger.getLogger(Controller.PeopleForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }});

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);

        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(removecodetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(208, Short.MAX_VALUE)));

        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(removecodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jButton2)
                                .addContainerGap(211, Short.MAX_VALUE)));
        jTabbedPane1.addTab("حذف مسافر", jPanel3);
//////تب حذف تموم

        editcodetxt.setText("کدمسافررا وارد کنید");
        editnametxt.setText("نام و نام خانوادگی  را وارد کنید");
        editphonetxt.setText("شماره تلفن را وارد کنید");
        editaddresstxt.setText("ادرس را وارد کنید");
        edittourcodetxt.setText("کدتور را وارد کنید");
        jButton3.setText("ویرایش");

        editnametxt.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                editnametxtActionPerformed(evt);
            }
            private void editnametxtActionPerformed(java.awt.event.ActionEvent evt) { }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
            private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)
            {

                entityPeople =new  EntityPeople();
                entityPeople.setCode(Integer.parseInt(editcodetxt.getText()));
                entityPeople.setFullName(editnametxt.getText());
                entityPeople.setAddress(editaddresstxt.getText());
                entityPeople.setPhone(Long.parseLong(editphonetxt.getText()));
                entityPeople.setTourCode(Integer.parseInt(edittourcodetxt.getText()));
                servicePeople=new ServicePeople();
                try {
                    servicePeople.edit(entityPeople);
                } catch (Exception ex) {
                    Logger.getLogger(Controller.PeopleForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);

        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(edittourcodetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                        .addComponent(editaddresstxt, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                        .addComponent(editphonetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                        .addComponent(editnametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                        .addComponent(editcodetxt)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(210, Short.MAX_VALUE)));

        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(editcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editphonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editaddresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edittourcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton3)
                                .addContainerGap(120, Short.MAX_VALUE)));
        jTabbedPane1.addTab("ویرایش مسافر", jPanel2);
//////تب ویرایش تموم
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1)
                                .addContainerGap()));

        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jTabbedPane1)
                                .addContainerGap()));

        pack();
    }


    private javax.swing.JTextField addresstxt;
    private javax.swing.JTextField codetxt;
    private javax.swing.JTextField editaddresstxt;
    private javax.swing.JTextField editcodetxt;
    private javax.swing.JTextField editnametxt;
    private javax.swing.JTextField editphonetxt;
    private javax.swing.JTextField edittourcodetxt;

    private javax.swing.JTextField searchaddresstxt;
    private javax.swing.JTextField searchcodetxt;
    private javax.swing.JTextField searchnametxt;
    private javax.swing.JTextField searchphonetxt;
    private javax.swing.JTextField searchtourcodetxt;



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
    private javax.swing.JTextField phonetxt;
    private javax.swing.JTextField removecodetxt;
    private javax.swing.JTextField tourcodetxt;
}
