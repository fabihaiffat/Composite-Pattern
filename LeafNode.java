public class LeafNode implements Shapes {
	String name;	
	public Leaf(String name) {
		super();
		this.name = name;
	}

	public void showShapeType() {
		System.out.println(name);
	}

}