package exemplo_collections.hashmap;

import java.util.ArrayList;

public class ExemploArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> listaNomes = new ArrayList<>();
		
		listaNomes.add("Alice Soares");
		listaNomes.add("Bob Marley");
		listaNomes.add("Carol Procek");
		
		for(String nome : listaNomes){
			System.out.println(nome);
		}
		
		System.out.println(listaNomes.get(1));
		
		listaNomes.remove("Bob Marley");

		if(listaNomes.contains("Bob Marley")){
			System.out.println("Bob está na lista");
		} else {
			System.out.println("Bob não está na lista");
		}
		
		listaNomes.clear();
		
		if(listaNomes.isEmpty()) {
			System.out.println("A lista está vazia");
		}
		
	}
}
