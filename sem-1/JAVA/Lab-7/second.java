class Book{

	String author = "asdflkj";
}

class bookPublication extends Book{
	String title;

	void setDetails(String title){
		this.title = title;
	}
	void getDetails(){
		System.out.println("Author : "+author);
		System.out.println("Book Publlisher : "+title);
	}
}	

class bookPaper extends Book{
	String title;

	void setDetails(String title){
		this.title = title;
	}
	void getDetails(){
		System.out.println("Author : "+author);
		System.out.println("paper Publlisher : "+title);
	}
}

public class second{

	public static void main(String[] args){

	bookPublication bp = new bookPublication();
	System.out.println("-------------------------Book Publication-------------------------");
	bp.setDetails("abc");
	bp.getDetails();
	System.out.println("-------------------------Paper Publication-------------------------");
	bookPaper pb = new bookPaper();
	pb.setDetails( "xyz");
	pb.getDetails();
	}
}