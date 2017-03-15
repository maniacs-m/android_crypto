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
package universum.studios.android.crypto.des;

import android.support.annotation.NonNull;

import universum.studios.android.crypto.BaseCrypto;
import universum.studios.android.crypto.Crypto;

/**
 * todo:
 *
 * @author Martin Albedinsky
 */
public final class DESCrypto extends BaseCrypto {

	/**
	 * Constants ===================================================================================
	 */

	/**
	 * Log TAG.
	 */
	// private static final String TAG = "DESCrypto";

	/**
	 * Interface ===================================================================================
	 */

	/**
	 * Static members ==============================================================================
	 */

	/**
	 * todo:
	 */
	public static final Crypto.Factory FACTORY = new Factory() {

		/**
		 */
		@NonNull
		@Override
		public Crypto createCrypto() {
			return new Builder().build();
		}
	};

	/**
	 * Members =====================================================================================
	 */

	/**
	 * Constructors ================================================================================
	 */

	/**
	 * todo:
	 *
	 * @param builder
	 */
	private DESCrypto(@NonNull Builder builder) {
		super(builder);
	}

	/**
	 * Methods =====================================================================================
	 */

	/**
	 * Inner classes ===============================================================================
	 */

	/**
	 * todo:
	 *
	 * @author Martin Albedinsky
	 */
	public static final class Builder extends BaseCrypto.BaseBuilder {

		/**
		 * todo:
		 */
		public Builder() {
			super(DESEncrypto.FACTORY.createEncrypto(), DESDecrypto.FACTORY.createDecrypto());
		}

		/**
		 */
		@NonNull
		@Override
		public Crypto build() {
			return new DESCrypto(this);
		}
	}
}