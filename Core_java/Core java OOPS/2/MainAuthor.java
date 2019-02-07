package proj1;

public class MainAuthor {

	public static void main(String[] args) {
		Author a=new Author("ABC","abc@gmail.com",'F');
		Book b=new Book("XYZ");
		b.setPrice(800);
		b.setQty(20);
		System.out.println(b);
	}

}
