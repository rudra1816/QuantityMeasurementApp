import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    // ✅ Feet tests
    @Test
    void givenSameFeetValues_whenCompared_thenShouldReturnTrue() {
        assertTrue(QuantityMeasurementApp.compareFeet(1.0, 1.0));
    }

    @Test
    void givenDifferentFeetValues_whenCompared_thenShouldReturnFalse() {
        assertFalse(QuantityMeasurementApp.compareFeet(1.0, 2.0));
    }

    // ✅ Inches tests (NEW)
    @Test
    void givenSameInchesValues_whenCompared_thenShouldReturnTrue() {
        assertTrue(QuantityMeasurementApp.compareInches(1.0, 1.0));
    }

    @Test
    void givenDifferentInchesValues_whenCompared_thenShouldReturnFalse() {
        assertFalse(QuantityMeasurementApp.compareInches(1.0, 2.0));
    }

    @Test
    void givenInchesValue_whenComparedWithNull_thenShouldReturnFalse() {
        QuantityMeasurementApp.Inches inches = new QuantityMeasurementApp.Inches(1.0);
        assertFalse(inches.equals(null));
    }

    @Test
    void givenInchesValue_whenComparedWithOtherType_thenShouldReturnFalse() {
        QuantityMeasurementApp.Inches inches = new QuantityMeasurementApp.Inches(1.0);
        assertFalse(inches.equals("1.0"));
    }

    @Test
    void givenSameReferenceInches_whenCompared_thenShouldReturnTrue() {
        QuantityMeasurementApp.Inches inches = new QuantityMeasurementApp.Inches(1.0);
        assertTrue(inches.equals(inches));
    }
}