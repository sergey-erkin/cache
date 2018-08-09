package serkin.cache;

import java.util.function.Supplier;

/**
 * Cache of T objects
 */
public interface Cache<T>
{
  /**
   * Return cached object by the key
   * If cache has an object at the key return the object
   * If cache has no object at the key:
   * + run supplier,
   * + put supplier result to cache at the key
   * + return supplier result
   * If supplier failed with exception, rethrow the exception
   * @param key - the key (cannot be blank)
   * @param supplier - the supplier for no-cached variant
   * @return an object from cache or from supplier (never null)
   */
  T get(String key, Supplier<T> supplier);
}
