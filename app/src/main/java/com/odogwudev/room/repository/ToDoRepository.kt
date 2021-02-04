package com.odogwudev.room.repository


import androidx.lifecycle.LiveData
import com.odogwudev.room.model.ToDo

class ToDoRepository(private val toDoDao: ToDoDao) {
    val allToDo: LiveData<List<ToDo>> = toDoDao.getAllToDo()

    suspend fun insertToDo(toDo: ToDo) {
        toDoDao.insertToDo(toDo)
    }

    suspend fun updateToDo(toDo: ToDo) {
        toDoDao.updateToDo(toDo)
    }

    suspend fun deleteToDo(toDo: ToDo) {
        toDoDao.deleteToDo(toDo)
    }
}