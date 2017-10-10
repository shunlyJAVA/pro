package org.shunly;

public class Application {
	private int id;
	private String name;
	private int qq;
	private String position;
	private long time;
	private String college;
	private int onlineId;
	private String url;
	private String ambition;
	private String senior;
	private String info;
	
	public Application() {
		
	}
	
	/**
	 * 
	 * @param id 自动主键
	 * @param name 姓名
	 * @param qq QQ
	 * @param position 修真类型
	 * @param time 预计入学时间
	 * @param colllege 毕业院校
	 * @param url 日报链接
	 * @param ambition 立愿
	 * @param senior 辅导师兄
	 * @param info 从何处了解到修真院
	 */

	public Application(int id, String name, int qq, String position, long time, String college, int onlineId,
			String url, String ambition, String senior, String info) {
		super();
		this.id = id;
		this.name = name;
		this.qq = qq;
		this.position = position;
		this.time = time;
		this.college = college;
		this.onlineId = onlineId;
		this.url = url;
		this.ambition = ambition;
		this.senior = senior;
		this.info = info;
	}
	
	public Application( String name, int qq, String position, long time, String college, int onlineId,
			String url, String ambition, String senior, String info) {
		super();
		this.name = name;
		this.qq = qq;
		this.position = position;
		this.time = time;
		this.college = college;
		this.onlineId = onlineId;
		this.url = url;
		this.ambition = ambition;
		this.senior = senior;
		this.info = info;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQq() {
		return qq;
	}
	public void setQq(int qq) {
		this.qq = qq;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String colllege) {
		this.college = colllege;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getOnlineId() {
		return onlineId;
	}
	public void setOnlineId(int onlineId) {
		this.onlineId = onlineId;
	}
	public String getAmbition() {
		return ambition;
	}
	public void setAmbition(String ambition) {
		this.ambition = ambition;
	}
	public String getSenior() {
		return senior;
	}
	public void setSenior(String senior) {
		this.senior = senior;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "Application id=" + id + ", name=" + name + ", qq=" + qq + ", position=" + position + ", time=" + time
				+ ", college=" + college + ", onlineId=" + onlineId + ", url=" + url + ", ambition=" + ambition
				+ ", senior=" + senior + ", info=" + info + "\n";
	}
	
	
	
	
	
}
