package cn.edu.fjnu.cse.lab107;

/**
 * @author cxs
 * @version 1.0
 * 这个类用来储存留言
 */
public class Chat extends Thing {

	/**
	 * @param Id 留言的标识
	 * @param author 留言的作者
	 * @param time 留言的时间 
	 * @param content 留言的正文
	 */
	public Chat(int Id, String author, long time, String content) {
		super(Id);
		this.author = author;
		this.time = time;
		this.content = content;
	}
	
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}


	private String author;
	private long time;
	private String content;
}
