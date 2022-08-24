
package com.crio.qcalc;


import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class QcalcApplication {


   public static void main(String[] args) {

       StandardCalculator calc = new StandardCalculator();

       calc.add(1.5, 2.5);

       System.out.println(calc.getResult());

   }


}
