import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    @Test
    void givenSameFeetValues_whenCompared_thenShouldReturnTrue() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(1.0);

        assertEquals(feet1, feet2);
    }

    @Test
    void givenDifferentFeetValues_whenCompared_thenShouldReturnFalse() {
        QuantityMeasurementApp.Feet feet1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet feet2 = new QuantityMeasurementApp.Feet(2.0);

        assertNotEquals(feet1, feet2);
    }

    @Test
    void givenFeetValue_whenComparedWithNull_thenShouldReturnFalse() {
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(1.0);

        assertNotEquals(null, feet);
    }

    @Test
    void givenFeetValue_whenComparedWithOtherType_thenShouldReturnFalse() {
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(1.0);

        assertNotEquals("1.0", feet);
    }

    @Test
    void givenSameReference_whenCompared_thenShouldReturnTrue() {
        QuantityMeasurementApp.Feet feet = new QuantityMeasurementApp.Feet(1.0);

        assertEquals(feet, feet);
    }
}