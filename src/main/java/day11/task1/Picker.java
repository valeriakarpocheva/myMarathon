package day11.task1;

//“Сборщик” (англ. Picker) с полями salary (заработная плата) и isPayed (был выплачен бонус или нет), get методами для
// обоих полей, методом toString() и конструктором.
public class Picker implements Worker {
    private int salary;
    private final static int PER_ORDER = 80;
    private int isPaid;
    private Warehouse warehouse;


    public int getSalary() {
        return salary;
    }

    public int getIsPaid() {
        return isPaid;
    }


    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public String toString() {
        return "The Picker's salary is: " + salary + "\n" + "The Picker is paid: " + isPaid;
    }

    public void doWork() {
        salary += PER_ORDER;
        warehouse.incrementPickedOrders();
    }


    public void bonus() {
        if (warehouse.getCountPickedOrders() == 10000) {
            isPaid += 70000;
        }else if(warehouse.getCountPickedOrders() < 10001){
            System.out.println("Бонус пока не доступен");
        }else if(getIsPaid() == 70000){
            System.out.println("Бонус уже был выплачен");
        }
    }
}
