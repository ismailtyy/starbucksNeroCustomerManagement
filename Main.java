package customerManagementt;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"İsmail","Toy",2002,"11111111111"));
		

	}

}
