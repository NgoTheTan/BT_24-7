public class RobotGrowFish extends Robot implements FarmingRobot {
    private int quantityOfFish;
    private int quantityOfProcessingFish;
    private int productivity;

    /**
     * hàm khởi tạo giá trị của robot.
     */
    public RobotGrowFish(String id, String model, String WorkPlace, int productivity) {
        super(id, model);
        this.workPlace = FARM;
        quantityOfFish = 0;
        quantityOfProcessingFish = 0;
        this.productivity = productivity;
    }

    public int getQuantityOfFish() {
        return quantityOfFish;
    }

    public void setQuantityOfFish(int quantityOfFish) {
        this.quantityOfFish = quantityOfFish;
    }

    public int getQuantityOfProcessingFish() {
        return quantityOfProcessingFish;
    }

    public void setQuantityOfProcessingFish(int quantityOfProcessingFish) {
        this.quantityOfProcessingFish = quantityOfProcessingFish;
    }

    public int getProductivity() {
        return productivity;
    }

    public void setProductivity(int productivity) {
        this.productivity = productivity;
    }

    @Override
    /**
     * chức năng là tăng số lượng thu hoạch lên bằng với tần suất sản lượng tương
     * ứng với 1 lần gọi.
     */
    public void harvest() {
        quantityOfFish += productivity;
    }

    @Override
    /**
     * chức năng là tăng số lượng sản phẩm đã chế biến lên , đồng thời giảm số lượng
     * thu hoạch đi bằng với tần suất sản lượng tương ứng với 1 lần gọi.
     */
    public void processing() {
        quantityOfProcessingFish += productivity;
        quantityOfFish -= productivity;
    }

}
