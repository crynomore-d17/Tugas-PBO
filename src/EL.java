public class EL {
    public static void main(String[] args) {
        EL main = new EL();
        main.test();
    }

    public void test() {
        Categories categories = new Categories("Hoodies", "High Heels", "scarf");
        Product ab = new Product("123", "Crop Top", categories);
        Product cd = (Product) ab.clone();

        cd.getCategories().setClothing("Tshirt");
        cd.setProductID("124");
        cd.setProductName("Tumblr Tee");

        System.out.println(ab);
        System.out.println(cd);
    }
}
