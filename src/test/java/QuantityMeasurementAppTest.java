import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    // ✅ UC1: Feet to Feet
    @Test
    void givenFeetToFeetSameValue_shouldReturnTrue() {
        var q1 = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        var q2 = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);

        assertEquals(q1, q2);
    }

    @Test
    void givenFeetToFeetDifferentValue_shouldReturnFalse() {
        var q1 = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        var q2 = new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.FEET);

        assertNotEquals(q1, q2);
    }

    // ✅ UC2: Inch to Inch
    @Test
    void givenInchToInchSameValue_shouldReturnTrue() {
        var q1 = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCH);
        var q2 = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCH);

        assertEquals(q1, q2);
    }

    @Test
    void givenInchToInchDifferentValue_shouldReturnFalse() {
        var q1 = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCH);
        var q2 = new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.INCH);

        assertNotEquals(q1, q2);
    }

    // ✅ UC3: Cross-unit equality
    @Test
    void givenFeetAndInchEquivalent_shouldReturnTrue() {
        var q1 = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        var q2 = new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCH);

        assertEquals(q1, q2);
    }

    @Test
    void givenInchAndFeetEquivalent_shouldReturnTrue() {
        var q1 = new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCH);
        var q2 = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);

        assertEquals(q1, q2);
    }

    // ✅ Common tests (UC1, UC2, UC3)
    @Test
    void givenSameReference_shouldReturnTrue() {
        var q = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);

        assertEquals(q, q);
    }

    @Test
    void givenNullComparison_shouldReturnFalse() {
        var q = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);

        assertNotEquals(null, q);
    }

    @Test
    void givenDifferentUnitsAndDifferentValues_shouldReturnFalse() {
        var q1 = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        var q2 = new QuantityMeasurementApp.QuantityLength(10.0, QuantityMeasurementApp.LengthUnit.INCH);

        assertNotEquals(q1, q2);
    }

    @Test
    void givenNullUnit_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new QuantityMeasurementApp.QuantityLength(1.0, null);
        });
    }
}