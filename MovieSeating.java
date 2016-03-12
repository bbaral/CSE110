//Name: Bikram Baral
//Specification: class file for Assignment8
//Filename: MovieSeating.java
//For: CSE110


public class MovieSeating {
	Customer seating[][];

	public MovieSeating(int rowNum, int columnNum) {
		// TODO Auto-generated constructor stub
		seating = new Customer[rowNum][columnNum];
		for(int i = 0; i<rowNum; i++){
		for(int j = 0; j<columnNum; j++)
		seating[i][j] = new Customer();
		}
	}
		
		//returns customer to given row and column
		private Customer getCustomerAt(int row, int col){
			return seating[row][col];
		}

		public boolean assignCustomerAt(int row, int col, Customer tempCustomer) {
		// TODO Auto-generated method stub
		Customer cur = seating[row][col];
		if(cur.getLastName().equals("???")&&cur.getFirstName().equals("???")){
			seating[row][col]=tempCustomer;
			return true;
		}else
		return false;
	}
		public boolean checkBoundaries(int row, int col) {
			// TODO Auto-generated method stub
			if(row<0||col<0||row>=seating.length||col>=seating[0].length)
			return false;
			else
			return true;
		}
			//return current seating
			public String toString(){
				String seats = "The current seating\n ";
				seats+="---------------\n";
				for(int i = 0; i<seating.length; i++){
				for(int j = 0; j<seating[i].length; j++)
				seats += seating[i][j].getFirstName().charAt(0) + "." 
				+ seating[i][j].getLastName().charAt(0) + "." + " ";
				seats += "\n";
			}
				return seats;
		}
	}


