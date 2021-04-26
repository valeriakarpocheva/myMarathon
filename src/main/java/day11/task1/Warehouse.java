package day11.task1;
//“Склад” (англ. Warehouse) c полями countPickedOrders (количество собранных заказов), countDeliveredOrders (количество
// доставленных заказов), get методами для обоих полей и методом toString() для получения информации о значениях полей склада.
public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void incrementPickedOrders() {
        countPickedOrders++;
    }

    public void incrementDeliveredOrders() {
        countDeliveredOrders++;
    }

    public String toString(){
        return "Picked orders: "+countPickedOrders+"\n"+"Delivered orders: "+countDeliveredOrders;
    }
}
