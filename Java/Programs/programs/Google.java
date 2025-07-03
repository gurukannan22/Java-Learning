package programs;

public class Google {
    public static void main(String[] args) {
        Website web = new Website("www.google.com","www.photos.google.com","15-06-2025");
        web.imageUrl = "www.ednue.com";
        web.webData(web.url, web.imageUrl,web.webDate);
    }

    static void printThis(){
        System.out.println("This is a print display message");
    }
}