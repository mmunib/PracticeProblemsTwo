package bookpack;

/**
 * Created by Mohib on 11/6/2019.
 */
class Book1{
    private String title;
    private String author;
    private int pubDate;

    Book1(String t,String a,int d){
        title=t;
        author=a;
        pubDate=d;
    }

    void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

class BookDemo {
    public static void main(String args[]){
        Book1 books[]=new Book1[5];

        books[0]=new Book1("Java:A Beginner's Guide","Schildt",2014);
        books[1]=new Book1("Java:A Complete Reference","Schildt",2014);
        books[2]=new Book1("The Art of Java","Schildt and Holmes",2003);
        books[3]=new Book1("Red Storm Rising","Clancy",1986);
        books[4]=new Book1("On the Road","Kerouac",1955);

        for(int i=0;i<books.length;i++) books[i].show();

    }
}
