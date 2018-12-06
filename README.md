## เครปสไตล์เรา

ขั้นตอนการสั่งเครป

1.เลือกแป้ง

2.เลือกแยม

3.เลือกไส้คาว

4.เลือกไส้หวาน

5.เลือกซอส

6.กรอกชื่อผู้สั่ง

7.กดปุ่ม OK เพื่อสั่งรายการที่ต้องการ

8.ถ้าเราต้องการจะเลือกใหม่ให้ กดปุ่ม Clear 

9.ถ้าเราไม่ต้องการสั่งเครปให้ กดปุ่ม Exit ได้เลยครับ

ราคารวมทั้งหมดก็จะโชว์ขึ้นตรง "ราคารวม"

เมื่อกดปุ่ม OK ก็จะมีรายการสั่งทั้งหมดขึ้นมา


![cave](https://user-images.githubusercontent.com/45479394/49564285-91e46180-f955-11e8-9ef6-a7d745b31b3f.PNG)


เลือกแป้ง (โค้ดที่ใช้)

    p1=1;
    
          if (p1 == 1){
      
              N=10;
       
              Total="แป้งธรรมดา+";
       
              t1.setText(""+N);
       
       }
       
           if( n1.isSelected());
       
             n2.setSelected(false);
       
             n3.setSelected(false);
             
เลือกเเยม (โค้ดที่ใช้)            

    Y7=1;
        
        if (Y7==1){
        
            Y=((Y1+Y2+Y3+Y4+Y5+Y6+Y7)*5);
            
                T=Y+N+K;
            
            Total+="พิซซ่า";
           
           t1.setText(""+T); 
        
        }
เลือกไส้คาว (โค้ดที่ใช้)
   
    K1=1;
         
        if (K1==1){
            
            K=((K1+K2+K3+K4+K5+K6)*10);
             
                T=Y+N+K;
             
            Total+="หมูหยอง+";
             
           t1.setText(""+T);
            
       }

เลือกไส้หวาน (โค้ดที่ใช้)

    W1=1;
        
        if (W1==1){
            
            W=((W1+W2+W3+W4+W5+W6)*5);
            
                T=W+Y+N+K;
            
            Total+="ฝอยทอง+";
           
           t1.setText(""+T);
            
        }

เลือกซอส (โค้ดที่ใช้)
            
       Total+="มะเขือเทศ+";
           
ปุ่มกด OK (โค้ดที่ใช้)         
            
        JOptionPane.showMessageDialog(this,"ขอบคุณที่ใช้บริการ");
        
        System.out.println("ชื่อผู้สั่ง: "+t2.getText());
        
        System.out.println("รายการที่สั่ง"+Total+"ทั้งหมด"+T+"บาท");;
        
        System.exit(0);
          
ปุ่มกด Clear (โค้ดที่ใช้)

    this.T=0;
       
       this.N=0;
       
       this.W=0;
       
       this.Y=0;
       
       this.K=0;
       
       W1=0;
       
       W2=0;
       
       W3=0;
       
       W4=0;
       
       W5=0;
       
       W6=0;
       
       K1=0;
       
       K2=0;
       
       K3=0;
       
       K4=0;
       
       K5=0;
       
       K6=0;
       
       Y1=0;
       
       Y2=0;
       
       Y3=0;
       
       Y4=0;
       
       Y5=0;
       
       Y6=0;
       
       Y7=0;
       
       p1=0;
       
       p2=0;
       
       p3=0;
       
       Total=("");
        
        t2.setText(null);
       
       t1.setText(null);
       
       n1.setSelected ( false );
       
       n2.setSelected ( false );
       
       n3.setSelected ( false );
       
       y1.setSelected ( false );
       
       y2.setSelected ( false );
       
       y3.setSelected ( false );
       
       y4.setSelected ( false );
       
       y5.setSelected ( false );
       
       y6.setSelected ( false );
       
       y7.setSelected ( false );
       
       s1.setSelected ( false );
       
       s2.setSelected ( false );
       
       s3.setSelected ( false );
       
       s4.setSelected ( false );
       
       s5.setSelected ( false );
       
       w1.setSelected ( false );
       
       w2.setSelected ( false );
       
       w3.setSelected ( false );
       
       w4.setSelected ( false );
       
       w5.setSelected ( false );
       
       w6.setSelected ( false );
       
       k1.setSelected ( false );
       
       k2.setSelected ( false );
       
       k3.setSelected ( false );
       
       k4.setSelected ( false );
       
       k5.setSelected ( false );
       
       k6.setSelected ( false );
       
ปุ่มกด Exit (โค้ดที่ใช้)
    
    System.exit(0);
   
          
          
          
