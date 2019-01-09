package dice;

import java.util.Random;

public class Dice {
	protected int id;

	public Dice(int id) {
		this.id = id;
	}

	public int dropDice() {
		int[] resultArray = new int[25];

		for (int i = 0; i < 24; i++) {
			resultArray[i] = i / 4 + 1;
		}
		resultArray[resultArray.length - 1] = id + 1;

		Random rand = new Random();
		int rs = resultArray[rand.nextInt(25)];

		return rs;
	};
}
