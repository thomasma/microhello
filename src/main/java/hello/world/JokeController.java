package hello.world;

import javax.inject.Inject;

import io.micrometer.core.instrument.MeterRegistry;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Flowable;

@Controller("/joke")
public class JokeController {

    private MeterRegistry meterRegistry;

    public JokeController(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    @Client("http://api.icndb.com/jokes/random?firstName=Chuck&amp;lastName=Doe")
    @Inject
    RxHttpClient httpClient;

    @Get(produces = MediaType.APPLICATION_JSON)
    public Flowable<FunQuote> index() {
        meterRegistry
                .counter("web.access", "controller", "index", "action", "hello")
                .increment();
        return httpClient.retrieve(HttpRequest.GET(""), FunQuote.class);
    }
}