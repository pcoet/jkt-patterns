package jkt.patterns.oop

/**
 * Gizmo inherits from a Java class, Widget. It adds a field, dialRangeMax,
 * and overrides the toString method.
 */
class Gizmo(
    name: String,
    upperLeftX: Int,
    upperLeftY: Int,
    width: Int,
    height: Int,
    val dialRangeMax: Int
) : Widget(name, upperLeftX, upperLeftY, width, height) {

    override fun toString(): String {
        return "Gizmo{" +
                "name=" + name +
                ", upperLeftPoint=" + upperLeftPoint +
                ", upperRightPoint=" + upperRightPoint +
                ", lowerRightPoint=" + lowerRightPoint +
                ", lowerLeftPoint=" + lowerLeftPoint +
                ", dialRangeMax=" + dialRangeMax +
                '}'
    }
}