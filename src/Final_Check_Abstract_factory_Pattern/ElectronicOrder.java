package Final_Check_Abstract_factory_Pattern;

public class ElectronicOrder extends Order{
	
	
	public ElectronicOrder(Chennel chennel) {
		super(ProductType.Electronic, chennel);
		processOrder();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Order Electronic Products");
	}

}
