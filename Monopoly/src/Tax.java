import javax.swing.*;
public class Tax extends Tile
	{
		static JFrame frame = new JFrame();
		private int amount;
		public Tax(String n, int a) 
		{
			super(n);
			amount = a;
		}
		public int getAmount() {
			return amount;
		}
		public void payTax(Player taxpayer)
		{
			Object[] choice = {"10%", this.amount+" dollar"};
			if (super.getName().equals("Income tax"))
			{
				int option = JOptionPane.showOptionDialog(frame, "Pay ur tax", "Choose wisely", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
				if (option==0) {taxpayer.setCash(taxpayer.getCash()*9/10);
				System.out.println("You paid a tax of $"+taxpayer.getCash()/9);}
				else taxpayer.setCash(taxpayer.getCash()-this.amount);
			}
			else taxpayer.setCash(taxpayer.getCash()-this.amount);
		}
	}
