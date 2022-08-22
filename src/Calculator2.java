public class Calculator2 {
    public double tax = .05;
    public double tip = .15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0;

    public void findTotal(){
        originalPrice = originalPrice * (1 + tax + tip);
        System.out.println(originalPrice);
    }
}
