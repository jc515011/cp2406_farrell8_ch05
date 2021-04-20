<<<<<<< HEAD
// FixDebugFive1
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents
import javax.swing.*;
public class FixDebugFive1
{
   public static void main(String args[]) throws Exception
   {
      final double HIGH_PRICE = 2.59;
      final double MED_PRICE = 1.99;
      final double LOW_PRICE = 0.89;
      int usersChoice;
      double bill = 0.00;
      String usersChoiceString = JOptionPane.showInputDialog(null, "Order please \n 1 - Burger \n 2 - Hotdog" + "\n 3 - Grilled cheese \n 4 - Fish sandwich");
      usersChoice= Integer.parseInt(usersChoiceString);
      if(usersChoice == 12){bill = bill + HIGH_PRICE;}
      else if(usersChoice == 34){bill = bill + MED_PRICE;}
      usersChoiceString = JOptionPane.showInputDialog(null, "Fries with that? \n 1 - Yes \n 2 - No");
      usersChoice= Integer.parseInt(usersChoiceString);
      if (usersChoice == 1){bill = bill + LOW_PRICE;}
      JOptionPane.showMessageDialog(null,"Bill is " + bill);
   }
=======
// FixDebugFive1
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents
        import javax.swing.*;
   public class FixDebugFive1
   {
      public static void main(String args[]) throws Exception
      {
         final double HIGH_PRICE = 2.59;
         final double MED_PRICE = 1.99;
         final double LOW_PRICE = 0.89;
         int usersChoice;
         double bill = 0.00;
         String usersChoiceString = JOptionPane.showInputDialog(null, "Order please \n 1 - Burger \n 2 - Hotdog" + "\n 3 - Grilled cheese \n 4 - Fish sandwich");
         usersChoice= Integer.parseInt(usersChoiceString);
         if(usersChoice == 12){bill = bill + HIGH_PRICE;}
         else if(usersChoice == 34){bill = bill + MED_PRICE;}
         usersChoiceString = JOptionPane.showInputDialog(null, "Fries with that? \n 1 - Yes \n 2 - No");
         usersChoice= Integer.parseInt(usersChoiceString);
         if (usersChoice == 1){bill = bill + LOW_PRICE;}
         JOptionPane.showMessageDialog(null,"Bill is " + bill);
      }
>>>>>>> origin/master
   }