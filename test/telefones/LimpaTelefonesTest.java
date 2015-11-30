package telefones;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LimpaTelefonesTest {

    private LimpaTelefones instance;

    @Before
    public void setUp() throws Exception {
	this.instance = new LimpaTelefones();
    }

    @Test
    public void testNulo() {
	Assert.assertEquals("", this.instance.limpa(null));
    }
    
    @Test
    public void testVazio() {
	Assert.assertEquals("", this.instance.limpa(""));
    }

    @Test
    public void testEspacos() {
	Assert.assertEquals("", this.instance.limpa("    "));
    }
    
    @Test
    public void testLimpeza() {
	// Testes do exercício
	Assert.assertEquals("180025872", this.instance.limpa("1-800-ALURA"));
	Assert.assertEquals("180025872", this.instance.limpa("1-800-25872"));
	Assert.assertEquals("55223586", this.instance.limpa("55CAELUM"));
	// Testes adicionais com 'sujeira'
	Assert.assertEquals("180025872", this.instance.limpa("1--800 ALURA"));
	Assert.assertEquals("180025872", this.instance.limpa("1$800 25872"));
	Assert.assertEquals("25872", this.instance.limpa("#ALURA$"));
    }


}
