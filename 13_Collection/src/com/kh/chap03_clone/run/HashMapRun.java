package com.kh.chap03_clone.run;

import java.util.Map.Entry;

public class HashMapRun<K, V>{
	private Entry<K, V>[] table;
	private int capacity;
	private int size;
	
	class Entry<K, V> {
		K key;
		V value;
		
		Entry<K, V> next;
		
		public Entry<K key, V value, Entry<K, V> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	
	public HashMapRun<K, V>(int capacity) {
		this.capacity = capacity;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('{');
		for(Entry e : table) {
			if(e == null) continue;	
			// {key : value}
			sb.append("{").append(e.key).append(" : ").append(e.value).append("}").append(",");	
			
			Entry next = e.next;
			do {
				if(next != null) {
					sb.append("{").append(next.key).append(" : ").append(next.value).append("}").append(",");	
					next = next.next;
				}
			}while(next != null); //
		}
		//sb.append(Arrays.toString(table));
		
		sb.append('}');
		
		return sb.toString();
	}
	
	public void put(K key, V value) {
		
	}
	
	public V get(K key) {
		
	}
	
	public boolean contains(String key) {
		
	}
	
	public void remove(String key) {
		
	}
	
	public int size() {
		
	}
	
	
	public static void main(String[] args) {
		
	}
}
