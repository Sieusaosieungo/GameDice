package dice;

import java.util.ArrayList;
import java.util.Random;

public class Dice {
	protected int id;

	public Dice(int id) {
		this.id = id;
	}

	public int dropDice() {
		ArrayList<Integer> resultArray = new ArrayList<Integer>();

		for (int i = 0; i < 24; i++) {
			resultArray.add(i / 4 + 1);
		}

		resultArray.add(id + 1);
		Random rand = new Random();
		int rs = resultArray.get(rand.nextInt(resultArray.size()));
		return rs;

	};
}
