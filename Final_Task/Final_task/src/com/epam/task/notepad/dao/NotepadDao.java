package com.epam.task.notepad.dao;

import java.util.Date;
import java.util.List;

import com.epam.task.notepad.Record;

public interface NotepadDao {

	void add (Record record);
	
	void delete (Record record);
	
	List<Record> findByDate(Date date);
	
	List<Record> findByText(String text);
	
}
