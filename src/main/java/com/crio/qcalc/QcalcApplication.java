
package com.crio.qcalc;


import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class QcalcApplication {


   public static void main(String[] args) {

    StandardCalculator calc = new StandardCalculator();

    
    calc.add(Double.MAX_VALUE, Double.MAX_VALUE);
    
    calc.printResult();

    

   LogicCalculator calcy = new LogicCalculator();

   calcy.AND(8, 6);
   
   calcy.printResult();
   

       

   }


}
