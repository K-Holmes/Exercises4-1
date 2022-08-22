public class CalculatorTest4 {
    public static void main(String[] args) {
        double newTotal = 0;

        Calculator4 calc = new Calculator4();

        //Name your friends
        newTotal = newTotal + (calc.findTotal(10, null));
        newTotal = newTotal + (calc.findTotal(12, null));
        newTotal = newTotal + (calc.findTotal(9,  null));
        newTotal = newTotal + (calc.findTotal(8,  null));
        newTotal = newTotal + (calc.findTotal(7,  null));
        newTotal = newTotal + (calc.findTotal(15, "Alex"));
        newTotal = newTotal + (calc.findTotal(11, null));
        newTotal = newTotal + (calc.findTotal(30, "Forgetful"));

        //Find and print the entire table's total, including tax and tip
        System.out.println("The table total is $" + newTotal +" making the average price $" + (newTotal/8));
        System.out.println("But with Mr. Forgetful and the birthday kid, the actual average is $" + (newTotal/6));



    }
}
