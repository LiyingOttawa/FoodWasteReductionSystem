/* File: AuthorDataAccessObject.java
 * AuthorDTO: Stanley Pieda
 * Date: 2015
 * Description: Demonstration of DAO Design Pattern with Servlet website
 * References:
 * Ram N. (2013).  Data Access Object Design Pattern or DAO Pattern [blog] Retrieved from
 * http://ramj2ee.blogspot.in/2013/08/data-access-object-design-pattern-or.html
 */
package dataaccesslayer;

import java.sql.SQLException;
import java.util.List;

import transferobjects.AuthorDTO;

public interface AuthorsDao {
	List<AuthorDTO> getAllAuthors()  throws SQLException;
	//List<Author> getAuthorsByFirstName(String firstName);
	AuthorDTO getAuthorByAuthorId(Integer authorID);
	void addAuthor(AuthorDTO author);
	void updateAuthor(AuthorDTO author);
	void deleteAuthor(AuthorDTO author);
}
