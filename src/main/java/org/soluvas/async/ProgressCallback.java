package org.soluvas.async;

/**
 * Progress callback.
 * @author ceefour
 *
 * @param <T>
 */
public interface ProgressCallback<T> {

	void progress(T data);
	
}
