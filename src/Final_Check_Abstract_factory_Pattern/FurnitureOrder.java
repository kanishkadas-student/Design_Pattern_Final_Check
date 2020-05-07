package Final_Check_Abstract_factory_Pattern;

public class FurnitureOrder extends Order{

	
	public FurnitureOrder(Chennel channel) {
		super(ProductType.Furniture, channel);
		processOrder();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Furniture Products Ordered");
	}

}
