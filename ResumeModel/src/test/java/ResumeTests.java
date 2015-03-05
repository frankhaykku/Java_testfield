package test.java;

import main.java.ResumeModel.Resume;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static org.junit.Assert.*;

public class ResumeTests {

    @Test
    public void resumeClassEqualTest(){
        Resume resume1 = new Resume();
        Resume resume2 = new Resume();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        assertTrue("Equals failed with resume2 object", resume1.equals(resume2));
        assertFalse("Equals failed with reader object", resume1.equals(reader));
    }

    @Test
    public void resumeClassHashTest() {
        Resume resume1 = new Resume();
        Resume resume2 = new Resume();

        assertEquals("HashCode test failed with resume2 object", resume1.hashCode(), resume2.hashCode());

        resume2.setLastName("Кравченко");
        assertNotEquals("HashCode test failed with resume2 object", resume1.hashCode(), resume2.hashCode());
    }

    @Test
    public void getAllAnotherLangTest() {
        Resume resume = new Resume();

        assertEquals("getAllAnotherLang failed", "Английский", resume.getAllAnotherLang());

        resume.addNewAnotherLang("Французкий");
        resume.addNewAnotherLang("Немецкий");
        resume.addNewAnotherLang("Японский");

        assertEquals("getAllAnotherLang failed", "Английский, Французкий, Немецкий, Японский", resume.getAllAnotherLang());
        assertFalse("addNewAnotherLang return true with null arg!!!", resume.addNewAnotherLang(""));
        assertTrue("addNewAnotherLang return false with String arg!!!", resume.addNewAnotherLang("Китайский"));
    }
}
