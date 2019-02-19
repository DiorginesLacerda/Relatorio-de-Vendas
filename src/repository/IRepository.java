package repository;

public interface IRepository<T> {

	public void save(T t)throws Exception;
	public T getValueObject(String[] input)throws Exception;
}
