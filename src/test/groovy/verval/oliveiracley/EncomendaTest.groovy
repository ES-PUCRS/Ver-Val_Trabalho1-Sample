package verval.oliveiracley

// import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.lang.RuntimeException;

//Drive de teste
class AppTest {

    //Classe a ser testada
    def encomenda = new Encomenda()

    //Teste unitário
	@Test
	@DisplayName("Descricao para aparecer bonitim no terminal com o PASSED verdinho :)")
    void "Nome da funcao"() {

        //Pega uma mostra de um parametro conhecido
    	def result = encomenda.qtdadeBarras(5 as int)

        //Cria um exemplo de como deveria ser a resposta
    	int[] shouldBe = new int[2]
    	shouldBe[0] = 1
    	shouldBe[1] = 0

        // Compara a amostra com o exemplo
        // 'Aquele true da true'
        assertArrayEquals(shouldBe,result);
    }

}
	
