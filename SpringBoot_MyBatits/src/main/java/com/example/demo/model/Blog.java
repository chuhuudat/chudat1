package com.example.demo.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
	private Integer blogID;
	private String blogName;
	private Date createOn;
	
	@Override
	public String toString() {
		return "Blog [blogID ="+blogID+", blogName ="+blogName+", createOn ="+createOn+"]";
	}

}
