import org.junit.Assert;
import org.junit.Test;

/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {

    @Test
    public void quandoValoresDeTrianguloErradoEsperaFalse() throws Exception {
        Assert.assertFalse(Demo.isTriangle(1, 0, 1));
    }

    @Test
    public void quandoValoresDeTrianguloCorretoEsperaTrue() throws Exception {
        Assert.assertTrue(Demo.isTriangle(1,1,1));
    }

    @Test(expected = Exception.class)
    public void quandoValorDeTrianguloNegativoEsperaErro() throws Exception {
        Demo.isTriangle(1, -2, 2);
    }

}
