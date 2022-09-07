package Q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class ProductList {
	List<Product> products = new ArrayList<>();
	public List<Product> getProducts() {
		products.add(new Product(101, "Bag", 1500));
		products.add(new Product(102, "Headphones", 2500));
		products.add(new Product(103, "Guitar", 9000));
		products.add(new Product(104, "Cables", 500));
		products.add(new Product(105, "Microphone", 3000));
		products.forEach(
				(Product p1)-> {
					if(p1.getProdPrice() < 0) {
						throw new RuntimeException("Price is negative");
					}
				}
		);
		return products;
	}
	public List<Product>getProductsSort() {
		List<Product> products = new ProductList().getProducts();
		Collections.sort(products, new Comparator<Product>() {
			public int compare(Product o1, Product o2) {
				return Double.compare(o1.getProdPrice(), o2.getProdPrice());
			}
		});
		return products;
	}
	int prodSize() {
		return products.size();
	}
	public static void main(String args[]) {	
		System.out.println("\t\t - Before Sorting -\n" + new ProductList().getProducts() + "\n");
		System.out.println("\t\t - After Sorting -\n" + new ProductList().getProductsSort());
	}
}
