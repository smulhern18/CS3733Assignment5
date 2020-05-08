package edu.wpi.cs3733.entity;

import java.beans.PropertyChangeSupport;

/**
 * Message class to hold clear text; you must implement the rest of the class
 */
public class Message implements Observable {

	private String text;
	private CaesarCipher cc;
	private ElbonianCipher ec;

	public void setText(String text){
		String oldText = this.text;
		this.text = text;
		if (!text.equals(null)) {
			notifyObservers();
		}
	}

	public String getText(){
		return text;
	}

	@Override
	public void register(Observer o){
		if (o instanceof CaesarCipher){
			this.cc = (CaesarCipher) o;
		}
		if (o instanceof  ElbonianCipher){
			this.ec = (ElbonianCipher) o;
		}
	}

	@Override
	public void notifyObservers(){
		cc.notify(text);
		ec.notify(text);
	}
}
