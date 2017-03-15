/*
 * =================================================================================================
 *                             Copyright (C) 2017 Martin Albedinsky
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
package universum.studios.android.crypto.des;

import android.support.annotation.NonNull;

import universum.studios.android.crypto.Crypto;
import universum.studios.android.crypto.Cryptography;
import universum.studios.android.crypto.Decrypto;
import universum.studios.android.crypto.Encrypto;

/**
 * todo:
 *
 * @author Martin Albedinsky
 */
public final class DESCryptography extends Cryptography {

	/**
	 * todo:
	 */
	static final String ALGORITHM_NAME = "DES";

	/**
	 * todo:
	 */
	static final String CIPHER_MODE = "CBC";

	/**
	 * todo:
	 */
	static final String CIPHER_PADDING = "PKCS5Padding";

	/**
	 * todo:
	 */
	static final String CIPHER_TRANSFORMATION = cipherTransformation(ALGORITHM_NAME, CIPHER_MODE, CIPHER_PADDING);

	/**
	 * todo:
	 */
	public static final Factory FACTORY = new Factory() {

		/**
		 */
		@NonNull
		@Override
		public Crypto createCrypto() {
			return DESCrypto.FACTORY.createCrypto();
		}

		/**
		 */
		@NonNull
		@Override
		public Encrypto createEncrypto() {
			return DESEncrypto.FACTORY.createEncrypto();
		}

		/**
		 */
		@NonNull
		@Override
		public Decrypto createDecrypto() {
			return DESDecrypto.FACTORY.createDecrypto();
		}
	};

	/**
	 */
	private DESCryptography() {
		// Creation of instances of this class is not publicly allowed.
	}
}