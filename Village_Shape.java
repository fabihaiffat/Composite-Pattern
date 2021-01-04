public class Village_Shape {
	public static void main(String[] args)
	{
        Composite village = new Composite("village");
		Composite house = new Composite("house");
		Composite tree = new Composite("tree");
		Composite water_Source = new Composite("water_Source");
	    Shape line = new LeafNode("line");
		Shape square = new LeafNode("square");
		Shape rectangle = new LeafNode("rectangle");
		Shape triangle = new LeafNode("triangle");
		Shape circle = new LeafNode("circle");
		Shape bubble=new LeafNode("bubble");
        //Adding Shape to the house
		house.addShape(line);
		house.addShape(rectangle);
		house.addShape(triangle);
		//Adding Shape to the tree
		tree.addShape(square);
		tree.addShape(bubble);
		tree.addShape(circle);
        //Adding shape to the water_Source
		water_Source.addShape(circle);
		water_Source.addShape(rectangle);

		village.addShape(house);
		village.addShape(tree);
		village.addShape(water_Source);
		water_Source.showShapeType();
		square.showShapeType();

	}

}
