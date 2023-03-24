public class Notebook {
    private int productId;
    private int unitPrice;
    private int discountRate;
    private int stockAmount;
    private String productName;
    private String brandInformation;
    private int memory;
    private String screenSize;
    private int ram;

    public Notebook(int productId, int unitPrice, int discountRate, int stockAmount, String productName, String brandInformation, int memory, String screenSize, int ram) {
        this.productId = productId;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stockAmount = stockAmount;
        this.productName = productName;
        this.brandInformation = brandInformation;
        this.memory = memory;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrandInformation() {
        return brandInformation;
    }

    public void setBrandInformation(String brandInformation) {
        this.brandInformation = brandInformation;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
