package hello.world;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Value {
    public int id;
    public String joke;

    @JsonCreator
    public Value(@JsonProperty("id") int id, @JsonProperty("joke") String joke) {
        this.id = id;
        this.joke = joke;
    }
}