package com.javaex.problem08;

public class Book {
    private int num;
    private String name;
    private String wr;
    private boolean br;
    		
 
		
	    public void displayBookInfo(){
	    	
	        String status;
	        if (br == false) {
	            status = "대여가능";
	        } else {
	            status = "대여중";
	        }

	        System.out.println(num + " 책제목: " + name + ", 저자: " + wr + ", 대여유무: " + status);
	    }
	       
		
		public Book(int num, String name, String wr, boolean br) {
			super();
			this.num = num;
			this.name = name;
			this.wr = wr;
			this.br = br;
			
			
			
			
			
	}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getWr() {
			return wr;
		}

		public void setWr(String wr) {
			this.wr = wr;
		}

		public boolean isBr() {
			return br;
		}

		public void setBr(boolean br) {
			this.br = br;
		}
    
		public void rent() {

		}
    
    
    
    
}
