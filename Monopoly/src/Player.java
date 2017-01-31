
public class Player
	{
		private String name;
		private int cash;
		private boolean isInJail;
		private int doubleCount;
		private int position;
		public Player(String n, int c, boolean i, int d)
		{
			name = n;
			cash = c;
			isInJail = i;
			doubleCount = d;
		}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public int getCash()
			{
				return cash;
			}
		public void setCash(int cash)
			{
				this.cash = cash;
			}
		public boolean isInJail()
			{
				return isInJail;
			}
		public void setInJail(boolean isInJail)
			{
				this.isInJail = isInJail;
			}
		public int getDoubleCount()
			{
				return doubleCount;
			}
		public void setDoubleCount(int doubleCount)
			{
				this.doubleCount = doubleCount;
			}
		public void rollDice()
		{
			int r1 = (int)(Math.random()*6)+1;
			int r2 = (int)(Math.random()*6)+1;
			this.position += (r1+r2);
			this.doubleCount = (r1==r2)? this.doubleCount++ : 0;
		}
	}
