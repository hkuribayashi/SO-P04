package exemplos;

public class Main {

	public static void main(String[] args) {
		
		int totalThreads = 1000;
		
		for (int i=0; i<totalThreads; i++) {
			ThreadBasica t = new ThreadBasica("tX");
			t.start();
		}
		
	}
}
