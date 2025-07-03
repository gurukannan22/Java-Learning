package programs;

public class Website {
    String url;
    String imageUrl;
    String webDate;

    Website(String url, String imageUrl, String webDate){
        this.url = url;
        this.imageUrl = imageUrl;
        this.webDate =webDate;
    }

    Website(String webDate){
        this.webDate = webDate;
    }
    public void welcomeMessage(String websiteName){
        String message = "Hi Welcome to the " + websiteName;
        System.out.println(message);
    }

    public void webData(String url, String imageUrl, String webDate){
        System.out.println("The URL is : " + url+"\n"+"The Image URL is "+imageUrl+"\n"+"The Web Time is : "+webDate);
    }
}

//default constructor
// parameterized contructor / user defined contructor