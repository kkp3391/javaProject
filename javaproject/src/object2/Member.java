package object2;

public class Member {
//회원id
//회원이름
//(대여)도서[] 배열타입 필드선언 rentBooks
//대여기능 rentBooks = new Book[3];
//반납기능 overdue()
	private String memberId;
	private String memberName;
	private Book[] rentBooks = new Book[5];
	private int i;
	private Object bookInfo;
	
	public Member() {}
	
	public Member(String memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void rent(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] == null) {
				rentBooks[i] = book;
				break;
			}
		}
	}

	public void overdue(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i].getBookTitle().equals(book.getBookTitle())) {
				rentBooks[i] = null;
			}

		}

	}
	
	public String getBookInfo() {
		String result = "";
		result = memberName;
		for(i=0; i<rentBooks.length; i++) {
			
			if(rentBooks[i] !=null) {
				result = result + "/" + rentBooks[i].getBookTitle();
			
			}
		}return result;
		

	}
	
	
}
