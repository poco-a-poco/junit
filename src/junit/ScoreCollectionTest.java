package junit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class ScoreCollectionTest {

	@Test
	public void answerArthmeticMeanOfTwoNumbers() {
		//Arrange
		ScoreCollection collection = new ScoreCollection();
		collection.add(() -> 5);
		collection.add(() -> 6);

		//Act
		int actualResult = collection.arithmetricMean();

		//Assert
		assertThat (actualResult, equalTo(6));
	}

}
