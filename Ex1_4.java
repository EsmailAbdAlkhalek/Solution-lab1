
package ex1_4;

public class Ex1_4 {

    
    public static void main(String[] args) {
        // الرصيد قبل الفائده السنوية
    // الفائده السنويه =5%
    double balance=1000;
    double interestPerYear=0.05;
    double balanceAfterOneyear=(balance*interestPerYear)+ balance;
    double balanceAfterTowyear=(balanceAfterOneyear*interestPerYear)+ balanceAfterOneyear;
    double balanceAfterThreeyear=(balanceAfterTowyear*interestPerYear)+ balanceAfterTowyear;
    System.out.println("balance after three years = " + balanceAfterThreeyear  );
    
    }}
