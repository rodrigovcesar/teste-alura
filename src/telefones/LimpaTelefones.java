package telefones;

import java.util.HashMap;
import java.util.Map;

public class LimpaTelefones {

    private static Map<Character, Character> MAPA = new HashMap<>();

    public String limpa(String telefone) {
	StringBuilder limpo = new StringBuilder();
	if (telefone != null) {
	    char[] caracteres = telefone.trim().toUpperCase().toCharArray();
	    for (Character c : caracteres) {
		if (MAPA.containsKey(c)) {
		    limpo.append(MAPA.get(c));
		} else {
		    if (c >= '0' && c <= '9') {
			limpo.append(c);
		    }
		}
	    }
	}
	return limpo.toString();
    }

    static {
	MAPA.put('A', '2');
	MAPA.put('B', '2');
	MAPA.put('C', '2');
	MAPA.put('D', '3');
	MAPA.put('E', '3');
	MAPA.put('F', '3');
	MAPA.put('G', '4');
	MAPA.put('H', '4');
	MAPA.put('I', '4');
	MAPA.put('J', '5');
	MAPA.put('K', '5');
	MAPA.put('L', '5');
	MAPA.put('M', '6');
	MAPA.put('N', '6');
	MAPA.put('O', '6');
	MAPA.put('P', '7');
	MAPA.put('Q', '7');
	MAPA.put('R', '7');
	MAPA.put('S', '7');
	MAPA.put('T', '8');
	MAPA.put('U', '8');
	MAPA.put('V', '8');
	MAPA.put('W', '9');
	MAPA.put('X', '9');
	MAPA.put('Y', '9');
	MAPA.put('Z', '9');
    }

}
