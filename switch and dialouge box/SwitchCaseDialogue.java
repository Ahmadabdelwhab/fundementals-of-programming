import javax.swing.JOptionPane;

public class SwitchCaseDialogue {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a number between 1 and 3:", "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        if (input != null) {
            try {
                int choice = Integer.parseInt(input);

                switch (choice) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "You chose Option 1: Hello!",
                         "Option 1", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "You chose Option 2: How are you?", "Option 2", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "You chose Option 3: Goodbye!", "Option 3", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid choice! Please enter a number between 1 and 3.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No input provided.", "Cancelled", JOptionPane.WARNING_MESSAGE);
        }
    }
}
