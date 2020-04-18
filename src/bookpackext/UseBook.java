package bookpackext;
import bookpack.Book;
/**
 * Created by Mohib on 11/8/2019.
 */
public class UseBook {
    public static void main(String args[]){
        Book books[]=new Book[3];

        books[0]=new Book("Harry Potter","J.K.Rowling",2001);
        books[1]=new Book("The Art of Java","Schildt and Holmes",2005);
        books[2]=new Book("Java:A Beginner's Guide","Schildt",2014);


        for(int i=0;i<books.length;i++)
            books[i].show();
    }
}
