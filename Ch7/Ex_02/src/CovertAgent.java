import java.util.Scanner;

public class CovertAgent {
    public static void main(String[] args)
    {
        System.out.println("Please enter a codename:");
        Scanner keyboard = new Scanner(System.in);
        String codeName = keyboard.next();
        while(codeName.length() <= 6 || ( codeName.charAt(codeName.length()-1)!='X' ) || ( ! codeName.startsWith("Agent")) ){
            System.out.println("INVALID CODENAME!");
            System.out.println("Please reenter a codename[It must be larger than 6 characters, start with Agent and end with X]:");
            codeName = keyboard.next();
        }
        System.out.println("Please reenter your codename to confirm your choice:");
        String confirm = keyboard.next();
        if(confirm.equals(codeName)){
            System.out.println("CODE NAME CONFIRMED");
        }else{
            System.out.println("CODE NAME MIS-MATCH");
        }
    }
}