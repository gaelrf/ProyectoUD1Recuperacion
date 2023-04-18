package com.example.proyectoud1recuperacion.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocsItem{

	@JsonProperty("publish_year")
	private List<Integer> publishYear;

	@JsonProperty("author_name")
	private List<String> authorName;

	@JsonProperty("edition_count")
	private int editionCount;

	@JsonProperty("first_publish_year")
	private int firstPublishYear;

	@JsonProperty("seed")
	private List<String> seed;

	@JsonProperty("author_alternative_name")
	private List<String> authorAlternativeName;

	@JsonProperty("isbn")
	private List<String> isbn;

	@JsonProperty("edition_key")
	private List<String> editionKey;

	@JsonProperty("public_scan_b")
	private boolean publicScanB;

	@JsonProperty("title_suggest")
	private String titleSuggest;

	@JsonProperty("language")
	private List<String> language;

	@JsonProperty("type")
	private String type;

	@JsonProperty("title")
	private String title;

	@JsonProperty("last_modified_i")
	private int lastModifiedI;

	@JsonProperty("has_fulltext")
	private boolean hasFulltext;

	@JsonProperty("key")
	private String key;

	@JsonProperty("number_of_pages_median")
	private int numberOfPagesMedian;

	@JsonProperty("author_key")
	private List<String> authorKey;

	@JsonProperty("publisher_facet")
	private List<String> publisherFacet;

	@JsonProperty("title_sort")
	private String titleSort;

	@JsonProperty("ebook_access")
	private String ebookAccess;

	@JsonProperty("_version_")
	private long version;

	@JsonProperty("publisher")
	private List<String> publisher;

	@JsonProperty("author_facet")
	private List<String> authorFacet;

	@JsonProperty("publish_date")
	private List<String> publishDate;

	@JsonProperty("ebook_count_i")
	private int ebookCountI;

	@JsonProperty("cover_i")
	private int coverI;

	@JsonProperty("cover_edition_key")
	private String coverEditionKey;

	@JsonProperty("subject")
	private List<String> subject;

	@JsonProperty("lcc")
	private List<String> lcc;

	@JsonProperty("lcc_sort")
	private String lccSort;

	@JsonProperty("subject_key")
	private List<String> subjectKey;

	@JsonProperty("subject_facet")
	private List<String> subjectFacet;

	@JsonProperty("currently_reading_count")
	private int currentlyReadingCount;

	@JsonProperty("already_read_count")
	private int alreadyReadCount;

	@JsonProperty("readinglog_count")
	private int readinglogCount;

	@JsonProperty("want_to_read_count")
	private int wantToReadCount;

	@JsonProperty("id_amazon")
	private List<String> idAmazon;

	@JsonProperty("oclc")
	private List<String> oclc;

	@JsonProperty("publish_place")
	private List<String> publishPlace;

	@JsonProperty("place")
	private List<String> place;

	@JsonProperty("time_key")
	private List<String> timeKey;

	@JsonProperty("place_key")
	private List<String> placeKey;

	@JsonProperty("time_facet")
	private List<String> timeFacet;

	@JsonProperty("place_facet")
	private List<String> placeFacet;

	@JsonProperty("time")
	private List<String> time;

	@JsonProperty("person_key")
	private List<String> personKey;

	@JsonProperty("person_facet")
	private List<String> personFacet;

	@JsonProperty("person")
	private List<String> person;

	public List<Integer> getPublishYear(){
		return publishYear;
	}

	public List<String> getAuthorName(){
		return authorName;
	}

	public int getEditionCount(){
		return editionCount;
	}

	public int getFirstPublishYear(){
		return firstPublishYear;
	}

	public List<String> getSeed(){
		return seed;
	}

	public List<String> getAuthorAlternativeName(){
		return authorAlternativeName;
	}

	public List<String> getIsbn(){
		return isbn;
	}

	public List<String> getEditionKey(){
		return editionKey;
	}

	public boolean isPublicScanB(){
		return publicScanB;
	}

	public String getTitleSuggest(){
		return titleSuggest;
	}

	public List<String> getLanguage(){
		return language;
	}

	public String getType(){
		return type;
	}

	public String getTitle(){
		return title;
	}

	public int getLastModifiedI(){
		return lastModifiedI;
	}

	public boolean isHasFulltext(){
		return hasFulltext;
	}

	public String getKey(){
		return key;
	}

	public int getNumberOfPagesMedian(){
		return numberOfPagesMedian;
	}

	public List<String> getAuthorKey(){
		return authorKey;
	}

	public List<String> getPublisherFacet(){
		return publisherFacet;
	}

	public String getTitleSort(){
		return titleSort;
	}

	public String getEbookAccess(){
		return ebookAccess;
	}

	public long getVersion(){
		return version;
	}

	public List<String> getPublisher(){
		return publisher;
	}

	public List<String> getAuthorFacet(){
		return authorFacet;
	}

	public List<String> getPublishDate(){
		return publishDate;
	}

	public int getEbookCountI(){
		return ebookCountI;
	}

	public int getCoverI(){
		return coverI;
	}

	public String getCoverEditionKey(){
		return coverEditionKey;
	}

	public List<String> getSubject(){
		return subject;
	}

	public List<String> getLcc(){
		return lcc;
	}

	public String getLccSort(){
		return lccSort;
	}

	public List<String> getSubjectKey(){
		return subjectKey;
	}

	public List<String> getSubjectFacet(){
		return subjectFacet;
	}

	public int getCurrentlyReadingCount(){
		return currentlyReadingCount;
	}

	public int getAlreadyReadCount(){
		return alreadyReadCount;
	}

	public int getReadinglogCount(){
		return readinglogCount;
	}

	public int getWantToReadCount(){
		return wantToReadCount;
	}

	public List<String> getIdAmazon(){
		return idAmazon;
	}

	public List<String> getOclc(){
		return oclc;
	}

	public List<String> getPublishPlace(){
		return publishPlace;
	}

	public List<String> getPlace(){
		return place;
	}

	public List<String> getTimeKey(){
		return timeKey;
	}

	public List<String> getPlaceKey(){
		return placeKey;
	}

	public List<String> getTimeFacet(){
		return timeFacet;
	}

	public List<String> getPlaceFacet(){
		return placeFacet;
	}

	public List<String> getTime(){
		return time;
	}

	public List<String> getPersonKey(){
		return personKey;
	}

	public List<String> getPersonFacet(){
		return personFacet;
	}

	public List<String> getPerson(){
		return person;
	}
}