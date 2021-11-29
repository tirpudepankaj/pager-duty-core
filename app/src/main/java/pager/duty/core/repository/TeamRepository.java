package pager.duty.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pager.duty.core.entity.Team;

@Repository
public interface TeamRepository extends PagingAndSortingRepository<Team, Long> {

}
