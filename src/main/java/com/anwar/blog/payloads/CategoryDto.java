package com.anwar.blog.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	private Integer categoryId;
	@NotBlank
	@Size(min = 4,message = "minimum size of the category title is 4 !!")
	private String categoryTitle;
	
	@NotBlank
	@Size(min = 10,message = "minimum size of the category description is 10 !!")
	private String categoryDescription;

}
