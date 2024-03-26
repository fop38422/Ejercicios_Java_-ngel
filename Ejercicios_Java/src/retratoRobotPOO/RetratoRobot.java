package retratoRobotPOO;

public class RetratoRobot {
	private static final String[][] OPCIONES = {
			{ "WWWWWWWWW", "\\\\\\//////", "|\"\"\"\"\"\"\"|", "|||||||||" },
			{ "|  O O  |", "|-(· ·)-|", "|-(o o)-|", "|  \\ /  |" },
			{ "@   J   @", "{   \"   }", "[   j   ]", "<   -   >" },
			{ "|  ===  |", "|   -   |", "|  ___  |", "|  ---  |" },
			{ " \\_____/ ", " \\,,,,,/ " } };

	private int[] elecciones = new int[OPCIONES.length];

	public RetratoRobot(int pelo, int ojos, int nariz, int boca, int barbilla) {
		if (pelo >= OPCIONES[0].length) {
			throw new IllegalArgumentException("Introduce un valor de pelo válido y vuelve a intentarlo.");
		}
		if (ojos >= OPCIONES[1].length) {
			throw new IllegalArgumentException("Introduce un valor de ojos válido y vuelve a intentarlo.");
		}
		if (nariz >= OPCIONES[2].length) {
			throw new IllegalArgumentException("Introduce un valor de nariz válido y vuelve a intentarlo.");
		}
		if (boca >= OPCIONES[3].length) {
			throw new IllegalArgumentException("Introduce un valor de boca válido y vuelve a intentarlo.");
		}
		if (barbilla >= OPCIONES[4].length) {
			throw new IllegalArgumentException("Introduce un valor de barbilla válido y vuelve a intentarlo.");
		}
		
		elecciones[0] = pelo;
		elecciones[1] = ojos;
		elecciones[2] = nariz;
		elecciones[3] = boca;
		elecciones[4] = barbilla;
	}

	public RetratoRobot() {
		elecciones[0] = (int) (Math.random() * OPCIONES[0].length);
		elecciones[1] = (int) (Math.random() * OPCIONES[1].length);
		elecciones[2] = (int) (Math.random() * OPCIONES[2].length);
		elecciones[3] = (int) (Math.random() * OPCIONES[3].length);
		elecciones[4] = (int) (Math.random() * OPCIONES[4].length);
	}

	@Override
	public String toString() {
		return OPCIONES[0][elecciones[0]] + "\n" + OPCIONES[1][elecciones[1]] + "\n" + OPCIONES[2][elecciones[2]] + "\n" + OPCIONES[3][elecciones[3]] + "\n"
				+ OPCIONES[4][elecciones[4]];
	}
	
	public static void main(String[] args) {
		RetratoRobot aleatorio = new RetratoRobot();
		
		System.out.println(aleatorio.toString());
	}
}