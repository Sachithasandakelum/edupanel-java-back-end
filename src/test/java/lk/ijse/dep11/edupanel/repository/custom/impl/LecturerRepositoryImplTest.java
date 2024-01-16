package lk.ijse.dep11.edupanel.repository.custom.impl;

import lk.ijse.dep11.edupanel.entity.Lecturer;
import lk.ijse.dep11.edupanel.repository.RepositoryFactory;
import lk.ijse.dep11.edupanel.repository.custom.LecturerRepository;
import lk.ijse.dep11.edupanel.util.LecturerType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import static org.junit.jupiter.api.Assertions.*;

class LecturerRepositoryImplTest {

    private final LecturerRepository repository = RepositoryFactory.getInstance()
            .getRepository(RepositoryFactory.RepositoryType.LECTURER);
    private EntityManager entityManager;

    @BeforeEach
    void setUp() {
        entityManager = Persistence.createEntityManagerFactory("default")
                .createEntityManager();
        repository.setEntityManager(entityManager);
        entityManager.getTransaction().begin();
    }

    @AfterEach
    void tearDown() {
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Test
    void save() {
        Lecturer lecturer = new Lecturer("Kasun Sampath",
                "Senior Trainer",
                "BSc (Hons) in Computing",
                LecturerType.FULL_TIME,
                0);
        Lecturer savedLecturer = repository.save(lecturer);
        assertTrue(savedLecturer.getId() > 0);
        savedLecturer = entityManager.find(Lecturer.class, savedLecturer.getId());
        assertNotNull(savedLecturer);
    }

    @Test
    void update() {
        Lecturer lecturer = new Lecturer("Kasun Sampath",
                "Senior Trainer",
                "BSc (Hons) in Computing",
                LecturerType.FULL_TIME,
                0);
        Lecturer savedLecturer = repository.save(lecturer);
        savedLecturer.setName("Nuwan Ramindu");
        savedLecturer.setQualifications("DEP");
        savedLecturer.setType(LecturerType.VISITING);
        repository.update(savedLecturer);

        Lecturer actualLecturer = entityManager.find(Lecturer.class, savedLecturer.getId());
        assertEquals(savedLecturer, actualLecturer);
    }

    @Test
    void deleteById() {
        Lecturer lecturer = new Lecturer("Kasun Sampath",
                "Senior Trainer",
                "BSc (Hons) in Computing",
                LecturerType.FULL_TIME,
                0);
        Lecturer savedLecturer = repository.save(lecturer);
        repository.deleteById(savedLecturer.getId());

        Lecturer dbLecturer = entityManager.find(Lecturer.class, savedLecturer.getId());
        assertNull(dbLecturer);
    }

    @Test
    void existsById() {
        Lecturer lecturer = new Lecturer("Kasun Sampath",
                "Senior Trainer",
                "BSc (Hons) in Computing",
                LecturerType.FULL_TIME,
                0);
        Lecturer savedLecturer = repository.save(lecturer);
        boolean result = repository.existsById(savedLecturer.getId());

        assertTrue(result);
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void count() {
    }
}