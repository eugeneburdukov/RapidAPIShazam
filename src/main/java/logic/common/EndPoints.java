package logic.common;

//import lombok.AccessLevel;
//import lombok.AllArgsConstructor;
//
//@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum EndPoints {

    GET_SHAZAM("https://shazam.p.rapidapi.com/search"),
    POST_SHAZAM("https://shazam.p.rapidapi.com/songs/detect");

    private String URI;

    EndPoints(String URI) {
        this.URI = URI;
    }

    public String getURI() {
        return URI;
    }
}
