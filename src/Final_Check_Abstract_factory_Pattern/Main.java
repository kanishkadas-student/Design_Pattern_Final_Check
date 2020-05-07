package Final_Check_Abstract_factory_Pattern;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(OrderFactory.makeOrder(ProductType.Electronic, Chennel.E_commercewebsite));
		System.out.println(OrderFactory.makeOrder(ProductType.Toys, Chennel.Tele_caller_Agents_Application));
		System.out.println(OrderFactory.makeOrder(ProductType.Furniture, Chennel.E_commercewebsite));
	}
}
