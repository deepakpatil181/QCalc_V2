package com.crio.qcalc;

public class ScientificCalculator extends StandardCalculator{

    public static void getVersion(){
        System.out.println("Scientific Calculator 1.0");
    }

    public void sin(double a){
        result = Math.sin(a);
    }
    public void cos(double a){
        result = Math.cos(a);
    }
    public void square(double a){
        multiply(a,a);
    }
    
// public void tan(double a){
//    return result = Math.tan(a);
// }


// public void log(double a){
//     return result = Math.log(a);
// }


// public void sqrt(double a){
//     return result = Math.sqrt(a);
// }


// public void cbrt(double a){
//    return result=Math.cbrt(a);
// }
public double tan(double a){
    return result = Math.tan(a);
}


public double log(double a){
    return result = Math.log(a);

}


public double sqrt(double a){
    return result = Math.sqrt(a);

}


public double cbrt(double a) {
    return result = Math.cbrt(a);

}

@Override

public void printResult(){

    System.out.println("Scientific Calculator Result:"+ result );

}





}
