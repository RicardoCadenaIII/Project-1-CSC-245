import java.lang.reflect.Field; //imports Java Reflection Field

class Cat {
    // creates private variables
    private String name = "Gizmo";
    private String mother = "Monique";
    private int age = 23;

    // toString statement that lists variables
    public String toString() { return "Name: " + name + "\nMother: " + mother + "\nAge: " + age; }

    public void catChange(String fieldName) {           // Not compliant
        try {
            // Passes through language access checks for protection and creates Field f
            // equaling value of fieldName in declaredField
            Field f = this.getClass().getDeclaredField(fieldName);
            // Sets declaredField of fieldName to stated value
            f.set(this, "Raja");
            // Log appropriately or throw sanitized exception; see EXC06-J
        } catch (NoSuchFieldException ex) {
            // Outputs exception report, required for getDeclaredField
            System.out.println("NoSuchFieldException");
        } catch (IllegalAccessException ex) {
            // Outputs exception report, required for setting the field of a value (.set())
            System.out.println("IllegalAccessException");
        }
    }
}