package logic.constants;

//import lombok.AccessLevel;
//import lombok.AllArgsConstructor;
//
//@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum HeadersLabels {

    RAPIDAPI_HOST ("x-rapidapi-host"),
    RAPIDAPI_KEY ("x-rapidapi-key");

    private String Label;

    HeadersLabels(String label) {
        Label = label;
    }

    public String getLabel() {
        return Label;
    }

}
