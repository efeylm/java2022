package oop1;

//PascalCase classlarda PascalCase kullanılır
public class Product {

	private String name; // classın fieldlarıdırlar camelCase yazılır
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock;	//sağ click->source->generate getters and setter(select all)

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public void setDiscount(int discount) {
		this.discount=discount;
	}

}
