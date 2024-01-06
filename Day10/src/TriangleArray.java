
public class TriangleArray{
		public static void main(String[] args) {
			Triangle[] triangles = new Triangle[3];
			
			for (int i =0; i < triangles.length; i++) {
				triangles[i] = new Triangle();
				
			}
			triangles[0].setBase(5.0);
			triangles[0].setHeight(6.0);
			
			triangles[1].setBase(7.0);
			triangles[1].setHeight(6.8);
			
			triangles[2].setBase(5.9);
			triangles[2].setHeight(5.5);
			
			for(int i = 0; i< triangles.length; i++) {
				double area =triangles[i].calculateArea();
				System.out.println("Triangle " + (i + 1) + "Area: " + area);
			}
		}
}
