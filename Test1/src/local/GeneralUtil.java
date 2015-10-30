package local;

public class GeneralUtil {

	public boolean checkDigit(String str){
		char[] charArray = str.toCharArray();
		for(int i = 0; i < charArray.length; i++){
			if(Character.isDigit(charArray[i])) return true;
		}
		return false;
	}
	
	public boolean checkDb(String str){
		if(str.length() != 0 && str.equalsIgnoreCase("Db")) return true;
		return false;
	}
}
