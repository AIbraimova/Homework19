import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Write Monday or Tuesday :");
            String days = scanner.nextLine();
            if(Objects.equals(days,"Monday")){
                Week monday = Week.PONIDELNIK;
                System.out.println(monday);
            }
            else if (Objects.equals(days,"Tuesday")){
                Week tuesday = Week.VTORNIK;
                System.out.println(tuesday );
            }
            else System.out.println("Error!");

        }
    }
}