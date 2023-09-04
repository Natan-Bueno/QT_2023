package carrinho;
import produto.Produto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da calculadora")
public class CarrinhoTest {
    Carrinho carrinho;

    @BeforeEach  
    public void inicializa() {
        carrinho = new Carrinho();
    }

    @DisplayName("Testa adicionar itens ao carrinho")
    @Test
    public void testAddItem() {
        carrinho.addItem(new Produto("Camisa", 10.00));
        int qtd = carrinho.getQtdeItems();
        Assertions.assertEquals(1, qtd);
    }
}