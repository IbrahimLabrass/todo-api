package com.ibrahim.todo.dto;

import  lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

import com.ibrahim.todo.models.Category;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryDto {

    private Long id;

    private String name;

    private String description;

    private UserDto user;

    private List<TodoDto> todoList;

    public static Category toEntity(CategoryDto categoryDto) {
        Category category = new Category();

        category.setUser(UserDto.toEntity(categoryDto.getUser()));
        category.setId(categoryDto.getId());
        category.setName(categoryDto.getName());
        category.setDescription(categoryDto.getDescription());

        return category;
    }

    public static CategoryDto fromEntity(Category category) {
        return CategoryDto.builder()
                .id(category.getId())
                .name(category.getName())
                .description(category.getDescription())
                .todoList(
                        category.getTodoList() != null ? category.getTodoList().stream().map(TodoDto::fromEntity).collect(Collectors.toList()) : null
                )
                .build();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public List<TodoDto> getTodoList() {
		return todoList;
	}

	public void setTodoList(List<TodoDto> todoList) {
		this.todoList = todoList;
	}
	
}