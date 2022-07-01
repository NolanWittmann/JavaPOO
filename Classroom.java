class Classroom {
    public static void main(String[] args) {
        // references
        Wilder Nolan = new Wilder("Nolan", true);
        Wilder Manon = new Wilder("Manon", false);
        Wilder Vincent = new Wilder("Vincent", true);
        Wilder Leila = new Wilder("Leila", true);

        System.out.println(Manon.whoAmI());
        System.out.println(Nolan.whoAmI());
        System.out.println(Vincent.whoAmI());
        System.out.println(Leila.whoAmI());

        Vincent.setAware(false);

        Wilder Melvin = Leila;

        Melvin.setName("Melvin");

        System.out.println(Melvin.whoAmI());
        System.out.println(Vincent.whoAmI());
        System.out.println(Leila.whoAmI());

    }
}
