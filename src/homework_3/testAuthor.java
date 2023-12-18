package homework_3;

public class testAuthor {
    public static void main(String [] args){
        Author author1 = new Author("Georgiy Roshiroy", "geoorgy@bk.com", "M");
        System.out.println(author1);

        Author author2 = new Author("Potya Isakov", "potsya@gmail.com", "P");
        System.out.println(author2);

       author2.setEmail("ognalchik@gmail.com");
       System.out.println(author2.getEmail());

    }
}
