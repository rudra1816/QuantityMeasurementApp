import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    // ✅ UC1 + UC2 (same unit)
    @Test
    void testFeetSameValue() {
        assertEquals(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET)
        );
    }

    @Test
    void testInchSameValue() {
        assertEquals(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCH),
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCH)
        );
    }

    @Test
    void testFeetDifferentValue() {
        assertNotEquals(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.FEET)
        );
    }

    // ✅ UC3 (cross-unit)
    @Test
    void testFeetToInch() {
        assertEquals(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET),
                new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCH)
        );
    }

    // ✅ UC4 (yards)
    @Test
    void testYardToFeet() {
        assertEquals(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARD),
                new QuantityMeasurementApp.QuantityLength(3.0, QuantityMeasurementApp.LengthUnit.FEET)
        );
    }

    @Test
    void testYardToInch() {
        assertEquals(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARD),
                new QuantityMeasurementApp.QuantityLength(36.0, QuantityMeasurementApp.LengthUnit.INCH)
        );
    }

    @Test
    void testYardSameValue() {
        assertEquals(
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.YARD),
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.YARD)
        );
    }

    // ✅ UC4 (centimeters)
    @Test
    void testCmSameValue() {
        assertEquals(
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.CENTIMETER),
                new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.CENTIMETER)
        );
    }

    @Test
    void testCmToInch() {
        assertEquals(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.CENTIMETER),
                new QuantityMeasurementApp.QuantityLength(0.393701, QuantityMeasurementApp.LengthUnit.INCH)
        );
    }

    @Test
    void testCmToFeetFalse() {
        assertNotEquals(
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.CENTIMETER),
                new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET)
        );
    }

    // ✅ Transitive property
    @Test
    void testTransitiveProperty() {
        var yard = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARD);
        var feet = new QuantityMeasurementApp.QuantityLength(3.0, QuantityMeasurementApp.LengthUnit.FEET);
        var inch = new QuantityMeasurementApp.QuantityLength(36.0, QuantityMeasurementApp.LengthUnit.INCH);

        assertEquals(yard, feet);
        assertEquals(feet, inch);
        assertEquals(yard, inch);
    }

    // ✅ Common tests
    @Test
    void testSameReference() {
        var q = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        assertEquals(q, q);
    }

    @Test
    void testNullComparison() {
        var q = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        assertNotEquals(null, q);
    }

    @Test
    void testNullUnit() {
        assertThrows(IllegalArgumentException.class, () -> {
            new QuantityMeasurementApp.QuantityLength(1.0, null);
        });
    }
}