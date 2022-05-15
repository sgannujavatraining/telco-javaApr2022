package com.prgs.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionalProgramming {

	String[] stateCodes = { "IN", "IL", "TX", "CA" };
	String[] stateNames = { "Indiana", "Illinois", "Texas", "California" };

	public Map<Integer, String> mapListToHashMap(List<String> list) {

		Map<Integer, String> map = new HashMap<>();
		int key = 1;

		for (String listElement : list) {
			map.put(key, listElement);
			++key;
		}

		return map;
	}

	public Map<Integer, String> mapListToHashMapLambdaStream(List<String> list) {
		Map<Integer, String> map = new HashMap<>();

		list.stream().map(null);
		return null;
	}

	public Map<String, String> mapListToHashMapForEach(List<String> list) {
		Map<String, String> map = new HashMap<>();

		list.forEach((listElement) -> {
			map.put(listElement, listElement);
		});

		return null;
	}
}