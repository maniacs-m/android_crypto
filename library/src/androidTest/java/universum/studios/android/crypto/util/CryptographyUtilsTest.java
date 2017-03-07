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
package universum.studios.android.crypto.util;

import android.support.annotation.NonNull;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import universum.studios.android.crypto.CryptographyException;
import universum.studios.android.crypto.Decrypto;
import universum.studios.android.crypto.Encrypto;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Martin Albedinsky
 */
@RunWith(AndroidJUnit4.class)
public final class CryptographyUtilsTest {

	@SuppressWarnings("unused")
	private static final String TAG = "CryptographyUtilsTest";

	@Test
	public void testEncrypt() {
		final String encryptedValue = CryptographyUtils.encrypt("Encrypto", new Encrypto() {

			@NonNull
			@Override
			public byte[] encrypt(@NonNull byte[] data) throws CryptographyException {
				return data;
			}
		});
		assertThat(encryptedValue, is("Encrypto"));
	}

	@Test
	public void testDecrypt() {
		final String decryptedValue = CryptographyUtils.decrypt("Decrypto", new Decrypto() {

			@NonNull
			@Override
			public byte[] decrypt(@NonNull byte[] data) throws CryptographyException {
				return data;
			}
		});
		assertThat(decryptedValue, is("Decrypto"));
	}
}