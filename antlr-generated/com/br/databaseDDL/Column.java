package com.br.databaseDDL;

public class Column implements Comparable<Column>{
	
	
	private String columnName;
	
	public Column(String columnName) {
		
		this.columnName = columnName;
		
	}
	
	public String getColumnName() {
		return columnName;
	}
	
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	@Override
	public int compareTo(Column o) {
		// TODO Auto-generated method stub
		return columnName.compareTo(o.columnName);
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return columnName.compareToIgnoreCase(((Column) arg0).columnName) == 0;
	}
}
