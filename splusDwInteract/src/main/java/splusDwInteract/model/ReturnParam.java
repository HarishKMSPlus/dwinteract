package splusDwInteract.model;

public class ReturnParam {
	
	String storeId;
	String productId;
    int storeInventory;
    int quantity;
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getStoreInventory() {
		return storeInventory;
	}
	public void setStoreInventory(int storeInventory) {
		this.storeInventory = storeInventory;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ReturnParam [storeId=" + storeId + ", productId=" + productId + ", storeInventory=" + storeInventory
				+ ", quantity=" + quantity + "]";
	}
    
    
    
    
}
