
/**
 * Created by Yating Lei on 04/19/2020.
 */
import javax.swing.JOptionPane;
public class AscendingAndDescending {

    public static void main(String[] args)
    {
        // Declare new Array
        int[] numArray = new int[3];
        // Get user to enter new number to check
        int newNum1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter First Number:", "Ascending And Descending", JOptionPane.INFORMATION_MESSAGE));
        int newNum2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Second Number:", "Ascending And Descending", JOptionPane.INFORMATION_MESSAGE));
        int newNum3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Third Number:", "Ascending And Descending", JOptionPane.INFORMATION_MESSAGE));
        // Sort in order to array
        if(newNum1>newNum2&&newNum1>newNum3){numArray[0]=newNum1;if(newNum3>newNum2){numArray[1]=newNum3;numArray[2]=newNum2;}else{numArray[1]=newNum2;numArray[2]=newNum3;}}
        if(newNum2>newNum1&&newNum2>newNum3){numArray[0]=newNum2;if(newNum3>newNum1){numArray[1]=newNum3;numArray[2]=newNum1;}else{numArray[1]=newNum1;numArray[2]=newNum3;}}
        if(newNum3>newNum1&&newNum3>newNum2){numArray[0]=newNum3;if(newNum2>newNum1){numArray[1]=newNum2;numArray[2]=newNum1;}else{numArray[1]=newNum1;numArray[2]=newNum2;}}
        // Display Result
        JOptionPane.showMessageDialog(null,"The Numbers in order are: " + numArray[0] + " " + numArray[1] + " " + numArray[2], "Ascending And Descending" ,JOptionPane.PLAIN_MESSAGE);
    }
}