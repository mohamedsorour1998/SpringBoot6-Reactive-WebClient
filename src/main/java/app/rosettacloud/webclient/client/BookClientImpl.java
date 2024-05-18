package app.rosettacloud.webclient.client;

import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import app.rosettacloud.webclient.model.BookDTO;
import reactor.core.publisher.Flux;

@Service
public class BookClientImpl implements BookClient {

    private static final String API_V3_BOOK = "/api/v3/book";
    private final WebClient webClient;

    public BookClientImpl(WebClient.Builder wBuilder) {

        this.webClient = wBuilder.baseUrl("http://localhost:8080").build();
    }

    @Override
    public Flux<String> listBooks() {
        return webClient.get().uri(API_V3_BOOK)
                .retrieve().bodyToFlux(String.class);
    }

    @Override
    public Flux<Map> listBooksMap() {
        return webClient.get().uri(API_V3_BOOK)
                .retrieve().bodyToFlux(Map.class);
    }

    @Override
    public Flux<BookDTO> listBooksDTO() {
        return webClient.get().uri(API_V3_BOOK)
                .retrieve().bodyToFlux(BookDTO.class);
    }

}
