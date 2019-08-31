public class Task {
	public static void main(String[] args) {
		Task task = new Task();
		StringBuilder sb = new StringBuilder();
		String stringVal = task.booleanAnd(0, 0);
		int diff = 8 - stringVal.length();
		for (int i = 0; i < diff; i++) {
			sb.append("0");
		}
		sb.append(stringVal);
		System.out.println(sb.toString());
	}

	public String booleanAnd(int number1, int number2) {
		return "";
	}

}