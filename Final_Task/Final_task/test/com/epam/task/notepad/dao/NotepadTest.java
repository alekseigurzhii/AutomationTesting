package com.epam.task.notepad.dao;

import java.util.Date;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.epam.task.notepad.Record;


public class NotepadTest {

	private NotepadDao dao;
	
	@Before
	public void init() {
		dao = new NotepadDaoImpl();
	}
	
	@Test
	public void testAdd() {
		Record testRecord = new Record();
		
		int id = 1;
		Date currentDate = new Date();
		String text = "Text";
		
		
		testRecord.setId(id);
		testRecord.setDate(currentDate);
		testRecord.setText(text);
		
		dao.add(testRecord);
		
		assertNotNull(dao.findByDate(currentDate));
		
	}
	
	@Test
	public void testDelete() {
		Record testRecord = new Record();
		
		int id = 1;
		Date currentDate = new Date();
		String text = "Text";
		
		
		testRecord.setId(id);
		testRecord.setDate(currentDate);
		testRecord.setText(text);
		
		dao.add(testRecord);
		
		assertNotNull(dao.findByDate(currentDate));
		
		dao.delete(testRecord);
		
		assertEquals(dao.findByDate(currentDate).size(), 0);
	}
	
	@Test
	public void testFindByDate() {
		Record testRecord = new Record();
		
		int id = 1;
		Date currentDate = new Date();
		String text = "Text";
		
		
		testRecord.setId(id);
		testRecord.setDate(currentDate);
		testRecord.setText(text);
		
		dao.add(testRecord);
		
		assertEquals(dao.findByDate(currentDate).get(0), testRecord);
	}
	
	@Test
	public void testFindByText() {
		Record testRecord = new Record();
		
		int id = 1;
		Date currentDate = new Date();
		String text = "Text";
		
		
		testRecord.setId(id);
		testRecord.setDate(currentDate);
		testRecord.setText(text);
		
		dao.add(testRecord);
		
		assertEquals(dao.findByText(text).get(0), testRecord);		
	}

}
