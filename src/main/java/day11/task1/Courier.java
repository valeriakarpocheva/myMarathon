package day11.task1;

//“Курьер” (англ. Courier) с полями salary (заработная плата) и isPayed (был выплачен бонус или нет), get методами для
// обоих полей, методом toString() и конструктором.
public class Courier implements Worker {
    private int salary;
    private static final int PER_DELIVERY = 100;
    private int isPaid;
    private Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public int getIsPaid() {
        return isPaid;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public String toString() {
        return "The Courier's salary is: " + salary + "\n" + "The Courier is paid: " + isPaid;
    }


    public void doWork() {
        salary += PER_DELIVERY;
        warehouse.incrementDeliveredOrders();
    }

    public void bonus() {
        if (warehouse.getCountDeliveredOrders() == 10000) {
            isPaid += 50000;
        }else if(warehouse.getCountDeliveredOrders() < 10001){
            System.out.println("Бонус пока не доступен");
        }else if(getIsPaid() == 50000){
            System.out.println("Бонус уже был выплачен");
        }
    }
}
