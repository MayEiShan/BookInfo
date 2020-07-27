package bookinfo;

public class Book extends Author{
	public String name=" ";
	public double price;
	public int qty=0;
	public Book(String name,Author author,double price) {
		super(author.name,author.email,author.gender);
		this.name=name;
		this.price=price;
		
	}
	public Book(String name,Author author,double price,int qty) {
		super(author.name,author.email,author.gender);
		this.name=name;
		this.price=price*qty;
		
		this.qty=qty;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author au1=new Author("Ma Ma","ma@gmail.com",'F');
		Author au2=new Author("Mg Mg","mg@gmail.com",'M');
		Author au3=new Author("Su Su","su@gmail.com",'F');
		Book b1=new Book("Software Engineering",au1,7000);
		Book b2=new Book("Java",au1,8000,2);
		System.out.println("BookInfo writing by Ma Ma:");
		System.out.println("BookName:"+b1.name+"\nAuthor:"+au1.name+"\nPrice:"+b1.price);
		System.out.println("BookName:"+b2.name+"\nAuthor:"+au1.name+"\nPrice:"+b2.price+"\nQty:"+b2.qty);
		System.out.println();
		Book b3=new Book("Digital",au2,4000);
		Book b4=new Book("Management",au2,6000,3);
		System.out.println("BookInfo writing by Mg Mg:");
		System.out.println("BookName:"+b3.name+"\nAuthor:"+au2.name+"\nPrice:"+b3.price);
		System.out.println("BookName:"+b4.name+"\nAuthor:"+au2.name+"\nPrice:"+b4.price+"\nQty:"+b4.qty);
		System.out.println();
		Book b5=new Book("Accounting",au3,5000);
		Book b6=new Book("Javascript",au3,9000,4);
		System.out.println("BookInfo writing by Su Su:");
		System.out.println("BookName:"+b5.name+"\nAuthor:"+au3.name+"\nPrice:"+b5.price);
		System.out.println("BookName:"+b6.name+"\nAuthor:"+au3.name+"\nPrice:"+b6.price+"\nQty:"+b6.qty);
	}
	

}

