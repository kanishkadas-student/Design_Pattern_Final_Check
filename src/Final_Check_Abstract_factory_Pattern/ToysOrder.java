package Final_Check_Abstract_factory_Pattern;

public class ToysOrder extends Order{

	
	
	public ToysOrder(Chennel channel) {
		super(ProductType.Toys, channel);
		processOrder();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Toy Products Ordered");
	}

}
