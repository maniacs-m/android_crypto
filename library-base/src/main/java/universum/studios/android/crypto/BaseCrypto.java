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
package universum.studios.android.crypto;

import android.support.annotation.NonNull;

/**
 * todo:
 *
 * @author Martin Albedinsky
 */
public abstract class BaseCrypto implements Crypto {

	/**
	 * Constants ===================================================================================
	 */

	/**
	 * Log TAG.
	 */
	// private static final String TAG = "BaseCrypto";

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
	 * todo:
	 */
	private final Encrypto mEncrypto;

	/**
	 * todo:
	 */
	private final Decrypto mDecrypto;

	/**
	 * Constructors ================================================================================
	 */

	/**
	 * todo:
	 *
	 * @param builder
	 */
	protected BaseCrypto(@NonNull BaseBuilder builder) {
		this.mEncrypto = builder.encrypto;
		this.mDecrypto = builder.decrypto;
	}

	/**
	 * Methods =====================================================================================
	 */

	/**
	 */
	@NonNull
	@Override
	public byte[] encrypt(@NonNull byte[] data) throws CryptographyException {
		return mEncrypto.encrypt(data);
	}

	/**
	 */
	@NonNull
	@Override
	public byte[] decrypt(@NonNull byte[] data) throws CryptographyException {
		return mDecrypto.decrypt(data);
	}

	/**
	 * Inner classes ===============================================================================
	 */

	/**
	 * todo:
	 *
	 * @author Martin Albedinsky
	 */
	public static abstract class BaseBuilder implements Crypto.Builder {

		/**
		 * todo:
		 */
		protected Encrypto encrypto;

		/**
		 * todo:
		 */
		protected Decrypto decrypto;

		/**
		 * todo:
		 *
		 * @param encrypto
		 * @param decrypto
		 */
		protected BaseBuilder(@NonNull Encrypto encrypto, @NonNull Decrypto decrypto) {
			this.encrypto = encrypto;
			this.decrypto = decrypto;
		}
	}
}