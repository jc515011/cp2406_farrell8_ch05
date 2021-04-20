import javax.swing.JOptionPane;
public class EvenOdd {

    public static void main(String[] args)
    {
        // Get user to enter new number to check
        int newNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a whole number to check:", "EvenOdd", JOptionPane.INFORMATION_MESSAGE));
        if((newNum%2)==0){JOptionPane.showMessageDialog(null,"Number is Even", "EvenOdd" ,JOptionPane.PLAIN_MESSAGE);}
        if((newNum%2)==1){JOptionPane.showMessageDialog(null,"Number is Odd", "EvenOdd" ,JOptionPane.PLAIN_MESSAGE);}
    }
}

/**
 * Wrote by Yating Lei on 19/04/2020.
 */