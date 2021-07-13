package javaStuides;

import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.IndicativeSentencesGeneration;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@IndicativeSentencesGeneration(separator = " -> ", generator = DisplayNameGenerator.Simple.class)
class JUnitTestSubjectClassTest
{

	@ParameterizedTest(name = "Testing if the constructor reconise the value {0} as already present.")
	@ValueSource(strings = {"dave", "beluga", "beluga", "spitzen"})
	void testJUnitTestSubjectClass(String username)
	{
		JUnitTestSubjectClass element = new JUnitTestSubjectClass(username);
		System.out.println(element);
	}

}
