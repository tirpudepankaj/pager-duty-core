package pager.duty.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pager.duty.core.entity.Developer;

@Repository
public interface DeveloperRepository extends PagingAndSortingRepository<Developer, Long> {
}
