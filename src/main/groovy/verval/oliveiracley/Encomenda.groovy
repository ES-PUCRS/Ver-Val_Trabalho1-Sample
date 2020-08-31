package verval.oliveiracley

import java.lang.Integer
import java.lang.RuntimeException

class Encomenda {

	// Este main existe para poder executar com gradle run
    static void main(String[] args) {
        def barras = qtdadeBarras(args[0] as int);

        println "Barras de 5 Kgs: ${barras[0]}"
        println "Barras de 1 Kgs: ${barras[1]}"
    }

    // O método que a gente quer testar
    static int[] qtdadeBarras(int peso){
        def barras = new int[2]
        barras[0] = 1
    	
    	return barras
    }

}
