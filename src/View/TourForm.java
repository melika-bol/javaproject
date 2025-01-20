package View;

import tourproject.tour.EntityTour;
import tourproject.tour.ServiceTour;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

public class TourForm extends javax.swing.JFrame {

    EntityTour entityTour;
    ServiceTour  serviceTour;

    public TourForm() throws Exception { initComponents(); }

    private void initComponents() throws Exception {

        jTabbedPane1 = new javax.swing.JTabbedPane();

        jPanel1 = new javax.swing.JPanel();
        codetxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        rangetxt = new javax.swing.JTextField();
        vehicletxt = new javax.swing.JTextField();
        pepolecodetxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        totalpaytxt = new javax.swing.JTextField();
        managertxt = new javax.swing.JTextField();
        hotelnametxt = new javax.swing.JTextField();
        placestxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        msglbl1 = new javax.swing.JLabel();
        typecmb = new javax.swing.JComboBox<>();
        sectypecmb = new javax.swing.JComboBox<>();


        jPanel4 = new javax.swing.JPanel();
        searchcodetxt = new javax.swing.JTextField();
        searchnametxt = new javax.swing.JTextField();
        searchrangetxt = new javax.swing.JTextField();
        searchvehicletxt = new javax.swing.JTextField();
        searchpepolecodetxt = new javax.swing.JTextField();
        msglbl4 = new javax.swing.JLabel();
        searchhotelnametxt = new javax.swing.JTextField();
        searchmanagertxt = new javax.swing.JTextField();
        searchplacestxt = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        msglbl4 = new javax.swing.JLabel();
        searchtypecmb = new javax.swing.JTextField();
        searchsectypecmb = new javax.swing.JTextField();
        searchtotalpaytxt= new javax.swing.JTextField();

        jPanel5 = new javax.swing.JPanel();
        String[] columns = new String[] {
                "code", "Name", " Range", "vehicle" ,"people","totalPayment","manager","hotelName","places"
        };

        //actual data for the table in a 2d array
        EntityTour et=new EntityTour();
        et.setCode(25445400);
        et.setName("sahar");
        et.setPlaces("hi hi tabriz");
        et.setPayment(25656565);
        et.setRange("20-50");
        et.setHotelName("sadr");
        et.setManager("ali");
        et.setPeople("hadi");
        ArrayList<EntityTour> entityTours=new ArrayList<>();
        entityTours.add(et);
        Object[][] data = new Object[entityTours.size()+1][9];
        data[0][0]="Code";
        data[0][1]="Name";
        data[0][2]="Range";
        data[0][3]="vehicle";
        data[0][4]="people";
        data[0][5]="payment";
        data[0][6]="manager";
        data[0][7]="hotel";
        data[0][8]="places";



        for (int i=0;i<entityTours.size();i++){
            for (int j=0;j<=8;j++){
                EntityTour entityTour=entityTours.get(i);
                data[i+1][0]=entityTour.getCode();
                data[i+1][1]=entityTour.getName();
                data[i+1][2]=entityTour.getRange();
                data[i+1][3]=entityTour.getVehicle();
                data[i+1][4]=entityTour.getPeople();
                data[i+1][5]=entityTour.getPayment();
                data[i+1][6]=entityTour.getManager();
                data[i+1][7]=entityTour.getHotelName();
                data[i+1][8]=entityTour.getPlaces();


            }

        }



        //create table with data
         table = new JTable(data, columns);


        jPanel2 = new javax.swing.JPanel();
        removecodetxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        msglbl2 = new javax.swing.JLabel();

        jPanel3 = new javax.swing.JPanel();
        editcodetxt = new javax.swing.JTextField();
        editnametxt = new javax.swing.JTextField();
        editrangetxt = new javax.swing.JTextField();
        editvehicletxt = new javax.swing.JTextField();
        editpeopleinfotxt = new javax.swing.JTextField();
        editpaytxt = new javax.swing.JTextField();
        editmanagertxt = new javax.swing.JTextField();
        edithotelnametxt = new javax.swing.JTextField();
        editplacetxt = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        edittypecmb = new javax.swing.JComboBox<>();
        editsectypecmb = new javax.swing.JComboBox<>();
        msglbl3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codetxt.setText("کد تور را وارد کنید");
        nametxt.setText("نام تور را وارد کنید");
        rangetxt.setText("بازه زمانی  تور را وارد کنید");
        vehicletxt.setText("وسیله نقلیه تور را وارد کنید");
        pepolecodetxt.setText("کدافراد ثبت نامی در توررا وارد کنید");
        jLabel1.setText("اطلاعات را با علامت ,جدا کنید");
        totalpaytxt.setText("مبلغ کل تور را وارد کنید");
        managertxt.setText("مدیر تور را وارد کنید");
        hotelnametxt.setText("نام هتل را وارد کنید");
        placestxt.setText("نام مکان های دیدنی را وارد کنید");
        typecmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "نوع تور را انتخاب کنید", "داخلی", "خارجی", "سیاحتی", "زیارتی" }));
        sectypecmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "دسته بندی تور را انتخاب کنید", "بهاره", "تابستانه", "پاییزه", "زمستانه" }));
        jButton1.setText("ثبت");

        vehicletxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                vehicletxtActionPerformed(evt);
            }
            private void vehicletxtActionPerformed(java.awt.event.ActionEvent evt) { }

        });

        pepolecodetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                pepolecodetxtActionPerformed(evt);
            }
            private void pepolecodetxtActionPerformed(java.awt.event.ActionEvent evt) { }

        });

        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
            private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
            {
                entityTour=new EntityTour();
                entityTour.setCode(Integer.parseInt(codetxt.getText()));
                entityTour.setName(nametxt.getText());
                entityTour.setHotelName(hotelnametxt.getText());
                entityTour.setManager(managertxt.getText());
                entityTour.setPeople(pepolecodetxt.getText());
                entityTour.setPayment(Long.parseLong(totalpaytxt.getText()));
                entityTour.setPlaces(placestxt.getText());
                entityTour.setRange(rangetxt.getText());
                entityTour.setVehicle(vehicletxt.getText());
                serviceTour =new ServiceTour();
                String msg="";
                try
                {
                    serviceTour.save(entityTour);
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
                    .addContainerGap(205, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(typecmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(msglbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vehicletxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rangetxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nametxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codetxt)
                    .addComponent(pepolecodetxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalpaytxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(managertxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hotelnametxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(placestxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sectypecmb, javax.swing.GroupLayout.Alignment.LEADING, 0, 187, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(23, Short.MAX_VALUE)));

        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(jPanel1Layout.createSequentialGroup()
                      .addGap(55, 55, 55)
                      .addComponent(codetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                      .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                      .addComponent(rangetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                      .addComponent(vehicletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                      .addComponent(pepolecodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addComponent(jLabel1))
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(totalpaytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(managertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(hotelnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(placestxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(typecmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(sectypecmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addGap(22, 22, 22)
                       .addComponent(jButton1)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                       .addComponent(msglbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)));
        jTabbedPane1.addTab("افزودن تور", jPanel1);
////////////تب ثبت تموم/

        searchcodetxt.setText("کد تور را وارد کنید");
        searchhotelnametxt.setEnabled(false);
        searchmanagertxt.setEnabled(false);
        searchnametxt.setEnabled(false);
        searchpepolecodetxt.setEnabled(false);
        searchplacestxt.setEnabled(false);
        searchrangetxt.setEnabled(false);
        searchvehicletxt.setEnabled(false);
        searchtotalpaytxt.setEnabled(false);
        searchmanagertxt.setEnabled(false);
        searchtypecmb.setEnabled(false);
        jButton4.setText("جستجو");

        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
            private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
            {
                entityTour=new EntityTour();
                serviceTour =new ServiceTour();
                String msg="";
                String code=searchcodetxt.getText();
                try
                {
                    entityTour=serviceTour.search(Long.parseLong(code));
                    searchhotelnametxt.setText(entityTour.getHotelName());
                    searchplacestxt.setText(entityTour.getPlaces());
                    searchmanagertxt.setText(entityTour.getManager());
                    searchtotalpaytxt.setText(String.valueOf(entityTour.getPayment()));
                    searchnametxt.setText(entityTour.getName());
                    searchpepolecodetxt.setText(entityTour.getPeople());
                    searchrangetxt.setText(entityTour.getRange());
                    searchvehicletxt.setText(entityTour.getVehicle());
                }
                catch (Exception ex)
                {
                    msg=ex.getMessage();
                }
                msglbl4.setText(msg);
            }});

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);

        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(205, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(searchtypecmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(msglbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchvehicletxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(searchrangetxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(searchnametxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(searchcodetxt)
                                .addComponent(searchpepolecodetxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(searchtotalpaytxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(searchmanagertxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(searchhotelnametxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(searchplacestxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(searchsectypecmb, javax.swing.GroupLayout.Alignment.LEADING, 0, 187, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(msglbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE)));

        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(searchcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchrangetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchvehicletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchpepolecodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(msglbl4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchtotalpaytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchmanagertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchhotelnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchplacestxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchtypecmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchsectypecmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(msglbl4, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)));
        jTabbedPane1.addTab("جستجوی تور", jPanel4);






        removecodetxt.setText("کدتور را وارد کنید");
        jButton2.setText("حذف");

        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
            private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
            {
                serviceTour =new ServiceTour();
                String msg="";
                try {
                    serviceTour.delete(Integer.parseInt(removecodetxt.getText()));
                    msg="باموفقیت حذف شد";
                } catch (Exception ex) {
                    msg=ex.getMessage();
                }
                msglbl2.setText(msg);
            }});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);

        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(219, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(msglbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(removecodetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(184, 184, 184)));

        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(removecodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                                .addComponent(msglbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)));
        jTabbedPane1.addTab("حذف تور", jPanel2);
///////تب حذف تموم//


        javax.swing.ScrollPaneLayout jPanel5Layout = new javax.swing.ScrollPaneLayout();
       // jPanel5.setLayout(jPanel5Layout);
        jPanel5.add(table);


        jTabbedPane1.addTab("لیست تورها", jPanel5);



        editcodetxt.setText("کد تور را وارد کنید");
        editnametxt.setText("نام تور را وارد کنید");
        editrangetxt.setText("بازه زمانی تور را وارد کنید");
        editvehicletxt.setText("وسیله نقلیه تور را وارد کنید");
        editpeopleinfotxt.setText("کدافراد ثبت نامی در تور را وارد کنید");
        editpaytxt.setText("مبلغ کل تور را وارد کنید");
        editmanagertxt.setText("مدیر تور را وارد کنید");
        edithotelnametxt.setText("نام هتل را وارد کنید");
        editplacetxt.setText("نام مکان های دیدنی را وارد کنید");
        edittypecmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "نوع تور را انتخاب کنید", "داخلی", "خارجی", "سیاحتی", "زیارتی" }));
        editsectypecmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "دسته بندی تو را انتخاب کنید", "بهاره", "تابستانه", "پاییزه", "زمستانه", " " }));
        jButton3.setText("ویرایش");

        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
            private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)
            {
                entityTour=new EntityTour();
                entityTour.setCode(Integer.parseInt(editcodetxt.getText()));
                entityTour.setName(editnametxt.getText());
                entityTour.setHotelName(edithotelnametxt.getText());
                entityTour.setManager(editmanagertxt.getText());
                entityTour.setPeople(editpeopleinfotxt.getText());
                entityTour.setPayment(Long.parseLong(editpaytxt.getText()));
                entityTour.setPlaces(editplacetxt.getText());
                entityTour.setRange(editrangetxt.getText());
                entityTour.setVehicle(editvehicletxt.getText());
                serviceTour =new ServiceTour();
                String msg="";
                try
                {
                    serviceTour.edit(entityTour);
                    msg="باموفقیت انجام شد";
                }
                catch (Exception ex)
                {
                    msg=ex.getMessage();
                }
                msglbl3.setText(msg);

            }});

        edittypecmb.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                edittypecmbActionPerformed(evt);
            }
            private void edittypecmbActionPerformed(java.awt.event.ActionEvent evt) { }
        });


        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);

        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(msglbl3, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(editplacetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                                .addComponent(edithotelnametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                                .addComponent(editmanagertxt, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                                .addComponent(editpaytxt, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                                .addComponent(editpeopleinfotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                                .addComponent(editvehicletxt, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                                .addComponent(editrangetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                                .addComponent(editnametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                                .addComponent(editcodetxt)
                                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(edittypecmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(editsectypecmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap(247, Short.MAX_VALUE)));

        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(editcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editrangetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editvehicletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editpeopleinfotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editpaytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editmanagertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edithotelnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editplacetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edittypecmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editsectypecmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(msglbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(41, Short.MAX_VALUE)));
        jTabbedPane1.addTab("ویرایش تور", jPanel3);
/////////تب ویرایش تموم///////
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 604, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))));

        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 496, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))));

        pack();
    }



    private javax.swing.JTextField codetxt;
    private javax.swing.JTextField editcodetxt;
    private javax.swing.JTextField edithotelnametxt;
    private javax.swing.JTextField editmanagertxt;
    private javax.swing.JTextField editnametxt;
    private javax.swing.JTextField editpaytxt;
    private javax.swing.JTextField editpeopleinfotxt;
    private javax.swing.JTextField editplacetxt;
    private javax.swing.JTextField editrangetxt;
    private javax.swing.JComboBox<String> editsectypecmb;
    private javax.swing.JComboBox<String> edittypecmb;
    private javax.swing.JTextField editvehicletxt;
    private javax.swing.JTextField hotelnametxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField managertxt;
    private javax.swing.JLabel msglbl1;
    private javax.swing.JLabel msglbl2;
    private javax.swing.JLabel msglbl3;
    private javax.swing.JLabel msglbl4;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField pepolecodetxt;
    private javax.swing.JTextField placestxt;
    private javax.swing.JTextField rangetxt;
    private javax.swing.JTextField removecodetxt;
    private javax.swing.JComboBox<String> sectypecmb;
    private javax.swing.JTextField totalpaytxt;
    private javax.swing.JComboBox<String> typecmb;
    private javax.swing.JTextField vehicletxt;

    private javax.swing.JTextField searchvehicletxt;
    private javax.swing.JTextField searchhotelnametxt;
    private javax.swing.JTextField searchnametxt;
    private javax.swing.JTextField searchpepolecodetxt;
    private javax.swing.JTextField searchplacestxt;
    private javax.swing.JTextField searchrangetxt;
    private javax.swing.JTextField searchmanagertxt;
    private javax.swing.JTextField searchcodetxt;
    private javax.swing.JTextField searchsectypecmb;
    private javax.swing.JTextField searchtypecmb;
    private javax.swing.JTextField searchtotalpaytxt;
    JTable table;






}




