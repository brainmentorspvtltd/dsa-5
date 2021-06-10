package com.brainmentors.todo.repo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import com.brainmentors.todo.dto.ToDoDTO;
import com.brainmentors.todo.utils.Constants;

// Singleton class - Design Pattern

public class ToDoRepo implements Serializable, IToDoRepo {
	private File file;
	private static ToDoRepo todoRepo;
	private ToDoRepo() throws IOException {
		file = new File(Constants.FILE_PATH);
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("New File Created...");
		}
	}
	
	public static IToDoRepo getInstance() {
		if(todoRepo == null) {
			try {
				todoRepo = new ToDoRepo();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return todoRepo;
	}
	
	@Override
	public boolean addTask(ToDoDTO todo) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		 
		ArrayList<ToDoDTO> list = printTask();
		if(list.size() > 0 && list != null ) {
			list.add(todo);
		}
		else {
			list = new ArrayList<ToDoDTO>();
			list.add(todo);
		}
		FileOutputStream fo = null;
		ObjectOutputStream os = null;
		try {
			fo = new FileOutputStream(file);
			os = new ObjectOutputStream(fo);
			os.writeObject(list);
		}
		finally {
			if(os != null) {
				os.close();
			}
			if(fo != null) {
				fo.close();
			}
		}
		return true;
	}

	@Override
	public boolean removeTask(ToDoDTO todo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean searchTask(ToDoDTO todo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTask(ToDoDTO todo) {
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	public ArrayList<ToDoDTO> printTask() throws ClassNotFoundException, IOException {
//		// TODO Auto-generated method stub
//		FileInputStream fs = null;
//		ObjectInputStream os = null;
//		ArrayList<ToDoDTO> list = new ArrayList<>();
//		try {
//			// Deserialization
//			fs = new FileInputStream(file);
//			os = new ObjectInputStream(fs);
//			ArrayList<ToDoDTO> todolist = (ArrayList<ToDoDTO>)os.readObject();
//			if(todolist.size() > 0) {
//				for(ToDoDTO todoDto : todolist) {
//					list.add(todoDto);
//				}
////				list = todolist;
//			}
//		}
//		catch (Exception e) {
//			// TODO: handle exception
////			e.printStackTrace();
//			System.out.println(e);
//		}
//		finally {
//			if(os != null) {
//				os.close();
//			}
//			if(fs != null) {
//				fs.close();
//			}
//		}
//		
//		return list;
//	}
	
	public ArrayList<ToDoDTO> printTask() throws ClassNotFoundException, IOException {
		ArrayList<ToDoDTO> list = new ArrayList<ToDoDTO>();
		try(FileInputStream fs = new FileInputStream(file)){
			try(ObjectInputStream os = new ObjectInputStream(fs)) {
				list = (ArrayList<ToDoDTO>)os.readObject();
			}
		}
		return list;
	}
	
	

}
