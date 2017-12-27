package com.jyl.efftctive.generalMethod;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @TODO
 * @author Long
 * @date 2017年12月26日下午5:52:57
 */
public class Demo implements Comparable<Demo>{
	
	private Long id;
	
	private String title;
	
	private String content;

	private Date created;
	
	public Demo(){
		
	}
	
	public Demo(Long id, String title, String content, Date created){
		this.id = id;
		this.title = title;
		this.content = content;
		this.created = created;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Demo)) 
		{
			return false;
		}
		Demo rhs = (Demo) obj;
		return new EqualsBuilder()
		.append(this.id, rhs.id)
		.append(this.title, rhs.title)
		.append(this.content, rhs.content)
		.append(this.created, rhs.created)
		.isEquals();
	}

	@Override
	public int hashCode() {
		
		return new HashCodeBuilder(-82280557, -700257973)
				.append(this.id) 
				.append(this.title) 
				.append(this.content) 
				.append(this.created) 
				.toHashCode();
	}

	@Override
	public String toString() {
		
		return new ToStringBuilder(this)
				.append("id", this.id) 
				.append("title", this.title) 
				.append("content", this.content) 
				.append("created", this.created) 
				.toString();
	}

	public int compareTo(Demo o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
