import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class test_≥≠¿Ô {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();
		int a, b;
		int count;
		int sum = 0;

		for(int i = 0; i < 9 ; i++) {
			list.add(scan.nextInt());
		}





		es : while(true) {

			for(int i =0; i < list.size(); i++) {
				sum += list.get(i);
			}

			int bba = sum - 100;

			for(int i = 0; i < list.size(); i++) {
				for(int j = i+1 ; j <list.size(); j++) {
					if(bba == list.get(i) + list.get(j)) {
						list.remove(i);
						list.remove(j-1);
						break es;
					}
				}
			}
			
		}

		Collections.sort(list);

		for(int i = 0; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}

	}

}
