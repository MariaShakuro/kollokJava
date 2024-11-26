import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {
private final Service service =new Service();
    @Test
    void calculateFactorials() {
        List<Long>res= service.calculateFactorials(5);
        assertEquals(List.of(1L,2L,6L,24L,120L),res);
    }
}