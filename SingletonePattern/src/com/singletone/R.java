package com.singletone;

public class R implements Runnable {

	@Override
	public void run() {
		SingletoneClass.getInstance();
	}

}
