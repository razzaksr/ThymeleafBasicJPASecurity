package security.thymeleaf.ThymeleafSecurity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoHub extends JpaRepository<Hub, Long>
{

}
