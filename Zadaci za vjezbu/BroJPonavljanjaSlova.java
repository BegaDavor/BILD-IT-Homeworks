package src;


public class BroJPonavljanjaSlova {
	public static int count(String str, char a){
		int counter = 0;
		for (int i = 0; i < str.length(); i++ ){
			if (str.charAt(i) == a){
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count("Welcome", 'e'));
		

	}

}
