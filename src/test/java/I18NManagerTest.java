import I18NManager.I18NManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class I18NManagerTest {

    private I18NManager instance = null;

    @Before
    public void initialize () {
        instance = I18NManager.getInstance();
    }

    @After
    public void tearDown () {
        instance = null;
    }

    @Test
    public void i18NSpanishLabelsTest () {
        String l1 = instance.getlabel("es","l1");
        String l2 = instance.getlabel("es","l2");
        Assert.assertEquals("hola",l1);
        Assert.assertEquals("adios",l2);
    }

    @Test
    public void i18NEnglishLabelsTest () {
        String l1 = instance.getlabel("en","l1");
        String l2 = instance.getlabel("en","l2");
        Assert.assertEquals("hello",l1);
        Assert.assertEquals("bye",l2);
    }

    @Test
    public void i18NFrenchLabelsTest () {
        String l1 = instance.getlabel("fr","l1");
        String l2 = instance.getlabel("fr","l2");
        Assert.assertEquals("bonjour",l1);
        Assert.assertEquals("au revoir",l2);
    }
}
