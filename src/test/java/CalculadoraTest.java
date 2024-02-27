import org.example.Calculadora;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class CalculadoraTest {

    @InjectMocks
    private Calculadora calculadora;
    int b = 3;
    int a = 5;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void somar(){
        int resul = calculadora.somar(a,b);
        assertEquals(a+b, resul);
    }

    @Test
    void subtrair(){
        int resul = calculadora.subtrair(a,b);
        assertEquals(a-b, resul);
    }

    @Test
    void multiplicar(){
        int resul = calculadora.multiplicar(a,b);
        assertEquals(a*b, resul);
    }

    @Test
    void dividir(){
        int resul = calculadora.dividir(a,b);
        assertEquals(a/b, resul);
    }

    @Test
    void testException(){
        try {
            var result = calculadora.dividir(0,0);
        }catch (Exception e){
            assertEquals(ArithmeticException.class, e.getClass() );
        }
    }

    @Test
    void testExceptionLambda(){
        assertThrows(ArithmeticException.class, () ->{
            var result = calculadora.dividir(0,0);
        } );
    }
}
