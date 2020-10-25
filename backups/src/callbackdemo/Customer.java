package callbackdemo;

public class Customer {
    public void buyTea() {
        MilkTeaShop.getInstance().makeTea();
        MilkTeaShop.getInstance().setListener(() -> MilkTeaShop.getInstance().fetchTea());
    }
}
