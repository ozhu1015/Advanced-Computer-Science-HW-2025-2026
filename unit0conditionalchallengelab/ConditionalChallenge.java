public class ConditionalChallenge {
    public static void main(String[] args){
        //Part 1: Temperature Converter
        System.out.println("--- Part 1: Temperature Converter ---");
        double temperature = 98.5;
        boolean isCold = false;
        if (isCold) {
            temperature -= 15;
        } else {
            temperature += 10;
        }
        System.out.println(temperature);
    }
}
