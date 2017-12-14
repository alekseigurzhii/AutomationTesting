package com.epam.task.notepad.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.epam.task.notepad.Record;

public class NotepadDaoImpl implements NotepadDao {

	private HashMap<Date, List<Record>> data;
	
	
	public NotepadDaoImpl() {
		data = new HashMap<>();
	}
	
	@Override
	public void add(Record record) {
		Date recordDate = record.getDate();
		
		List<Record> records = data.get(recordDate);
		
		if(records == null) {
			records = new ArrayList<>();
			data.put(recordDate, records);
		}
		
		records.add(record);
		
	}

	@Override
	public void delete(Record record) {
		Date recordDate = record.getDate();
		List<Record> records = data.get(recordDate);
		
		if(records != null) {
			Iterator<Record> it = records.iterator();
			while(it.hasNext()) {
				Record item = it.next();
				if(item.getId() == record.getId()) {
					it.remove();
				}
			}
		}
	}

	@Override
	public List<Record> findByDate(Date date) {
		return data.get(date);
	}

	@Override
	public List<Record> findByText(String text) {
		List<Record> result = new ArrayList<>();
		
		for(List<Record> list : data.values()) {
			for(Record record: list) {
				if(record.getText() != null
				 && record.getText().equals(text)) {
					result.add(record);
				}
			}
		}
		
		return result;
	}
}
