package queryList;

public interface QueryInterface
{
	void init(Object[] arr);

	void add(Object o);

	void del();

	int size();

	void clear();

	Object[] toArray();

}
