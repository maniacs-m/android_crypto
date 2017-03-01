/*
 * =================================================================================================
 *                             Copyright (C) 2017 Universum Studios
 * =================================================================================================
 *         Licensed under the Apache License, Version 2.0 or later (further "License" only).
 * -------------------------------------------------------------------------------------------------
 * You may use this file only in compliance with the License. More details and copy of this License 
 * you may obtain at
 * 
 * 		http://www.apache.org/licenses/LICENSE-2.0
 * 
 * You can redistribute, modify or publish any part of the code written within this file but as it 
 * is described in the License, the software distributed under the License is distributed on an 
 * "AS IS" BASIS, WITHOUT WARRANTIES or CONDITIONS OF ANY KIND.
 * 
 * See the License for the specific language governing permissions and limitations under the License.
 * =================================================================================================
 */
package universum.studios.android.crypto;

import android.support.annotation.NonNull;

/**
 * An exception that may be thrown due to failed cryptographic operation.
 *
 * @author Martin Albedinsky
 */
public final class CryptographyException extends RuntimeException {

	/**
	 * Constants ===================================================================================
	 */

	/**
	 * Log TAG.
	 */
	// private static final String TAG = "CryptographyException";

	/**
	 * Interface ===================================================================================
	 */

	/**
	 * Static members ==============================================================================
	 */

	/**
	 * Members =====================================================================================
	 */

	/**
	 * Constructors ================================================================================
	 */

	/**
	 * Creates a new instance of CryptographyException with the specified <var>cause</var>.
	 *
	 * @param cause The cause due to which is the cryptography exception thrown.
	 * @see #CryptographyException(String, Throwable)
	 */
	public CryptographyException(@NonNull Throwable cause) {
		super(cause);
	}

	/**
	 * Creates a new instance of CryptographyException with the specified <var>name</var> and <var>cause</var>.
	 *
	 * @param name  The name for the new exception.
	 * @param cause The cause due to which is the cryptography exception thrown.
	 */
	public CryptographyException(@NonNull String name, @NonNull Throwable cause) {
		super(name, cause);
	}

	/**
	 * Methods =====================================================================================
	 */

	/**
	 * Inner classes ===============================================================================
	 */
}
