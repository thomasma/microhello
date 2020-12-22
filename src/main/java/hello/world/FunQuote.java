package hello.world;

import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FunQuote {
    public String type;
    public Value value;
    public String timestamp;

    @JsonCreator
    public FunQuote(@JsonProperty("type") String type, @JsonProperty("value") Value value) {
        this.type = type;
        this.value = value;
        this.timestamp = Calendar.getInstance().getTime().toString();
    }
}