package apna.strings;

public class ShortestPath {

	public static float getShortestPath(String path) {
		int x = 0, y = 0;
		for (int i = 0; i < path.length(); i++) {
			char dir = path.charAt(i);

			if (dir == 'W') 		// West
				x--;
			else if (dir == 'E') 	// East
				x++;
			else if (dir == 'N') 	// North
				y++;
			else 							// South
				y--;
		}

		return (float) Math.sqrt(((x * x) + (y * y)));
	}

	public static void main(String[] args) {
		String path = "WWNEENESENNN";
		System.out.println(getShortestPath(path));
	}

}
