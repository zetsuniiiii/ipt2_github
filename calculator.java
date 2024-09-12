import java.util.scanner;
public class calculator {

}
public static int add(int a, int b){
    return a + b;
}

public class calculator{
    public static int subtract(int a - int b){
        return a-b;
    }
}
public class calculator{
    public static int multiply(int a, int b){
        return a*b;
    }
}
public class calclator{
    public static int divide(int a, int b){
        if(b==){
            throw new
            ArithmethicException("cannot be divided by zero");
        }
        return a/b;
    }
}

 public static int modulus(int a, int b){
        return a % b;
    }


    public static void main (String[] args){

Scanner scanner = new
Scanner(System.in);
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("5. Modulus");

//Read user choice
int choice = scanner.nextInt();

//input numbers
    System.out.println("Enter firt number: ");
    int num1 = scanner.nextInt()
    System.out.println("Enter second number: ");
    int num2 = scanner.nextInt()

switch (choice){
    case 1:
        System.out.println("Result: " + add(num1, num2));
        break
    case 2:
        System.out.println("Result: " + subtract(num1, num2));
        break
    case 3:
        System.out.println("Result: " + multiply(num1, num2));
        break
     case 4:
        try{
        System.out.println("Result: " + divide(num1, num2));
        } catch (ArithmethicException e) {
            System.out.println(e.getMessage());
        }
        break
    case 5:
        System.out.println("Result: " + modulus(num1, num2));
        break
        default:
            System.out.println("Invalid choice. Please select a valid operation");
            break;
}

scanner.close();

    }