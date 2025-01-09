package main.java.org.anup.number;

enum OrderStatus{
    NEW, PROCESSING, SHIPPED, DELIVERED, CANCELLED;
}

public class OrderEnum {
    private int orderId;
    private OrderStatus status;

    public OrderEnum(int orderId, OrderStatus status) {
        this.orderId = orderId;
        this.status = status;
    }

    public void printOrderStatus() {

        //Improves Type Safety : This means you can’t assign any value other than the predefined constants to an enum variable.
        //OrderEnum order = OrderStatus.PAID; // This will cause a compilation error

        // Enums can be used in switch statements, making the code more readable and maintainable.
        switch (status) {
            case NEW:
                System.out.println("Order is new.");
                break;
            case PROCESSING:
                System.out.println("Order is being processed.");
                break;
            case SHIPPED:
                System.out.println("Order has been shipped.");
                break;
            case DELIVERED:
                System.out.println("Order has been delivered.");
                break;
            case CANCELLED:
                System.out.println("Order has been cancelled.");
                break;
        }

        System.out.println("======================");

        // Enum Can Be Traversed : traverse all the constants of an enum using the values() method.
        // values() : returns an array containing the all the values of enum.
        for (OrderStatus orderStatus : OrderStatus.values()) {
            System.out.println(orderStatus);
        }

        System.out.println("==================");

        // valueOf() : returns the value of given constant enum
        System.out.println(OrderStatus.valueOf("NEW"));

        System.out.println("==================");

        // ordinal() : returns index of the enum value.
        System.out.println(OrderStatus.valueOf("NEW").ordinal());
    }

    public static void main(String[] args) {
        OrderEnum order = new OrderEnum(123, OrderStatus.NEW);
        order.printOrderStatus();
    }
}
