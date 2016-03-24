import java.awt.Color;
import java.util.Random;

public class Square extends Shape {
	
	private int shapeWidth;
	
	public Square(int shapeWidth){
		this.shapeWidth = shapeWidth;
	}
	
	
	@Override
	public Color getRandomColor() {		
		Random random = new Random();
		float r, g, b;
		r = random.nextFloat();
		g = random.nextFloat();
		b = random.nextFloat();
		return new Color(r, g, b);
	}
	
	@Override
	public int getShapeWidth(){
		return this.shapeWidth;
	}
	
	@Override
	public int getShapeHeight(){
		return this.shapeWidth;
	}


	@Override
	public int getCenterX(int mouseX) {
		return mouseX - this.shapeWidth/2;
	}


	@Override
	public int getCenterY(int mouseY) {
		return mouseY - this.shapeWidth/2;
	}


}