package cogent.jdmr;

import java.util.Random;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Rectangle[] shapes = new Rectangle[5];
		
		for(int i = 0; i<shapes.length; i++) {
			int x = r.nextInt(2);
			
			if(x == 0)
				shapes[i] = new Rectangle();
			else
				shapes[i] = new Rectangle(r.nextInt(20) + 1, r.nextInt(10) + 1);
			
		}
		
		for(int i = 0; i<shapes.length;i++) {
			System.out.println("Rectangle " + i + ": " + shapes[i] + "\n");
		}

	}

}
