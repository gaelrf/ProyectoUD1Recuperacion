package com.example.proyectoud1recuperacion.model;

import java.util.List;

public class Response {
	private String q;
	private List<DocsItem> docs;
	private Object offset;
	private int numFound;
	private int start;
	private boolean numFoundExact;

	public void setQ(String q) {
		this.q = q;
	}

	public String getQ() {
		return q;
	}

	public void setDocs(List<DocsItem> docs) {
		this.docs = docs;
	}

	public List<DocsItem> getDocs() {
		return docs;
	}

	public void setOffset(Object offset) {
		this.offset = offset;
	}

	public Object getOffset() {
		return offset;
	}

	public void setNumFound(int numFound) {
		this.numFound = numFound;
	}

	public int getNumFound() {
		return numFound;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getStart() {
		return start;
	}

	public void setNumFoundExact(boolean numFoundExact) {
		this.numFoundExact = numFoundExact;
	}

	public boolean isNumFoundExact() {
		return numFoundExact;
	}

}