package calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}
	
	@DisplayName("Testa a soma de dois números")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);		
		Assertions.assertEquals(9, soma);		
	}
	
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}
	
	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			fail("Exceção não lançada");
		}catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}		
	}
	
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> calc.divisao(8, 0));
	}

	@DisplayName("Testa a subtracao de dois números")
	@Test
	public void testSubtracaoDoisNumeros(){
		int subtracao = calc.subtracao(8, 2);
		Assertions.assertEquals(6, subtracao);	
	}

	@DisplayName("Testa a multiplicação de dois números")
	@Test
	public void testMultiplicacaoDoisNumeros() {
		int multiplicacao = calc.multiplicacao(5,2);
		Assertions.assertEquals(10, multiplicacao);
	}

	@DisplayName("Testa a somatória de um número")
	@Test
	public void testSomatoria() {
		int somatoria = calc.somatoria(2);
		Assertions.assertEquals(3, somatoria);
	}

	@DisplayName("Testa se um número é positivo")
	@Test
	public void testEhPositivo() {
		boolean positivo = calc.ehPositivo(10);
		Assertions.assertEquals(true, positivo);
	}

	@DisplayName("Testa comparação de dois números")
	@Test
	public void testComparaDoisnumerosIguais() {
		int compara = calc.compara(2, 2);
		Assertions.assertEquals(0, compara);
	}

	@DisplayName("Testa comparação numero maior com menor")
	@Test
	public void testComparaNumeroMaiorComMenor() {
		int compara = calc.compara(5, 2);
		Assertions.assertEquals(1, compara);
	}

	@DisplayName("Testa comparação numero menor com maior")
	@Test
	public void testComparaNumeroMenorComMaior() {
		int compara = calc.compara(2,3);
		Assertions.assertEquals(-1, compara);
	}
}
