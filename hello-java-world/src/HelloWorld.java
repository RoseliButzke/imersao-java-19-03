
public class HelloWorld {

	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println(
					"Voc� n�o informou nenhum "
					+ " argumento");
		} else {
			System.out.print("Hello World ");
			for(int i=0 ; i<args.length ; i++ ) {
				System.out.print(args[i] + " ");
			}
		}
	}

}
