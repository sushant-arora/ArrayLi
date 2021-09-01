package usageArrays;

import java.util.ArrayList;

public class QA_Bucks {
	
	public static void main(String[] args) {
		
		QAlists();
		
	}

	
	private static void QAlists() {
		// TODO Auto-generated method stub

		ArrayList<String> OrdersArray = new ArrayList<>();
		OrdersArray.add("0.Water w/ ice");
		OrdersArray.add("1.Small Espresso w/ Chocolate");
		OrdersArray.add("2.Large Cold Brew w/ double shot");
		OrdersArray.add("3.Medium Cappucino w/ Oat Milk");
		OrdersArray.add("4.Medium Flat White");
		OrdersArray.add("5.Large Choc Cookie Frappe w/ sugar free syrup");
		OrdersArray.add("6.Large Cafe Au Lait w/ extra milk");
		
		
		System.out.println(OrdersArray);
		
		System.out.println("============================");
		
		System.out.println("Order number 5 - " +OrdersArray.get(5));
		
		OrdersArray.set(3,"Medium Cappucino w/ Whole Milk");
		
		System.out.println("============================");
		
		System.out.println("Changed order -" +OrdersArray);
		
		
		ArrayList<String> DoneOrdersArray = new ArrayList<>();
		
		DoneOrdersArray.add(OrdersArray.get(1));
		DoneOrdersArray.add(OrdersArray.get(2));
		
		System.out.println("============================");
		
		System.out.println("Orders Done - " +DoneOrdersArray);
		
		OrdersArray.remove(1);
		OrdersArray.remove(2);
		
		System.out.println("============================");
		
		System.out.println("Orders Left - " +OrdersArray);
		
		System.out.println("============================");
		
		System.out.println("No. of orders left -" +OrdersArray.size());
		System.out.println("No. of orders done -" +DoneOrdersArray.size());
		
	
		
		DoneOrdersArray.add(OrdersArray.get(0));
		DoneOrdersArray.add(OrdersArray.get(1));
		DoneOrdersArray.add(OrdersArray.get(2));
		DoneOrdersArray.add(OrdersArray.get(3));
		DoneOrdersArray.add(OrdersArray.get(4));

		
		OrdersArray.clear();
		
		System.out.println("============================");
		
		System.out.println("Orders Done - " +DoneOrdersArray);
		System.out.println("Orders Left - " +OrdersArray);

		
		System.out.println("============================");
		
		System.out.println("No. of orders left -" +OrdersArray.size());
		System.out.println("No. of orders done -" +DoneOrdersArray.size());
		
		
	}
}
