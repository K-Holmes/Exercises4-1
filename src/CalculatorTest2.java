public class CalculatorTest2 {
    public static void main(String[] args) {
        //Instantiate a Calculator2 object
        Calculator2 calc = new Calculator2();
        //p1
        calc.originalPrice = 10.0;
        calc.findTotal();
        //p2
        calc.originalPrice = 12.0;
        calc.findTotal();
        //p3
        calc.originalPrice = 9.0;
        calc.findTotal();
        //p4
        calc.originalPrice = 8.0;
        calc.findTotal();
        //p5
        calc.originalPrice = 7.0;
        calc.findTotal();
        //p6
        calc.originalPrice = 15.0;
        calc.findTotal();
        //p7
        calc.originalPrice = 11.0;
        calc.findTotal();
        //p8
        calc.originalPrice = 30.0;
        calc.findTotal();

        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15 (Alex)
        Person 7: $11
        Person 8: $30
        */

    }
}