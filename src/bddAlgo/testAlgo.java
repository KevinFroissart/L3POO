package bddAlgo;

import java.util.ArrayList;

public class testAlgo {

	public static void main(String[] args) {
		
		ArrayList<DF> DF = new ArrayList<DF>();
		DF.add(new DF("A", "B"));
		DF.add(new DF("A", "C"));
		DF.add(new DF("A", "D"));
		DF.add(new DF("CD", "E"));
		DF.add(new DF("BE", "F"));
		DF.add(new DF("ABE", "G"));
		DF.add(new DF("EG", "ABD"));
		DF.add(new DF("FG", "AE"));
		DF.add(new DF("AB", "B"));
		DF.add(new DF("A", "E"));
		
		ArrayList<DF> DF2 = new ArrayList<DF>();
		DF2.add(new DF("A", "B"));
		DF2.add(new DF("A", "C"));
		DF2.add(new DF("D", "E"));
		DF2.add(new DF("C", "D"));
		DF2.add(new DF("B", "C"));
		DF2.add(new DF("BC", "A"));
		
		ArrayList<DF> DF3 = new ArrayList<DF>();
		DF3.add(new DF("A", "B"));
		DF3.add(new DF("A", "C"));
		DF3.add(new DF("A", "D"));
		DF3.add(new DF("CD", "E"));
		DF3.add(new DF("BE", "F"));
		DF3.add(new DF("D", "F"));
		DF3.add(new DF("F", "G"));
		DF3.add(new DF("G", "C"));
		

		ArrayList<DF> DF4 = new ArrayList<DF>();
		DF4.add(new DF("AB", "C"));
		DF4.add(new DF("C", "A"));
		DF4.add(new DF("BC", "D"));
		DF4.add(new DF("ACD", "B"));
		DF4.add(new DF("D", "EF"));
		DF4.add(new DF("ABE", "C"));
		DF4.add(new DF("CF", "BD"));
		DF4.add(new DF("CE", "AF"));
				
		Schema R = new Schema("ABCDEFG");

		
		/*for(DF df : DF ) {
			System.out.println(df.toString());
		}*/
		
		//Algo1 a1 = new Algo1(DF, R);
		//System.out.println(a1.calcul(false));
		
		
		Algo2 a2 = new Algo2(DF);
		a2.calcul();
		System.out.println(a2.toString());
	}
	
}

