//----------------------------------------------------------
//Author    : THAI OPEN CODE
//Author URI: https://www.thaiopencode.com
//Facebook  : https://www.facebook.com/ThaiOpenCode
//----------------------------------------------------------

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDoubleLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		
		int i = 1;
		while(i <= 5)
		{
			System.out.printf("¡ÃØ³Ò¡ÃÍ¡µÑÇàÅ¢ ¤ÃÑé§·Õè %d : ", i);
			list.add(scan.nextDouble());
			i++;
		}
		scan.close();
		
		Double sum = list.stream().mapToDouble(Double::doubleValue).sum();
			
	}
}
 
