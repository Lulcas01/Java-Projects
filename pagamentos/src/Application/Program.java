package Application;

import java.util.Date;

import enitties.enums.OrderStatus;
import entities.Order;

public class Program {

	public static void main(String[] args) {
		Order order = new Order(1000, new Date(), OrderStatus.PENDIN_PAYMENT );
		
		System.out.println(order);

	}

}
