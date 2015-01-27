package simbolString;

/*Вывести в одну строку символы:
 английского алфавита от ‘A’ до ‘Z’
 английского алфавита от ‘z’ до ‘a’
 русского алфавита от ‘а’ до ‘я’
 цифры от ‘0’ до ‘9’
 печатного диапазона таблицы ASCII
 */

public class OneStringSimbol
{
	void az(char first, char last)
	{
		while (first <= last)
		{
			System.out.print((char) first);
			first++;
		}
		System.out.println();
	}

	void az(int first, int last)
	{
		char a = (char) first;
		char b = (char) last;
		az(a, b);
	}
}
