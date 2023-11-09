/*Create an interface Searchable and create a method search(String keyword)
 create two classes Document and Webpage implementing the interface and the method */
interface Searchable {
    void search(String keyword);
}

class Document implements Searchable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void search(String keyword) {
        if (content.contains(keyword)) {
            System.out.println("Keyword '" + keyword + "' found in the document.");
        } else {
            System.out.println("Keyword '" + keyword + "' not found in the document.");
        }
    }
}

class Webpage implements Searchable {
    private String url;
    private String htmlContent;

    public Webpage(String url, String htmlContent) {
        this.url = url;
        this.htmlContent = htmlContent;
    }

    @Override
    public void search(String keyword) {
        if (htmlContent.contains(keyword)) {
            System.out.println("Keyword '" + keyword + "' found on the webpage: " + url);
        } else {
            System.out.println("Keyword '" + keyword + "' not found on the webpage: " + url);
        }
    }
}

public class SearchInterface {
    public static void main(String[] args) {
        Document document = new Document("This is a sample document containing text.");
        Webpage webpage = new Webpage("https://example.com", "<html><body>Sample webpage content.</body></html>");

        String keyword = "Sample";
        
        document.search(keyword);
        webpage.search(keyword);
    }
}

