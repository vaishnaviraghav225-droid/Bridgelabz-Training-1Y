package library;

import library.books.Books;
import library.members.Members;
import library.transactions.Transactions;
public class Runner{
    public static void main(String[] args){
        Books b=new Books("Java Programming","James Gosling");
        Members m=new Members("Manvi Varshney",124000432);
        Transactions t=new Transactions();
        b.displayBook();
        m.displayMember();
        t.issueBook(b,m);
    }
}
