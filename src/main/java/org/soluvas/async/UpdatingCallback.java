package org.soluvas.async;

/**
 * Supports both error and progress.
 * @author ceefour
 */
public interface UpdatingCallback<T> extends FailingCallback<T>,
		ProgressCallback<T> {

}
