package ho.pte.pteprogmoditalbolt.repository;

import ho.pte.pteprogmoditalbolt.modell.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
