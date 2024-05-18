package app.rosettacloud.webclient.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookClientImplTest {

    @Autowired

    BookClient bookClient;

    @Test
    void testListBooks() {
        bookClient.listBooks().subscribe(
                res -> System.out.println(res));
    }

    @Test
    void testListBooksMap() {
        bookClient.listBooksMap().subscribe(
                res -> System.out.println(res));
    }

    @Test
    void testListBookDTO() {
        bookClient.listBooksDTO().subscribe(
                res -> System.out.println(res.getBookName()));
    }
}
