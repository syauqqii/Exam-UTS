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
    
    public static int enc(char character, int index){
        int result = index + (index*index);
        
        if(character == 'A'){
            result += 65;
        } else if(character == 'I'){
            result += 73;
        } else if(character == 'U'){
            result += 85;
        } else if(character == 'E'){
            result += 69;
        } else if(character == 'O'){
            result += 79;
        } else if(character == 'a'){
            result += 97;
        } else if(character == 'i'){
            result += 105;
        } else if(character == 'u'){
            result += 117;
        } else if(character == 'e'){
            result += 101;
        } else if(character == 'o'){
            result += 111;
        }
        
        return result;
    }

	public static void main(String[] args) {
	    System.out.print("\n > How many Paragraph? ");
		int totalText = input.nextInt();
		input.nextLine();
		
		// 2D array -> word[A][B
		// A = banyak paragraf yang di input user
		// B = index 0 untuk menampung kata2 user dari paragraf
		String[][] word = new String[totalText][1];
		
		System.out.println("");
		
		for(int i=0; i<totalText; i++){
		    System.out.print(" > Input Paragraph-"+(i+1)+": ");
		    word[i][0] = input.nextLine();
		}
		
		// Proses hapus spasi anomali => (" Example") to ("Example")
		for(int i=0; i<totalText; i++){
		    word[i][0] = word[i][0].trim();
		}
		
		System.out.println("");
		
		int temp  = 0;
        int count = 1;
        
        // Proses enkripsi dan menampilkan hasil
		for(int i=0; i<totalText; i++){
		    count = 1;
		    System.out.print(" > Result-"+(i+1)+": ");
		    for(int j=0; j<word[i][0].length(); j++){
		        if(word[i][0].charAt(j) == ' '){
    		        count++;
    		    }
    		    if(isVocal(Character.toLowerCase(word[i][0].charAt(j)))){
    		        temp = enc(word[i][0].charAt(j), count);
    		        System.out.print(temp);
    		    } else{
    		        System.out.print(word[i][0].charAt(j));
    		    }
		    }
		    System.out.println("");
		}
	}
}
