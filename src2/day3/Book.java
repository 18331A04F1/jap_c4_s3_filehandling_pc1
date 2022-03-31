package day3;

public class Book {
    String genre;
    String author;
    int price;


    public void setBook(String genre,String author,int price){
        this.genre=genre;
        this.author=author;
        this.price=price;
    }
    public int discount(String genre){
        if(genre =="fiction"){
            return 25;
        }
        else{
            return 0;
        }
    }
    public void display(){
        System.out.println();

    }
}
