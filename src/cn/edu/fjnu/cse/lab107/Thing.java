package cn.edu.fjnu.cse.lab107;

/**
 * @author cxs
 * @version 1.0
 */
public class Thing {
	
	
	/**
	 * @param Id 标识
	 */
	public Thing(int Id){
		this.Id = Id;
	}
	public int getId() {
		return Id;
	}

	/**
	 * 设置Id
	 */
	public void setID(int id) {
		Id = id;
	}

	/**
	 * 得到Id
	 */
	private int Id;
}
