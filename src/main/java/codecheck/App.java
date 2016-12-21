package codecheck;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			System.out.println(args[i]);
          
          List<Integer> numbers = new ArrayList<Integer>();
          
          numbers.addAll(Arrays.asList(args[i].toCharArray()));
          
          System.out.println(numbers.size());
          
          
		}
	}
}
