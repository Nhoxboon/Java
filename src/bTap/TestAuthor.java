package bTap;

public class TestAuthor {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Author au1 = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');

        System.out.println(au1);

        au1.setEmail("nhoxboon@nowhere.com");
        System.out.println(au1);
    }

}
