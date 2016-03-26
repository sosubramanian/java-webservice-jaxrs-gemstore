package models;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "id", "stars", "body", "author" })
public class Review {
	
	public Review() {
	}

	public Review(Integer id, Integer stars, String body, String author) {
		super();
		this.id = id;
		this.stars = stars;
		this.body = body;
		this.author = author;
	}

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("stars")
	private Integer stars;
	@JsonProperty("body")
	private String body;
	@JsonProperty("author")
	private String author;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The id
	 */
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The stars
	 */
	@JsonProperty("stars")
	public Integer getStars() {
		return stars;
	}

	/**
	 * 
	 * @param stars
	 *            The stars
	 */
	@JsonProperty("stars")
	public void setStars(Integer stars) {
		this.stars = stars;
	}

	/**
	 * 
	 * @return The body
	 */
	@JsonProperty("body")
	public String getBody() {
		return body;
	}

	/**
	 * 
	 * @param body
	 *            The body
	 */
	@JsonProperty("body")
	public void setBody(String body) {
		this.body = body;
	}

	/**
	 * 
	 * @return The author
	 */
	@JsonProperty("author")
	public String getAuthor() {
		return author;
	}

	/**
	 * 
	 * @param author
	 *            The author
	 */
	@JsonProperty("author")
	public void setAuthor(String author) {
		this.author = author;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}