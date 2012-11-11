package com.br.databaseDDL;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteDataBase {
	
	
	public static void main(String[] args) {
		
		
		DataBase base = new DataBase("projectValter");
		
		Set<Table> tables = new TreeSet<Table>();
		
		base.setDataBaseTables(tables);
		
		Table table1 = new Table("CLIENTE");
		
		Table table2 = new Table("CLIENTE");
		
		base.getDataBaseTables().add(table1);
		
		base.getDataBaseTables().add(table2);
		
		System.out.println(base.getDataBaseTables().size());
		
	}

}
