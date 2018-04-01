/*
 * Java Genetic Algorithm Library (@__identifier__@).
 * Copyright (c) @__year__@ Franz Wilhelmstötter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author:
 *    Franz Wilhelmstötter (franz.wilhelmstoetter@gmail.com)
 */
package io.jenetics.util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

/**
 * @author <a href="mailto:franz.wilhelmstoetter@gmail.com">Franz Wilhelmstötter</a>
 * @version !__version__!
 * @since !__version__!
 */
final class SeqView<T> implements MSeq<T> {

	
	@Override
	public void set(int index, T value) {
		Arrays.asList();
	}

	@Override
	public MSeq<T> sort(int start, int end, Comparator<? super T> comparator) {
		return null;
	}

	@Override
	public MSeq<T> subSeq(int start, int end) {
		return null;
	}

	@Override
	public MSeq<T> subSeq(int start) {
		return null;
	}

	@Override
	public T get(int index) {
		return null;
	}

	@Override
	public int length() {
		return 0;
	}

	@Override
	public <B> MSeq<B> map(Function<? super T, ? extends B> mapper) {
		return null;
	}

	@Override
	public MSeq<T> append(Iterable<? extends T> values) {
		return null;
	}

	@Override
	public MSeq<T> prepend(Iterable<? extends T> values) {
		return null;
	}

	@Override
	public ISeq<T> toISeq() {
		return null;
	}

	@Override
	public MSeq<T> copy() {
		return null;
	}
}
