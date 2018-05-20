

public class TeaRunner {
public static void main(String[] args) {
	TeaBag tb = new TeaBag("Green");
	Kettle kettle = new Kettle();
	kettle.getWater();
	kettle.boil();
	Cup cup = new Cup();
	cup.makeTea(tb, kettle.getWater());
}
}
