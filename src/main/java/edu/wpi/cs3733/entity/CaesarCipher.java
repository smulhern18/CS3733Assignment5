package edu.wpi.cs3733.entity;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TextArea;

/**
 * Caesar cipher; you must implement the cipher and the observer pattern
 */
public class CaesarCipher implements Observer {

	private String string ="";
	private TextArea label;


	public void setText(String text){
		String incoding ="";
		boolean isNum =false;
		char[] toCipher;
		if(text.length() > 140) {
			toCipher= text.substring(0, 140).toCharArray();
		}else  toCipher = text.toCharArray();

		for(char t: toCipher){
			if(Character.isDigit(t)){
				isNum = true;
			}
		}
		if(isNum){
			setString("");
		}else {
			incoding = caesarCip(toCipher);
			setString(incoding);
		}
		}

	public String caesarCip(char[] string) {
		boolean isIncorrect = false;
		String incoding = "";
		for (char t : string) {
			switch (t) {
				case ('a'):
					incoding += "z";
					break;
				case ('b'):
					incoding += "y";
					break;
				case ('c'):
					incoding += "x";
					break;
				case ('d'):
					incoding += "w";
					break;
				case ('e'):
					incoding += "v";
					break;
				case ('f'):
					incoding += "u";
					break;
				case ('g'):
					incoding += "t";
					break;
				case ('h'):
					incoding += "s";
					break;
				case ('i'):
					incoding += "r";
					break;
				case ('j'):
					incoding += "q";
					break;
				case ('k'):
					incoding += "p";
					break;
				case ('l'):
					incoding += "o";
					break;
				case ('m'):
					incoding += "n";
					break;
				case ('n'):
					incoding += "m";
					break;
				case ('o'):
					incoding += "l";
					break;
				case ('p'):
					incoding += "k";
					break;
				case ('q'):
					incoding += "j";
					break;
				case ('r'):
					incoding += "i";
					break;
				case ('s'):
					incoding += "h";
					break;
				case ('t'):
					incoding += "g";
					break;
				case ('u'):
					incoding += "f";
					break;
				case ('v'):
					incoding += "e";
					break;
				case ('w'):
					incoding += "d";
					break;
				case ('x'):
					incoding += "c";
					break;
				case ('y'):
					incoding += "b";
					break;
				case ('z'):
					incoding += "a";
					break;
				case ('A'):
					incoding += "Z";
					break;
				case ('B'):
					incoding += "Y";
					break;
				case ('C'):
					incoding += "X";
					break;
				case ('D'):
					incoding += "W";
					break;
				case ('E'):
					incoding += "V";
					break;
				case ('F'):
					incoding += "U";
					break;
				case ('G'):
					incoding += "T";
					break;
				case ('H'):
					incoding += "S";
					break;
				case ('I'):
					incoding += "R";
					break;
				case ('J'):
					incoding += "Q";
					break;
				case ('K'):
					incoding += "P";
					break;
				case ('L'):
					incoding += "O";
					break;
				case ('M'):
					incoding += "N";
					break;
				case ('N'):
					incoding += "M";
					break;
				case ('O'):
					incoding += "L";
					break;
				case ('P'):
					incoding += "K";
					break;
				case ('Q'):
					incoding += "J";
					break;
				case ('R'):
					incoding += "I";
					break;
				case ('S'):
					incoding += "H";
					break;
				case ('T'):
					incoding += "G";
					break;
				case ('U'):
					incoding += "F";
					break;
				case ('V'):
					incoding += "E";
					break;
				case ('W'):
					incoding += "D";
					break;
				case ('X'):
					incoding += "C";
					break;
				case ('Y'):
					incoding += "B";
					break;
				case ('Z'):
					incoding += "A";
					break;
				case('.'):
					incoding += ".";
					break;
				case(','):
					incoding += ",";
					break;
				case('?'):
					incoding += "?";
					break;
				case('!'):
					incoding += "!";
					break;
				case(' '):
					incoding += " ";
					break;
				default:
					isIncorrect = true;
					break;
			}
		}
		if(isIncorrect){
			return "";
		}else {
			return incoding;
		}
	}
	public CaesarCipher(TextArea label){
		this.label = label;
	}

	public CaesarCipher(){}


	public void setString(String string){
		this.string = string;
	}
	public String getText(){
		return this.string;
	}

	@Override
	public void notify(Object object){
		String objectString = (String) object;
		setText(objectString);
		label.setText(string);
	}
}
