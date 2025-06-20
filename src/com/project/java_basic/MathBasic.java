package com.project.java_basic;

public class MathBasic {
    public static void main(String[] args) {
//        int nam_1  = 10;
//        int num_2  = 3;
//        int result ;
//
//        result = nam_1+num_2 ;
//
//        result = (double) nam_1 / num_2 ;
//
//        result = nam_1 % num_2 ; การหารแบบเอาเศษใช้เครื่องหมาย %
//
//        System.out.println(result);


     int total = 10+20*(2+5) ;
     System.out.println(total);

//     BMI = น้ำหนัก / (ส่วนสูง x ส่วนสูง )

        int wight = 60 ;
        double hight = 160 ;
        double BMI;

//        1 เมตร = 100 เซนติเมตร
         BMI = wight / ((hight/100)*(hight/100)) ;
         System.out.println(BMI);



         int Byte = 10000000 ;
         int Mb ;
         //

         Mb = Byte / 1048576;
         System.out.println(Mb);











    }
}
