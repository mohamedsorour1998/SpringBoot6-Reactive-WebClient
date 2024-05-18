package app.rosettacloud.webclient.client;

import java.util.Map;

import app.rosettacloud.webclient.model.BookDTO;
import reactor.core.publisher.Flux;

public interface BookClient {
    Flux<String> listBooks();
    Flux<Map> listBooksMap();
    Flux<BookDTO> listBooksDTO();

}
