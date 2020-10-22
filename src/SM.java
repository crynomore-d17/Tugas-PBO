public class SM {
    public static void main(String args[]) {
        SM main = new SM();
        main.test();
    }

    public void test() {
        Categories categories = new Categories("Tshirt", "High Heels", "scarf");
        Product ab = new Product("111", "Outer", categories);

        Product cd = new Product(
                ab.getProductID(), ab.getProductName(), ab.getCategories());

        cd.setProductID("122");
        cd.getCategories().setClothing("Sweater");
        System.out.println(ab);
        System.out.println(cd);
    }
}
