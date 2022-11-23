import java.util.Scanner;

public class Main{
    public static Scanner input = new Scanner(System.in);
    
    public static boolean isVocal(char character){
        if(character == 'a' || character == 'i' || character == 'u' || character == 'e' || character == 'o'){
            return true;   
        } else{
            return false;
        }
    }
    
    public static void enc(char character, int index){
        if(character == 'A'){
            System.out.print((index + (index*index) + 65));
        } else if(character == 'I'){
            System.out.print((index + (index*index) + 73));
        } else if(character == 'U'){
            System.out.print((index + (index*index) + 85));
        } else if(character == 'E'){
            System.out.print((index + (index*index) + 69));
        } else if(character == 'O'){
            System.out.print((index + (index*index) + 79));
        } else if(character == 'a'){
            System.out.print((index + (index*index) + 97));
        } else if(character == 'i'){
            System.out.print((index + (index*index) + 105));
        } else if(character == 'u'){
            System.out.print((index + (index*index) + 117));
        } else if(character == 'e'){
            System.out.print((index + (index*index) + 101));
        } else if(character == 'o'){
            System.out.print((index + (index*index) + 111));
        }
    }

	public static void main(String[] args) {
		String word = new String();
		word = input.nextLine();

		int count = 1;
		for(int i=0; i<word.length(); i++){
		    if(word.charAt(i) == ' '){
		        count++;
		    }
		    if(isVocal(Character.toLowerCase(word.charAt(i)))){
		        enc(word.charAt(i), count);
		    } else{
		        System.out.print(word.charAt(i));
		    }
		}
	}
}
