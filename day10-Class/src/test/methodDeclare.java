package test;

public class methodDeclare {
	
	public void convertStringToCharArray(String input){
		int len = input.length();
		char[] letters = new char[len];
		
		for(int count = 0; count < letters.length; count++){
			letters[count] = input.charAt(count);
		}
			
		for(int cnt : letters){
			System.out.printf("%c",cnt);
		}
	}
	
	public char[] sortLetters(String input){
		int len = input.length();
		char[] letters = new char[len];
		char temp = 0;
		
		for(int count = 0; count < letters.length; count++){
			letters[count] = input.charAt(count);
		}
		
		for(int count = 0; count < letters.length; count++){
			for(int cnt = count+1; cnt < letters.length; cnt++){
				if(letters[count]<letters[cnt]) {
				temp = letters[count];
				letters[count] = letters[cnt];
				letters[cnt] = temp;
				}
			}
			
		}
		for(int cnt : letters){
			System.out.printf("%c",cnt);
		}
		
		return letters;
	}

}
