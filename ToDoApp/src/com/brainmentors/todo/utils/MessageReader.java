package com.brainmentors.todo.utils;

import java.util.ResourceBundle;

public interface MessageReader {
	
	ResourceBundle rb = ResourceBundle.getBundle(Constants.MESSAGE_BUNDLE_NAME);
	public static String getValue(String key) {
		return rb.getString(key);
	}

}
