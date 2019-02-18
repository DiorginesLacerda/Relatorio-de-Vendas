package repository;

public interface IRepository<T> {

	public void save(T t);
	public T getValueObject(String[] input);
}
