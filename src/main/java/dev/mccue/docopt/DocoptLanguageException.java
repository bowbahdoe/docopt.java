package dev.mccue.docopt;

import java.io.Serial;

/**
 * Error in construction of usage-message by developer.
 */
final class DocoptLanguageException extends RuntimeException {

	@Serial
	private static final long serialVersionUID = 1L;

	public DocoptLanguageException(final String message) {
		super(message);
	}
}