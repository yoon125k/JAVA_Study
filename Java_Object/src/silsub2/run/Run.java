package silsub2.run;

import silsub2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product pd = new Product();
		
		pd.setBrand("Adidas");
		pd.setpName("T-shirt");
		pd.setPrice(50000);
		
		System.out.println(pd.information());
	}

}
