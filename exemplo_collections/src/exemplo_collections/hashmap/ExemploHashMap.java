package exemplo_collections.hashmap;

import java.util.HashMap;

public class ExemploHashMap {
	
	public static void main(String[] args) {
		
		HashMap<String, String> capitais = new HashMap<>();
		
		capitais.put("Brasil", "Brasilia");
		capitais.put("França", "Paris");
		capitais.put("Japão", "Toquio");

		System.out.println(capitais);
		
		System.out.println(capitais.get("Brasil"));
		
		if(capitais.containsKey("Argentina")) {
			System.out.println("Argentina está na lista");
		} else {
			System.out.println("Argentina nao está na lista");
		}
		
		for(String chave : capitais.keySet()) {
			System.out.println(chave + " - " + capitais.get(chave));
		}
		
		
	}
	
}
