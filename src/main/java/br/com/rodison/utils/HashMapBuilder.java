package br.com.rodison.utils;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

public class HashMapBuilder {

	private HashMapBuilder() {

	}

	@Generated("SparkTools")
	public static <K, V> Builder<K, V> builder() {
		return new Builder<K, V>();
	}

	public static <K, V> Builder<K, V> builder(Map<K, V> map) {
		return new Builder<K, V>(map);
	}

	@Generated("SparkTools")
	public static final class Builder<K, V> {
		private Map<K, V> map = new HashMap<>();

		private Builder() {
		}

		private Builder(Map<K, V> map) {
			this.map = map;
		}

		public Builder<K, V> put(K key, V value) {
			this.map.put(key, value);
			return this;
		}

		public Map<K, V> build() {
			return this.map;
		}
	}

}
