public class Register {
    public static void main(String[] args) {
        //Cat object created
        Cat c = new Cat();
        //runs toString() of Cat object c
        System.out.println("Cat 1");
        System.out.println(c.toString());

        // Starts non-compliant code
        // Sets the field variable of cat name to designated variable in Cat class
        // when argument is passed through, afterward printing variables with toString()
        System.out.println("\nCat 2");
        for (String arg : args) {
            c.catChange(arg);
            System.out.println(c.toString());
        }
    }
}