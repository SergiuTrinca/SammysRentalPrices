import javax.swing.JOptionPane;
import java.util.Scanner;
public class SammyRentalPrice
{
    public static void main(String[] args)
    {
        int minuteTotale, pretTotal, pretOra;
        String sammysMotto = ("Sammy is makes it fun in the sun") ;
        JOptionPane.showMessageDialog(null,"" + sammysMotto);
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Introduceti  nr de minute in plus >>>");
        minuteTotale = inputDevice.nextInt();
        pretOra = 40;
        pretTotal = minuteTotale + pretOra;
        System.out.println("Nr de minute si de dolari pentru ele este : " + minuteTotale);
        System.out.println("Pretul pe ora este : " + pretOra);
        System.out.println("Pretul total este de: " + pretTotal);
    }
}