public class Product {
    public String ProductID;
    public String ProductName;
    public Categories categories;

    //standards constructor, getter and setter

    public Product(Product product){
        this(product.getProductID(), product.getProductName(), product.getCategories());
    }

    public Product(String productID, String productName, Categories categories) {
        this.ProductID = productID;
        this.ProductName = productName;
        this.categories = categories;
    }

    public Object clone() {
        Product product = null;
        try {
            product = (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            product = new Product(
                    this.getProductID(), this.getProductName(), this.getCategories());
        }
        product.categories = (Categories) this.categories.clone();
        return product;
    }


    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductID='" + ProductID + '\'' +
                ", ProductName='" + ProductName + '\'' +
                ", categories=" + categories +
                '}';
    }
}
