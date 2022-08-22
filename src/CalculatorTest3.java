public class CalculatorTest3 {
    public static void main(String[] args) {

        Calculator3 calc = new Calculator3();
        calc.findTotal(10.0, "James");
        calc.findTotal(12.0, "Kevin");
        calc.findTotal(9.0, "Kylee");
        calc.findTotal(8.0, "Martha");
        calc.findTotal(7.0, "Cynthia");
        calc.findTotal(15.0, "Alex");
        calc.findTotal(11.0, "Chris");
        calc.findTotal(30.0, "Athena");

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
