package edu.wpi.cs3733.entity;

import javafx.scene.control.TextArea;

/**
 * Elbonian cipher; you must implement the cipher and the observer pattern
 */
public class ElbonianCipher implements Observer {

	private String cypherText = "";
	private TextArea label;

	public void setText(String text){
		if (text.length() > 140){
			text = text.substring(0, 140);
		}
		char[] charString = text.toCharArray();
		String elbonianCypher = "";
		int i = 0;
		while(i < charString.length){
			elbonianCypher += toElbonian(charString[i]);
			i ++;
		}
		this.cypherText = elbonianCypher;
	}

	public String toElbonian(char c){
		String returnMe = "";
		switch (c) {
			case ('a'):
			case ('A'):
				returnMe = "01";
				break;
			case ('b'):
			case ('B'):
				returnMe = "02";
				break;
			case ('c'):
			case ('C'):
				returnMe = "03";
				break;
			case ('d'):
			case ('D'):
				returnMe = "04";
				break;
			case ('e'):
			case ('E'):
				returnMe = "05";
				break;
			case ('f'):
			case ('F'):
				returnMe = "06";
				break;
			case ('g'):
			case ('G'):
				returnMe = "07";
				break;
			case ('h'):
			case ('H'):
				returnMe = "08";
				break;
			case ('i'):
			case ('I'):
				returnMe = "09";
				break;
			case ('j'):
			case ('J'):
				returnMe = "10";
				break;
			case ('k'):
			case ('K'):
				returnMe = "11";
				break;
			case ('l'):
			case ('L'):
				returnMe = "12";
				break;
			case ('m'):
			case ('M'):
				returnMe = "13";
				break;
			case ('n'):
			case ('N'):
				returnMe = "14";
				break;
			case ('o'):
			case ('O'):
				returnMe = "15";
				break;
			case ('p'):
			case ('P'):
				returnMe = "16";
				break;
			case ('q'):
			case ('Q'):
				returnMe = "17";
				break;
			case ('r'):
			case ('R'):
				returnMe = "18";
				break;
			case ('s'):
			case ('S'):
				returnMe = "19";
				break;
			case ('t'):
			case ('T'):
				returnMe = "20";
				break;
			case ('u'):
			case ('U'):
				returnMe = "21";
				break;
			case ('v'):
			case ('V'):
				returnMe = "22";
				break;
			case ('w'):
			case ('W'):
				returnMe = "23";
				break;
			case ('x'):
			case ('X'):
				returnMe = "24";
				break;
			case ('y'):
			case ('Y'):
				returnMe = "25";
				break;
			case ('z'):
			case ('Z'):
				returnMe = "26";
				break;
			case ('1'):
				returnMe = "a";
				break;
			case ('2'):
				returnMe = "b";
				break;
			case ('3'):
				returnMe = "c";
				break;
			case ('4'):
				returnMe = "d";
				break;
			case ('5'):
				returnMe = "e";
				break;
			case ('6'):
				returnMe = "f";
				break;
			case ('7'):
				returnMe = "g";
				break;
			case ('8'):
				returnMe = "h";
				break;
			case ('9'):
				returnMe = "i";
				break;
			case ('0'):
				returnMe = "_";
				break;
			case (' '):
				returnMe = "S";
				break;
			case ('!'):
				returnMe = "!";
				break;
			case ('.'):
				returnMe = ".";
				break;
			case (','):
				returnMe = ",";
				break;
			case ('?'):
				returnMe = "?";
				break;
			default:
				returnMe = "";
				break;
		}
		return returnMe;
	}

	public ElbonianCipher(TextArea label){
		this.label = label;
	}

	public ElbonianCipher(){

	}

	public String getText(){
		return cypherText;
	}

	@Override
	public void notify(Object object){
		String objectString = (String) object;
		setText(objectString);
		label.setText(cypherText);
	}
}
