package object2;

public class ShopService {
	private static ShopService ShopService= new ShopService();
	private ShopService() {}
	static ShopService getInstance() {
		return ShopService;
	}
	
}
