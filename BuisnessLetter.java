import javax.swing.*;
public class BuisnessLetter
{
	public static void main(String[] args)
	{
		// variables and constants
		String name;
		String firstName = "";
		String familyName = "";
		int x;
		char c;

		// input phase
		name = JOptionPane.showInputDialog(null, "Please enter customer's first name and last name");
		
		// calculation phase
		x = 0;
		while(x < name.length())
		{
			// keep checking every character in the name to see if we have found the blank space character
			if(name.charAt(x) == ' ')
			{
				firstName = name.substring (0, x);
				familyName = name.substring(x + 1, name.length());
				// once the blank is found, force the variable to the lngth number to stop the looping
				x = name.length();
			}
			++x;	

	}
	// output phase
	JOptionPane.showMessageDialog(null, "Dear " + firstName + 
		", \nI am so glad we are on a first name basis" +
		"\nbecause i would the like opportunity to" +
		"\ntalk to you about an affordable insurance" +
		"\nprotection plan for the entire" + familyName +
		"\nfamily. Call A-One Family Insurance today" + 
		"\nat 1-800-555-9278.");
	}
}
