package logic.constants;

//import lombok.AccessLevel;
//import lombok.AllArgsConstructor;
//
//@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ShazamParams {

    TERM("term", "kiss%20the%20rain"),
    LOCALE("locale", "en-US"),
    OFFSET("offset", "0"),
    LIMIT("limit", "5");

    private String param;
    private String paramValue;

    ShazamParams(String param, String paramValue) {
        this.param = param;
        this.paramValue = paramValue;
    }

    public String getParam() {
        return param;
    }

    public String getParamValue() {
        return paramValue;
    }
}
