package app.rosettacloud.webclient.client;

import java.util.Map;

import reactor.core.publisher.Flux;

public interface BookClient {
    Flux<String> listBooks();
    Flux<Map> listBooksMap();

}
