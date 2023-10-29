package exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadBasica extends Thread{
	
	String name;
	
	public ThreadBasica(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		
		int total = 50000000;
		
		Random random = new Random();
		
		List<Integer> lista = new ArrayList<Integer>();
		
		for (int i=0; i<total; i++) {
			lista.add(random.nextInt(100000, 2000000));
		}
		
		Integer soma = 0;
		for (int i=0; i<total; i++) {
			soma += lista.get(i);
		}
		
	} 
	
}