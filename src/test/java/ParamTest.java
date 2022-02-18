import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParamTest {
    private Calc calc;

    @BeforeEach
    public void init() {
        calc = new Calc();
    }

    @CsvSource({
            "1,2,3",
            "2,4,6",
            "6,7,13"
    })
    @ParameterizedTest
    public void massAdd(int a,int b, int res){
        Assertions.assertEquals(res,calc.add(a,b));
    }
}
