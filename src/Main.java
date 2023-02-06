import javax.xml.crypto.dsig.spec.XPathType;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your party affiliation(D, R, I): ");
        String partyAff = sc.next();

        if(Objects.equals(partyAff, "D")){
            System.out.println("You get a Democratic Donkey.");
        }else if(Objects.equals(partyAff, "R")) {
            System.out.println("You get a Republican Elephant.");
        }else if(Objects.equals(partyAff, "I")){
            System.out.println("You get an Independent Person.");
        }else{
            System.out.println("Other");
        }

    }
}