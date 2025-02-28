public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static Boolean isPalindrome(String word) {
		word = word.replaceAll(" ", "").toLowerCase();
		String[] wordArr = word.split("");

		for (int i = 0; i < wordArr.length; i++) {
			if (!wordArr[i].equals(wordArr[wordArr.length - i - 1])) {
				return false; 
			}
		}
		return true;
	}

	public static int getAge(String[] names, int[] ages, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return ages[i]; 
            }
        }
        return -1;
    }

	public static int countWords(String word, char character) {
		String[] wordArray = word.split(" ");
		int count = 0;

		for (int i = 0; i < wordArray.length; i++) {
			if (wordArray[i].indexOf(character) != -1) {
				count++;
			}
		}
		return count;
	}
}


