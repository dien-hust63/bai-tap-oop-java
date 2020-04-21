package triangle;

public class Triangle {
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		v1.setXY(x1, y1);
		v2.setXY(x2, x2);
		v3.setXY(x3, y3);
	}
	public Triangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	public String toString() {
		return "MyTriangle[v1=" + v1.toString() + ",v2=" +v2.toString()+ ",v3="+v3.toString();
	}
	public double getPerimeter() {
		return v1.distance(v2) + v2.distance(v3)+ v3.distance(v1);
	}
	public String getType() {
		if(v1.distance(v2) == 0 || v2.distance(v3) == 0 || v3.distance(v1) == 0) {
			return "not a triangle";
		}
		if(v1.distance(v2) == v2.distance(v3) && v1.distance(v2)  == v3.distance(v1) && v2.distance(v3) == v3.distance(v1) )
			return "tam giac deu";
		else {
			if(v1.distance(v2) == v2.distance(v3) || v1.distance(v2)  == v3.distance(v1) || v2.distance(v3) == v3.distance(v1))
			 return "tam giac can";
			 else return "tam giac ko can, ko deu";		 
			
		}
		
	}
}
