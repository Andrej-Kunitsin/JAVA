package stringFunc;

public class StringFunc {
	// 1.Дана строка, состоящая из слов, разделенных пробелами и знаками
	// препинания.
	// Определить длину самого короткого слова.
	public int serchMinWord(String string) {
		if (string == null) {
			throw new NullPointerException();
		}
		int shortWord = 0;
		string = string.trim();
		String[] stringArr = string.split("(\\,\\s|\\s)");
		shortWord = stringArr[0].length();
		for (int i = 1; i < stringArr.length; i++) {
			if (stringArr[i].length() < shortWord) {
				shortWord = stringArr[i].length();
			}
		}
		return shortWord;
	}

	// 2. Дан массив слов. Заменить последние три символа слов,
	// имеющих заданную длину на символ "$"
	String[] change3LastSimbol(String[] massString, int length) {
		if (massString == null) {
			throw new NullPointerException();
		}
		for (int i = 0; i < massString.length; i++) {
			if (massString[i].length() == length)
				massString[i] = massString[i].replaceAll("...$", "\\$");
		}
		return massString;
	}

	// 3. Добавить в строку пробелы после знаков препинания,
	// если они там отсутствуют.
	String insertSpace(String massString) {
		massString = massString.replaceAll(",(?!\\s)", ", ");
		return massString;
	}

	// 4. Оставить в строке только один экземпляр каждого встречающегося
	// символа.
	String oneSimbol(String string) {
		if (string == null) {
			throw new NullPointerException();
		}
		String ret = null;
		StringBuffer sb = new StringBuffer();
		char ch = ' ';
		while (!string.isEmpty()) {
			ch = string.charAt(0);
			sb.append(ch);
			string = string.replaceAll(ch + "+", "");
		}
		ret = sb.toString();
		return ret;
	}

	// 5. Подсчитать количество слов во введенной пользователем строке.
	int countNumWord(String string) {
		String[] massStrings = null;
		if (string == null) {
			throw new NullPointerException();
		} else if (string.length() == 0) {
			return 0;
		} else {
			massStrings = string.split("\\s|\\,\\s|\\,");
		}
		return massStrings.length;
	}

	// 6. Удалить из строки ее часть с заданной позиции и заданной длины.
	public String removePartsString(String string, int index, int length) {
		StringBuffer strBuff = new StringBuffer();
		if (string == null) {
			throw new NullPointerException();
		} else if ((index + length) > string.length()) {
			throw new IllegalArgumentException();
		} else {
			strBuff = new StringBuffer();
			strBuff = strBuff.append(string);
			strBuff.delete(index, index + length);
		}
		return strBuff.toString();
	}

	// 7. Перевернуть строку, т.е. последние символы должны стать первыми, а
	// первые последними.
	String reversString(String string) {
		StringBuffer strBuff = new StringBuffer();
		if (string == null) {
			throw new NullPointerException();
		}
		strBuff = strBuff.append(string);
		strBuff.reverse();
		return strBuff.toString();
	}

	// 8. В заданной строке удалить последнее слово
	String deleteLastWord(String string) {
		string = string.replaceAll("\\s[а-я]*$", "");
		return string.trim();
	}
}
