package multistringcoll;
import java.util.Scanner;

public class StringCollExtend extends MultiStringColl {

    public StringCollExtend() {
        super();
    }
    
    public StringCollExtend(String i) {
        super(i);
    }
    
    @Override
    public void insert(String i) {
        if (!belongs(i)) {
            super.insert(i);
        }
    }
   
    public static void main(String[] args) {

        String value;
        Scanner keyboard = new Scanner(System.in);

        StringCollExtend P = new StringCollExtend(), N = new StringCollExtend(), L = new StringCollExtend();

        System.out.println("Enter an string to be inserted or 'exit' to quit:");
        value = keyboard.nextLine();

        while (!value.equalsIgnoreCase("exit")) {
            if (value.charAt(0) != ('-')) {
                P.insert(value);
                L.insert(value);
            } else {
                N.insert(value.substring(1));
                L.omit(value.substring(1));
            }
            System.out.println("Enter next string to be inserted or 'exit' to quit:");
            value = keyboard.nextLine();
        }

        System.out.println("\nThe values in collection P are:");
        P.print();
        System.out.println("\nThe values in collection N are:");
        N.print();
        System.out.println("\nThe values in collection L are:");
        L.print();
        if (P.equals(N)) {
         System.out.println("\nP and N are equal.");
         } else {
         System.out.println("\nP and N are NOT equal.");
         }
         StringCollExtend A = new StringCollExtend();
         A.copy(L);
         System.out.println("\nThe values in the copy of L are:");
         A.print();
         
    }
    
}
