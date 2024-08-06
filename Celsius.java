import java.util.Scanner ;
    public class Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fahrenheit dagree: ");
        float fahrenheit = sc.nextFloat();
        float celsius = (fahrenheit-32) * 5 /9;
        double roundedcelsius = Math.round(celsius * 100.0)/100.0;;
        System.out.print(fahrenheit +"Fahrenheit is equal to "+roundedcelsius);
        sc.close();

    }
    
        
    }
    
