package com.fyni.event;

import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;

//event_ID          INT          NOT NULL, -- �̺�Ʈ���̵�
//event_Title       VARCHAR(50)  NOT NULL, -- ����
//event_Content     VARCHAR(600) NULL,     -- ����
//event_Up          NUMERIC      NULL,     -- ��õ
//event_Down        NUMERIC      NULL,     -- ����õ
//event_When        DATETIME     NULL,     -- �Ⱓ
//event_WrittenWhen TIMESTAMP    NULL,     -- �ۼ��ð�
//event_Picture     MEDIUMBLOB   NULL,     -- ����
//category_ID       NUMERIC      NOT NULL, -- ī�װ����̵�
//location_ID       INT          NOT NULL, -- ��ġ���̵�
//user_ID           VARCHAR(255) NOT NULL  -- �������̵�
//event_Hit			INT			 NOT NULL, -- ��ȸ��
public class EventDTO {
	private int event_ID;
	private String event_Title;
	private String event_Content;
	private int event_Up;
	private int event_Down;
	private Date event_When;
	private Timestamp event_WrittenWhen;
	private Blob event_Picture;
	private int category_ID;
	private int location_ID;
	private String user_ID;
	private int event_Hit;

	public int getEvent_ID() {
		return event_ID;
	}

	public void setEvent_ID(int event_ID) {
		this.event_ID = event_ID;
	}

	public String getEvent_Title() {
		return event_Title;
	}

	public void setEvent_Title(String event_Title) {
		this.event_Title = event_Title;
	}

	public String getEvent_Content() {
		return event_Content;
	}

	public void setEvent_Content(String event_Content) {
		this.event_Content = event_Content;
	}

	public int getEvent_Up() {
		return event_Up;
	}

	public void setEvent_Up(int event_Up) {
		this.event_Up = event_Up;
	}

	public int getEvent_Down() {
		return event_Down;
	}

	public void setEvent_Down(int event_Down) {
		this.event_Down = event_Down;
	}

	public Date getEvent_When() {
		return event_When;
	}

	public void setEvent_When(Date event_When) {
		this.event_When = event_When;
	}

	public Timestamp getEvent_WrittenWhen() {
		return event_WrittenWhen;
	}

	public void setEvent_WrittenWhen(Timestamp event_WrittenWhen) {
		this.event_WrittenWhen = event_WrittenWhen;
	}

	public Blob getEvent_Picture() {
		return event_Picture;
	}

	public void setEvent_Picture(Blob event_Picture) {
		this.event_Picture = event_Picture;
	}

	public int getCategory_ID() {
		return category_ID;
	}

	public void setCategory_ID(int category_ID) {
		this.category_ID = category_ID;
	}

	public int getLocation_ID() {
		return location_ID;
	}

	public void setLocation_ID(int location_ID) {
		this.location_ID = location_ID;
	}

	public String getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(String user_ID) {
		this.user_ID = user_ID;
	}

	public EventDTO() {
		super();
	}

	public EventDTO(int event_ID, String event_Title, String event_Content, int event_Up, int event_Down,
			Date event_When, Timestamp event_WrittenWhen, Blob event_Picture, int category_ID, int location_ID,
			String user_ID, int event_Hit) {
		super();
		this.event_ID = event_ID;
		this.event_Title = event_Title;
		this.event_Content = event_Content;
		this.event_Up = event_Up;
		this.event_Down = event_Down;
		this.event_When = event_When;
		this.event_WrittenWhen = event_WrittenWhen;
		this.event_Picture = event_Picture;
		this.category_ID = category_ID;
		this.location_ID = location_ID;
		this.user_ID = user_ID;
		this.event_Hit = event_Hit;
	}

	public int getEvent_Hit() {
		return event_Hit;
	}

	public void setEvent_Hit(int event_Hit) {
		this.event_Hit = event_Hit;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EventDTO [event_ID=").append(event_ID).append(", event_Title=").append(event_Title)
				.append(", event_Content=").append(event_Content).append(", event_Up=").append(event_Up)
				.append(", event_Down=").append(event_Down).append(", event_When=").append(event_When)
				.append(", event_WrittenWhen=").append(event_WrittenWhen).append(", event_Picture=")
				.append(event_Picture).append(", category_ID=").append(category_ID).append(", location_ID=")
				.append(location_ID).append(", user_ID=").append(user_ID).append(", event_Hit=").append(event_Hit)
				.append("]");
		return builder.toString();
	}


}
