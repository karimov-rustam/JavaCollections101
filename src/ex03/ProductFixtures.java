package ex03;

class ProductFixtures {
    static Product floorPanel = new Product("Floor Panel", 25);
    static Product window = new Product("Glass Window", 10);
    static Product door = new Product("Wooden Door", 35);

    static Supplier bobs = new Supplier("Bob's Household Supplies");
    static Supplier kates = new Supplier("Kate's Home Goods");

    static {
        bobs.products().add(door);
        bobs.products().add(floorPanel);

        kates.products().add(floorPanel);
        kates.products().add(new Product("Glass Window", 10));
    }
}
