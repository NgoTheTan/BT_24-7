public class RobotPlantTree extends Robot implements FarmingRobot {
    private int quantityOfTrees;
    private int quantityOfProcessingTrees;
    private int productivity;

    /**
     * hàm khởi tạo giá trị của robot.
     */
    public RobotPlantTree(String id, String model, String WorkPlace, int productivity) {
        super(id, model, WorkPlace);
        quantityOfTrees = 0;
        quantityOfProcessingTrees = 0;
        this.productivity = productivity;
    }

    public int getQuantityOfTrees() {
        return quantityOfTrees;
    }

    public void setQuantityOfTrees(int quantityOfTrees) {
        this.quantityOfTrees = quantityOfTrees;
    }

    public int getQuantityOfProcessingTrees() {
        return quantityOfProcessingTrees;
    }

    public void setQuantityOfProcessingTrees(int quantityOfProcessingTrees) {
        this.quantityOfProcessingTrees = quantityOfProcessingTrees;
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
        quantityOfTrees += productivity;
    }

    @Override
    /**
     * chức năng là tăng số lượng sản phẩm đã chế biến lên , đồng thời giảm số lượng
     * thu hoạch đi bằng với tần suất sản lượng tương ứng với 1 lần gọi.
     */
    public void processing() {
        quantityOfProcessingTrees += productivity;
        quantityOfTrees -= productivity;
    }

}
