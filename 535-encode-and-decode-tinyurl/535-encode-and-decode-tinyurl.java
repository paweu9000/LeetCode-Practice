public class Codec {
    
    private String longer = "";
    private String shorter = "";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        longer = longUrl;
        String[] url = longUrl.split("/");
        shorter = "http://tinyurl.com/" + url[url.length-1].hashCode();
        return shorter;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return longer;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));