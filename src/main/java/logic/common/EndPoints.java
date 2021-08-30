package logic.common;

//import lombok.AccessLevel;
//import lombok.AllArgsConstructor;
//
//@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum EndPoints {

    GET_SHAZAM("https://shazam.p.rapidapi.com/search");

    private String URI;

    EndPoints(String URI) {
        this.URI = URI;
    }

    public String getURI() {
        return URI;
    }
}
