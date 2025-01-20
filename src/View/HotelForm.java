package View;

        import tourproject.HOTEL.EntityHotel;
        import tourproject.HOTEL.ServiceHotel;
        import javax.swing.text.View;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.util.logging.Level;
        import java.util.logging.Logger;

public class HotelForm extends javax.swing.JFrame{

    tourproject.HOTEL.EntityHotel entityHotel;
    ServiceHotel serviceHotel;

    public HotelForm() { initComponents(); }

    private void initComponents() {
        jTabbedPane1 = new javax.swing.JTabbedPane();

        jPanel1 = new javax.swing.JPanel();
        hotelcodetxt = new javax.swing.JTextField();
        hotelnametxt = new javax.swing.JTextField();
        hoteladdresstxt = new javax.swing.JTextField();
        hotelphonetxt = new javax.swing.JTextField();
        hotelpaymenttxt = new javax.swing.JTextField();
        hotelfactxt = new javax.swing.JTextField();
        msglbl1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();




        jPanel4 = new javax.swing.JPanel();
        searchhotelcodetxt = new javax.swing.JTextField();
        searchhotelnametxt = new javax.swing.JTextField();
        searchhoteladdresstxt = new javax.swing.JTextField();
        searchhotelphonetxt = new javax.swing.JTextField();
        searchhotelpaymenttxt = new javax.swing.JTextField();
        searchhotelfactxt = new javax.swing.JTextField();
        msglbl4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();









        jPanel2 = new javax.swing.JPanel();
        removecodetxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel3 = new javax.swing.JPanel();
        editcodetxt = new javax.swing.JTextField();
        editnametxt = new javax.swing.JTextField();
        editaddresstxt = new javax.swing.JTextField();
        editphonetxt = new javax.swing.JTextField();
        editpaymenttxt = new javax.swing.JTextField();
        editfactxt = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hotelcodetxt.setText("کد هتل را وارد کنید");
        hotelnametxt.setText("نام هتل را وارد کنید");
        hoteladdresstxt.setText("ادرس هتل را وارد کنید");
        hotelphonetxt.setText("شماره تلفن هتل را وارد کنید");
        hotelpaymenttxt.setText("قیمت هتل را وارد کنید");
        hotelfactxt.setText("امکانات هتل را وارد کنید");
        jButton1.setText("ثبت هتل");


        searchhotelcodetxt.setText("کد هتل را وارد کنید");
        jButton4.setText("جستجوی هتل");



        jButton1.addActionListener(new  ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
            private void jButton1ActionPerformed(ActionEvent evt)
            {
                entityHotel =new tourproject.HOTEL.EntityHotel();
                entityHotel.sethAddress(hoteladdresstxt.getText());
                entityHotel.sethCode(Integer.parseInt(hotelcodetxt.getText()));
                entityHotel.sethName(hotelnametxt.getText());
                entityHotel.sethNumber(Long.parseLong(hotelphonetxt.getText()));
                entityHotel.sethPossibl(hotelfactxt.getText());
                entityHotel.sethPrice(Long.parseLong(hotelpaymenttxt.getText()));
                serviceHotel=new ServiceHotel();
                String msg="";
                try
                {
                    serviceHotel.save(entityHotel);
                    msg="باموفقیت انجام شد";
                }
                catch (Exception ex)
                {
                    msg=ex.getMessage();
                }
                msglbl1.setText(msg);
            }});








        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(166, 166, 166)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(msglbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                  .addComponent(hotelfactxt, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                  .addComponent(hotelpaymenttxt, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                  .addComponent(hotelphonetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                  .addComponent(hoteladdresstxt, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                  .addComponent(hotelnametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                  .addComponent(hotelcodetxt)
                  .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addContainerGap(211, Short.MAX_VALUE)));

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(49, 49, 49)
                  .addComponent(hotelcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(hotelnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(hoteladdresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(hotelphonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(hotelpaymenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(hotelfactxt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(30, 30, 30)
                  .addComponent(jButton1)
                  .addGap(18, 18, 18)
                  .addComponent(msglbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)));
        jTabbedPane1.addTab("افزودن هتل", jPanel1);
//////////تا اینجا تب ثبت تموم شد//



        jButton4.addActionListener(new  ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }
            private void jButton4ActionPerformed(ActionEvent evt)
            {
                entityHotel =new tourproject.HOTEL.EntityHotel();
                int code=Integer.parseInt(searchhotelcodetxt.getText());
                serviceHotel=new ServiceHotel();
                String msg="";
                try
                {
                    entityHotel=serviceHotel.search(code);
                    entityHotel=new EntityHotel();
                    if (entityHotel!=null){
                        searchhotelnametxt.setText(entityHotel.gethName());

                        searchhoteladdresstxt.setText(entityHotel.gethAddress());

                        searchhotelfactxt.setText(entityHotel.gethPossibl());

                        searchhotelphonetxt.setText(String.valueOf(entityHotel.gethNumber()));

                        searchhotelpaymenttxt.setText(String.valueOf(entityHotel.gethPrice()));

                    }
                }
                catch (Exception ex)
                {
                    msg=ex.getMessage();
                }
                msglbl4.setText(msg);
            }});


        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        searchhotelnametxt.setEnabled(false);
        searchhotelpaymenttxt.setEnabled(false);
        searchhotelphonetxt.setEnabled(false);
        searchhotelfactxt.setEnabled(false);
        searchhoteladdresstxt.setEnabled(false);

        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(msglbl4, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addComponent(searchhotelfactxt, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addComponent(searchhotelpaymenttxt, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addComponent(searchhotelphonetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addComponent(searchhoteladdresstxt, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addComponent(searchhotelnametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addComponent(searchhotelcodetxt)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(211, Short.MAX_VALUE)));

        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(searchhotelcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchhotelnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchhoteladdresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchhotelphonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchhotelpaymenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchhotelfactxt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(msglbl4, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)));
        jTabbedPane1.addTab("جستجوی هتل", jPanel4);





        removecodetxt.setText("کدهتل را وارد کنید");
        jButton2.setText("حذف هتل");

        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }

            private void jButton2ActionPerformed(ActionEvent evt)
            {
                serviceHotel=new ServiceHotel();
                try
                {
                    serviceHotel.delete(Integer.parseInt(removecodetxt.getText()));
                }
                catch (Exception ex)
                {
                    Logger.getLogger(Controller.HotelForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);

        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                      .addGap(188, 188, 188)
                      .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                      .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(removecodetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                      .addGap(194, 194, 194)));

        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel2Layout.createSequentialGroup()
                     .addGap(67, 67, 67)
                     .addComponent(removecodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(100, 100, 100)
                     .addComponent(jButton2)
                     .addGap(18, 18, 18)
                     .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addContainerGap(103, Short.MAX_VALUE)));
        jTabbedPane1.addTab("حذف هتل", jPanel2);
//////تب حذف هتل تموم//

        editcodetxt.setText("کدهتل را وارد کنید");
        editnametxt.setText("نام هتل را وارد کنید");
        editaddresstxt.setText("ادرس هتل را وارد کنید");
        editphonetxt.setText("شماره تلفن هتل را وارد کنید");
        editpaymenttxt.setText("قیمت هتل را وارد کنید");
        editfactxt.setText("امکانات هتل را وارد کنید");
        jButton3.setText("ویرایش");

        jButton3.addActionListener(new  ActionListener()
        {
            public void actionPerformed(ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
            private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

                entityHotel =new tourproject.HOTEL.EntityHotel();
                entityHotel.sethAddress(editaddresstxt.getText());
                entityHotel.sethCode(Integer.parseInt(editcodetxt.getText()));
                entityHotel.sethName(editnametxt.getText());
                entityHotel.sethNumber(Long.parseLong(editphonetxt.getText()));
                entityHotel.sethPossibl(editfactxt.getText());
                entityHotel.sethPrice(Long.parseLong(editpaymenttxt.getText()));
                serviceHotel=new ServiceHotel();
                String msg="";
                try {
                    serviceHotel.edit(entityHotel);
                    msg="باموفقیت انجام شد";
                } catch (Exception ex) {
                    msg=ex.getMessage();
                }
                msglbl1.setText(msg);
            }});

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);

        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel3Layout.createSequentialGroup()
                     .addGap(175, 175, 175)
                     .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(editfactxt, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                     .addComponent(editpaymenttxt, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                     .addComponent(editphonetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                     .addComponent(editaddresstxt, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                     .addComponent(editnametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                     .addComponent(editcodetxt)
                     .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                     .addContainerGap(243, Short.MAX_VALUE)));

        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel3Layout.createSequentialGroup()
                     .addGap(38, 38, 38)
                     .addComponent(editcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(editnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(editaddresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(editphonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(editpaymenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                     .addComponent(editfactxt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(18, 18, 18)
                     .addComponent(jButton3)
                     .addContainerGap(62, Short.MAX_VALUE)));
        jTabbedPane1.addTab("ویرایش هتل", jPanel3);
///////تب ویرایش تموم شد

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
               .addGap(0, 32, Short.MAX_VALUE)
               .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)));

        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
              .addContainerGap(27, Short.MAX_VALUE)
              .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(21, 21, 21)));

        pack();
    }


    private javax.swing.JTextField editaddresstxt;
    private javax.swing.JTextField editcodetxt;
    private javax.swing.JTextField editfactxt;
    private javax.swing.JTextField editnametxt;
    private javax.swing.JTextField editpaymenttxt;
    private javax.swing.JTextField editphonetxt;
    private javax.swing.JTextField hoteladdresstxt;
    private javax.swing.JTextField hotelcodetxt;
    private javax.swing.JTextField hotelfactxt;
    private javax.swing.JTextField hotelnametxt;
    private javax.swing.JTextField hotelpaymenttxt;
    private javax.swing.JTextField hotelphonetxt;


    private javax.swing.JTextField searchhoteladdresstxt;
    private javax.swing.JTextField searchhotelcodetxt;
    private javax.swing.JTextField searchhotelfactxt;
    private javax.swing.JTextField searchhotelnametxt;
    private javax.swing.JTextField searchhotelpaymenttxt;
    private javax.swing.JTextField searchhotelphonetxt;


    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel msglbl1;
    private javax.swing.JLabel msglbl4;
    private javax.swing.JTextField removecodetxt;
}
