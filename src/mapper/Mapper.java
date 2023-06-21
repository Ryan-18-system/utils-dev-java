package mapper;

public interface Mapper<T,U> {
    U map(T entidade);
}
