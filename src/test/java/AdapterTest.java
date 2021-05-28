import org.example.Adapter;
import org.example.PointDecart;
import org.example.PointPolar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdapterTest {

    private Adapter adapter;

    @Test
    public void first() {
        adapter = new Adapter(new PointPolar(10.0, 0.5));
        var pointDecart = adapter.transform();
        assertEquals("PointDecart",
                pointDecart.getClass().getSimpleName());
        assertEquals(pointDecart.getX(), 8.7, 0.1);
        assertEquals(pointDecart.getY(), 4.7, 0.1);
    }

    @Test
    public void second() {
        adapter = new Adapter(new PointPolar(12.0, -0.5));
        var pointDecart = adapter.transform();
        assertEquals("PointDecart",
                pointDecart.getClass().getSimpleName());
        assertEquals(pointDecart.getX(), 10.5, 0.1);
        assertEquals(pointDecart.getY(), -5.7, 0.1);
    }
}