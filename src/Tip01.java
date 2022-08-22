public class Tip01 {
    public static void printData() {
        //print out data
        double p1 = 10.0, p2 = 12.0, p3 = 9.0, p4 = 8.0, p5 = 7.0, p6 = 15.0, p7 = 11.0, p8 = 30.0;
        p1 = p1 + (p1 * 0.05) + (p1 * 0.15);
        p2 = p2 + (p2 * 0.05) + (p2 * 0.15);
        p3 = p3 + (p3 * 0.05) + (p3 * 0.15);
        p4 = p4 + (p4 * 0.05) + (p4 * 0.15);
        p5 = p5 + (p5 * 0.05) + (p5 * 0.15);
        p6 = p6 + (p6 * 0.05) + (p6 * 0.15);
        p7 = p7 + (p7 * 0.05) + (p7 * 0.15);
        p8 = p8 + (p8 * 0.05) + (p8 * 0.15);

        System.out.println("Person 1: $" + p1);
        System.out.println("Person 2: $" + p2);
        System.out.println("Person 3: $" + p3);
        System.out.println("Person 4: $" + p4);
        System.out.println("Person 5: $" + p5);
        System.out.println("Person 6: $" + p6);
        System.out.println("Person 7: $" + p7);
        System.out.println("Person 8: $" + p8);
    }
    public static void main(String[] args) {
        //Find everyone's individual total after tax(5%) and tip(15%)

        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */

        //print out only the after for each person
        printData();

    }
}
