package cn.edu.fjnu.cse.lab107;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author cxs
 * @version 1.0
 * 这个类用来储存订单
 */
public class Order extends Thing {

	
	/**
	 * @param Id 订单标识 
	 * @param time 订单时间 
	 * @param price 订单的总价格
	 * @param menu 点的菜的集合
	 * @param menuAndAmount  菜的名字 和 数量的 映射
	 * @param note 备注
	 * @param table 桌号
	 * @param status 订单状态 
	  * 常量 CHECKED 表示已经买单
	 *  常量 NOCHECK 表示待买单;
	 */
	public Order(int Id, long time, double price, ArrayList<String> menu,
			Map<String, Integer> menuAndAmount, String note, int table,
			int status) {
		super(Id);
		this.time = time;
		this.price = price;
		Menu = menu;
		MenuAndAmount = menuAndAmount;
		this.note = note;
		this.table = table;
		this.status = status;
	}
	
	
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ArrayList<String> getMenu() {
		return Menu;
	}
	public void setMenu(ArrayList<String> menu) {
		Menu = menu;
	}
	public Map<String, Integer> getMenuAndAmount() {
		return MenuAndAmount;
	}
	public void setMenuAndAmount(Map<String, Integer> menuAndAmount) {
		MenuAndAmount = menuAndAmount;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public int getTable() {
		return table;
	}
	public void setTable(int table) {
		this.table = table;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public static int getChecked() {
		return CHECKED;
	}
	public static int getNocheck() {
		return NOCHECK;
	}

	
	private long time;
	private double price;
	private ArrayList<String> Menu;
	private Map<String,Integer> MenuAndAmount;
	private String note;
	private int table;
	private int status;
	public final static int CHECKED = 1;
	public final static int NOCHECK = 0;
}
