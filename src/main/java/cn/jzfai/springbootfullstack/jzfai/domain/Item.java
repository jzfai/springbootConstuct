package cn.jzfai.springbootfullstack.jzfai.domain;

public class Item {
    private Integer id;
    private Integer categoryId;
    private String  itemType;
    private String title;
    private String sellPoint;
    private String price;
    private String barcode;
    private String image;
    private String createdTime;
    private Integer num;
    private Integer status;
    private Integer priority;

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", categoryId=" + categoryId +
                ", itemType='" + itemType + '\'' +
                ", title='" + title + '\'' +
                ", sellPoint='" + sellPoint + '\'' +
                ", price='" + price + '\'' +
                ", barcode='" + barcode + '\'' +
                ", image='" + image + '\'' +
                ", createdTime='" + createdTime + '\'' +
                ", num=" + num +
                ", status=" + status +
                ", priority=" + priority +
                '}';
    }

    public Item(Integer id, Integer categoryId, String itemType, String title, String sellPoint, String price, String barcode, String image, String createdTime, Integer num, Integer status, Integer priority) {
        this.id = id;
        this.categoryId = categoryId;
        this.itemType = itemType;
        this.title = title;
        this.sellPoint = sellPoint;
        this.price = price;
        this.barcode = barcode;
        this.image = image;
        this.createdTime = createdTime;
        this.num = num;
        this.status = status;
        this.priority = priority;
    }

    public Item() {

    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
