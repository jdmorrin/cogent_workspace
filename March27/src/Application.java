import java.util.Random;

public class Application {
	// Convert all primitives into objects and vice-versa
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		int z = r.nextInt();
		float ff = r.nextFloat();
		double dd = r.nextDouble();
		char c = 'c';
		byte bb = 100;
		long ll = r.nextLong();
		short ss = 33;
		boolean boo = r.nextBoolean();
		
		System.out.println("\nInteger");
		System.out.println("Primitive value: " + z);
		Integer z2 = Integer.valueOf(z);
		System.out.println("Object value: " + z2);
		int z3 = z2.intValue();
		System.out.println("Primitive value again: " + z3);
		
		System.out.println("\nFloat");
		System.out.println("Primitive value: " + ff);
		Float f2 = Float.valueOf(z);
		System.out.println("Object value: " + f2);
		float f3 = f2.floatValue();
		System.out.println("Primitive value again: " + f3);
		
		System.out.println("\nDouble");
		System.out.println("Primitive value: " + dd);
		Double d2 = Double.valueOf(dd);
		System.out.println("Object value: " + z2);
		double d3 = d2.doubleValue();
		System.out.println("Primitive value again: " + d3);
		
		System.out.println("Primitive value: " + c);
		Character c2 = Character.valueOf(c);
		System.out.println("Object value: " + c2);
		char c3 = c2.charValue();
		System.out.println("Primitive value again: " + c3);
		
		System.out.println("Primitive value: " + bb);
		Byte b2 = Byte.valueOf(bb);
		System.out.println("Object value: " + b2);
		byte b3 = b2.byteValue();
		System.out.println("Primitive value again: " + b3);
		
		System.out.println("Primitive value: " + ll);
		Long l2 = Long.valueOf(z);
		System.out.println("Object value: " + l2);
		long l3 = l2.longValue();
		System.out.println("Primitive value again: " + l3);
		
		System.out.println("Primitive value: " + ss);
		Short s2 = Short.valueOf(ss);
		System.out.println("Object value: " + s2);
		short s3 = s2.shortValue();
		System.out.println("Primitive value again: " + s3);
		
		System.out.println("Primitive value: " + boo);
		Boolean boo2 = Boolean.valueOf(boo);
		System.out.println("Object value: " + boo2);
		boolean boo3 = boo2.booleanValue();
		System.out.println("Primitive value again: " + boo3);
		
	}

}
