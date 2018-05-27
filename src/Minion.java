
public class Minion {
String name;
int eyes;
String master; 
String color;

Minion(String name,int eyes,String color,String master){
	this.name=name;
	this.eyes=eyes;
	this.color=color;
	this.master=master;
}

public String getName() {
	return name;
}
public int getEyes() {
	return eyes;
}
public String getMaster() {
	return master;
}
public String getColor() {
	return color;
}

public void setName(String name) {
	this.name=name;
}

public void setEyes(int eyes) {
	this.eyes=eyes;
}

public void setMaster(String master) {
	this.master=master;
}

public void setColor(String color) {
	this.color=color;
}

}

