/* The question is :
R1.13 Write an algorithm to settle the following question: A bank account starts out with
$10,000. Interest is compounded monthly at 6 percent per year (0.5 percent per
month). Every month, $500 is withdrawn to meet college expenses. After how many
years is the account depleted?
*/

// PS : the question wants the algorithm only, but I wrote it as code
/**
 * @author Waleed Mortaja, contact Email : <a href="mailto:waleed.mortaja@gmail.com">waleed.mortaja@gmail.com</a>
 */
public class R13_BankAccount {

    public static void main(String[] args) {
        int month = 0;
        double balance = 10000, interest = 0; // initialize month as 0 and balance as 10,000 and interest as 0 
        while (balance > 0) { // do this loop as there is still money in the account
            month++;  //increase month by 1
            interest = balance * 0.005; // compute the intrest as balance * interest rate
            balance += interest;  // add the interest to the main balance
            balance -= 500;  //subtrct the college expenses from the balance
        }
        double years = (double) month / 12;   // compute how many years are required to make account balance empty

        // if you want the years with digits
        System.out.println("years with  significant digits : " + years);

        // if you want the integer years
        if (years % 1 == 0) {  // because will will get a number for example , year =1.83 , so we don't want any number less than 1
            System.out.println("years as integer number : " + years);
        } else {
            years = years - (years % 1);
            years++; // if the year is 1.83 for example, it will print that it's required more than 1 years, which means 2 years 
            System.out.println("years as integer number : " + years);

        }

    }

}
