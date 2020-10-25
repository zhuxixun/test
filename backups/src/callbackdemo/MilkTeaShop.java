package callbackdemo;

public class MilkTeaShop {
    private NotificationListener listener;

    private MilkTeaShop() {

    }

    public static class MilkTeaShopHolder {
        private static MilkTeaShop instance = new MilkTeaShop();
    }

    public static MilkTeaShop getInstance() {
        return MilkTeaShopHolder.instance;
    }

    public void setListener(NotificationListener listener) {
        this.listener = listener;
    }

    public void makeTea() {
        System.out.println("make tea");
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                listener.notifyCustomer();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

    public void fetchTea() {
        System.out.println("fetch tea");
    }
}
