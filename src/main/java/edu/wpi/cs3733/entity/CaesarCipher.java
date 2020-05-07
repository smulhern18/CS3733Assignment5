package edu.wpi.cs3733.entity;

/**
 * Caesar cipher; you must implement the cipher and the observer pattern
 */
public class CaesarCipher implements Observer {

	private String string ="";


	public void setText(String text){
	String incoding ="";
	char[] toCipher = text.substring(0,140).toCharArray();

	for(char t: toCipher){
		switch(t) {
			case ('a'):
				incoding +="z";
				break;
			case ('b'):
				incoding +="y";
				break;
			case ('c'):
				incoding +="x";
				break;
			case ('d'):
				incoding +="w";
				break;
			case ('e'):
				incoding +="v";
				break;
			case ('f'):
				incoding +="u";
				break;
			case ('g'):
				incoding +="t";
				break;
			case ('h'):
				incoding +="s";
				break;
			case ('i'):
				incoding +="r";
				break;
			case ('j'):
				incoding +="q";
				break;
			case ('k'):
				incoding +="p";
				break;
			case ('l'):
				incoding +="o";
				break;
			case ('m'):
				incoding +="n";
				break;
			case ('n'):
				incoding +="m";
				break;
			case ('o'):
				incoding +="l";
				break;
			case ('p'):
				incoding +="k";
				break;
			case ('q'):
				incoding +="j";
				break;
			case ('r'):
				incoding +="i";
				break;
			case ('s'):
				incoding +="h";
				break;
			case ('t'):
				incoding +="g";
				break;
			case ('u'):
				incoding +="f";
				break;
			case ('v'):
				incoding +="e";
				break;
			case ('w'):
				incoding +="d";
				break;
			case ('x'):
				incoding +="c";
				break;
			case ('y'):
				incoding +="b";
				break;
			case ('z'):
				incoding +="a";
				break;
			case ('A'):
				incoding +="Z";
				break;
			case ('B'):
				incoding +="Y";
				break;
			case ('C'):
				incoding +="X";
				break;
			case ('D'):
				incoding +="W";
				break;
			case ('E'):
				incoding +="V";
				break;
			case ('F'):
				incoding +="U";
				break;
			case ('G'):
				incoding +="T";
				break;
			case ('H'):
				incoding +="S";
				break;
			case ('I'):
				incoding +="R";
				break;
			case ('J'):
				incoding +="Q";
				break;
			case ('K'):
				incoding +="P";
				break;
			case ('L'):
				incoding +="O";
				break;
			case ('M'):
				incoding +="N";
				break;
			case ('N'):
				incoding +="M";
				break;
			case ('O'):
				incoding +="L";
				break;
			case ('P'):
				incoding +="K";
				break;
			case ('Q'):
				incoding +="J";
				break;
			case ('R'):
				incoding +="I";
				break;
			case ('S'):
				incoding +="H";
				break;
			case ('T'):
				incoding +="G";
				break;
			case ('U'):
				incoding +="F";
				break;
			case ('V'):
				incoding +="E";
				break;
			case ('W'):
				incoding +="D";
				break;
			case ('X'):
				incoding +="C";
				break;
			case ('Y'):
				incoding +="B";
				break;
			case ('Z'):
				incoding +="A";
				break;
			default:
				incoding+=t;
				break;
		}
 setString(incoding);
	}
	}

	public void setString(String string){
		this.string = string;
	}
	public String getText(){
		return this.string;
	}

	@Override
	public void notify(Object object){

	}

}
