package com.vogella.model.todo;

import java.util.List;

import com.vogella.model.tree.TreeItem;

public interface TodoService {

	public List<TreeItem<Todo>> getSampleTodoTreeItems();
}