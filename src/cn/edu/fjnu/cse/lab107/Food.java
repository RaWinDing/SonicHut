package cn.edu.fjnu.cse.lab107;

/**
 * @author cxs
 * @version 1.0
 * 这个类用来储存各种菜
 */
public class Food extends Thing {

	/**
	 * @param Id 菜种类的Id
	 * @param amount 点菜的数量 
	 * @param name 菜的名称
	 * @param price 菜的价格
	 * @param vIPPrice VIP的价格
	 * @param description 描述
	 * @param picture 图片的地址
	 * @param evaluation 评价
	 */
	public Food(int Id, int amount, String name, double price, double vIPPrice,
			String description, String picture, String evaluation) {
		super(Id);
		this.amount = amount;
		this.name = name;
		Price = price;
		VIPPrice = vIPPrice;
		this.description = description;
		this.picture = picture;
		this.evaluation = evaluation;
	}
	
	
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public double getVIPPrice() {
		return VIPPrice;
	}
	public void setVIPPrice(double vIPPrice) {
		VIPPrice = vIPPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}



	private int amount;
	private String name;
	private double Price;
   private double VIPPrice;
   private String description;
   private String picture;
   private String evaluation;

}
