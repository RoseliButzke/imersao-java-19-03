
public class StringComparator {
	
	public static void main(String[] args) {
		if(args == null || args.length != 2) {
			System.out.println("Argumentos inv�lidos");
		}
		else {
			System.out.println(
					args[0].equals(args[1]));
		}
	}

}
