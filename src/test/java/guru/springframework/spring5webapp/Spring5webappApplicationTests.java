package guru.springframework.spring5webapp;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Spring5webappApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void newAssociatonsPreserved() {
		Book book = new Book("Title", "isbn", "publisher");
		Author firstAuthor = new Author("First", "Last");
		Author otherAuthor = new Author("OtherFirst", "OtherLast");

		book.getAuthors().add(firstAuthor);
		firstAuthor.getBooks().add(book);

		book.getAuthors().add(otherAuthor);
		otherAuthor.getBooks().add(book);

		assert book.getAuthors().size() == 2;
	}

}
