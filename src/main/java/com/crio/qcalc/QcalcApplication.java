
package com.crio.qcalc;


import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class QcalcApplication {


   public static void main(String[] args) {

       System.out.println("Starting QCalc..");

       LogicCalculator calc = new LogicCalculator();

       calc.OR(8, 6);

       calc.printResult();
    //    System.out.println("the max value is:" +Double.MAX_VALUE);

    //    calc.setResult(9);

    //    System.out.println(calc.getResult());

   }


}
