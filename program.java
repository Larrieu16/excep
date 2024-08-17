import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import entities.reservation;
import exceptions.domainException;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Room number: ");
            int number = sc.nextInt();
            System.out.println("Check-in date: (dd/MM/yyyy)");
            Date checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date: (dd/MM/yyyy)");
            Date checkOut = sdf.parse(sc.next());

            reservation reservation = new reservation(number, checkIn, checkOut);
            System.out.println("Reservation:  " + reservation);
            System.out.println("Enter data to update the reservation: ");
            System.out.println("Check-in date: (dd/MM/yyyy)");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date: (dd/MM/yyyy)");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation:  " + reservation);

        }
        catch (ParseException e){
            System.out.println("Invalid date format");
        }
        catch (domainException e){
            System.out.println(e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Unexpected error");
        }


        sc.close();
    }
}
