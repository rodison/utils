package br.com.rodison.utils;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

public class ArrayListBuilder {

	private ArrayListBuilder() {

	}

	@Generated("SparkTools")
	public static <T> Builder<T> builder() {
		return new Builder<T>();
	}

	public static <T> Builder<T> builder(List<T> arrayList) {
		return new Builder<T>(arrayList);
	}

	@Generated("SparkTools")
	public static final class Builder<E> {
		private List<E> arrayList = new ArrayList<>();

		private Builder() {
		}

		private Builder(List<E> arrayList) {
			this.arrayList = arrayList;
		}

		public Builder<E> add(E item) {
			this.arrayList.add(item);
			return this;
		}

		public List<E> build() {
			return this.arrayList;
		}
	}

}
