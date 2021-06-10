package com.brainmentors.todo.views;

import static com.brainmentors.todo.utils.MessageReader.getValue;
import static com.brainmentors.todo.utils.Constants.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.brainmentors.todo.dto.ToDoDTO;
import com.brainmentors.todo.repo.IToDoRepo;
import com.brainmentors.todo.repo.ToDoRepo;

public class ToDoView {
	static Scanner scanner = new Scanner(System.in);
	static void print() {
		IToDoRepo todoRepo = ToDoRepo.getInstance();
		try {
			ArrayList<ToDoDTO> list = todoRepo.printTask();
			if(list.size() > 0) {
				for(ToDoDTO todo : list) {
					System.out.println(todo);
				}
			}
			else {
				System.out.println("List is empty...");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void add() {
		scanner.nextLine();
		System.out.println(getValue("entername"));
		String name = scanner.nextLine();
		System.out.println(getValue("enterdesc"));
		String desc = scanner.nextLine();
		ToDoDTO todoDTO = new ToDoDTO(name, desc);
		IToDoRepo todoRepo = null;
		try {
			todoRepo = ToDoRepo.getInstance();
			String result = todoRepo.addTask(todoDTO) ? getValue("record.add") : getValue("record.fail");
			System.out.println(result);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println(getValue("addtask"));
			System.out.println(getValue("removetask"));
			System.out.println(getValue("searchtask"));
			System.out.println(getValue("updatetask"));
			System.out.println(getValue("printtask"));
			System.out.println(getValue("choice"));
			
			int choice = scanner.nextInt();
			switch(choice) {
			case ADD:
				add();
				break;
			case PRINT:
				print();
				break;
			}
			
		}
	}

}
