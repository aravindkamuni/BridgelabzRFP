public class ReverseNumber {
	public static void main (String[] args) {
		int numbers = 9494556, reverse= 0;
		while (numbers!=0)
		{
			int reminder = numbers %10;
		reverse = reverse*10 + reminder;
		numbers = numbers/10;
		}
		System.out.println("reverse numbers is :" + reverse);
	}
}