import org.junit.Test;

public class MainClassTest {

    MainClass getter = new MainClass();

    @Test
    public void testGetLocalNumber() {
        if(getter.getLocalNumber() == 14) {
            System.out.println(" Возвращаемое значение метода равно 14 ");
        } else {
            System.out.println(" Возвращаемое значение метода неверно ");
        }

    }
}




