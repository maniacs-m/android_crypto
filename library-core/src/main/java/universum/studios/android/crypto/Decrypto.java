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
 * Decrypto defines an interface for implementations that may be used to provide <b>one-side</b>
 * cryptographic operation: <b>decryption</b> of a desired data that are encrypted.
 *
 * @author Martin Albedinsky
 * @see Encrypto
 */
public interface Decrypto {

	/**
	 * Performs decryption operation for the specified <var>data</var>.
	 *
	 * @param data The data to be decrypted.
	 * @return Decrypted data.
	 * @throws CryptographyException If the decryption operation has failed.
	 */
	@NonNull
	byte[] decrypt(@NonNull byte[] data) throws CryptographyException;
}