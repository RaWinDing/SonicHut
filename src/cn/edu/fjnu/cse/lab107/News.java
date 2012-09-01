package cn.edu.fjnu.cse.lab107;

/**
 * @author cxs
 * @version 1.0
 * 这个类用来储存资讯
 */
public class News extends Thing {
	
	/**
	 * @param Id 资讯的标识
	 * @param startTime 开始时间 
	 * @param endTime 结束时间 
	 * @param picture 图片 
	 * @param title 标题
	 * @param content 正文
	 */
	public News(int Id, long startTime, long endTime, String picture,
			String title, String content) {
		super(Id);
		this.startTime = startTime;
		this.endTime = endTime;
		this.picture = picture;
		this.title = title;
		this.content = content;
	}
	
	
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}


	private long startTime;
	private long endTime;
	private String picture;
	private String title;
	private String content;
}
