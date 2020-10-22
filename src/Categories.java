public class Categories {
    public String clothing;
    public String shoes;
    public String accessories;

    //standards constructor, getter and setter

    public Categories(String clothing, String shoes, String accessories) {
        this.clothing = clothing;
        this.shoes = shoes;
        this.accessories = accessories;
    }

    public Object clone() {
        try {
            return (Categories) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Categories(this.getClothing(), this.getShoes(), this.getAccessories());
        }
    }
    public String getClothing() {
        return clothing;
    }

    public void setClothing(String clothing) {
        this.clothing = clothing;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "clothing='" + clothing + '\'' +
                ", shoes='" + shoes + '\'' +
                ", accessories='" + accessories + '\'' +
                '}';
    }
}
