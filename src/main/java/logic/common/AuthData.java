package logic.common;

//import lombok.AccessLevel;
//import lombok.AllArgsConstructor;
//
//@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum AuthData {

    BASIC_USER ("shazam.p.rapidapi.com", "fa666ca986msh5d4423ad398341bp1ce1cejsn33a20d13564f");

    private String xRapidApiHost;
    private String xRapidApiKey;

    AuthData(String xRapidApiHost, String xRapidApiKey) {
        this.xRapidApiHost = xRapidApiHost;
        this.xRapidApiKey = xRapidApiKey;
    }

    public String getHost() {
        return xRapidApiHost;
    }

    public String getKey() {
        return xRapidApiKey;
    }
}
