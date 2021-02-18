package academy.devdojo.youtube.course.endpoint.service;

import academy.devdojo.youtube.core.model.Course;
import academy.devdojo.youtube.core.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CourseService {
    private final CourseRepository repository;

    //pode ser trocado por @RequiredArgsConstructor(onConstructor = @__(@Autowired))
    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

    public Iterable<Course> list(Pageable pageable){
        log.info("Listing all courses");
        return repository.findAll(pageable);
    }
}
