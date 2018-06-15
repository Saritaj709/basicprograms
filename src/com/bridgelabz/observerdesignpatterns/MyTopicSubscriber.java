package com.bridgelabz.observerdesignpatterns;

public class MyTopicSubscriber implements Observer {
private String name;
private Subject topic;

public MyTopicSubscriber(String name1)
{
	this.name=name1;
}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		String msg=(String) topic.getUpdate((java.util.Observer) this);
		if(msg==null) {
			System.out.println(name+" :: No new messsage");
		}
		else {
			System.out.println(name+" :: Consuming message :: "+msg);
		}
	}

	@Override
	public void setSubject(Subject sub) {
		// TODO Auto-generated method stub
		this.topic=sub;
	}

}
