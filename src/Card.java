
public class Card {

//fields
	private int value;
	private String name;
	
//constructor
	public Card(int value, String name) {
	this.name = name;
	this.value = value;
	}//end constructor
	
//methods	
	public void describe() {
		System.out.print(" " + name + " [" + value + " pts]  ");
	}
	
//getters and setters	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int  getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}//end class

