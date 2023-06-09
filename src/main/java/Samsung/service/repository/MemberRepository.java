package Samsung.service.repository;

import Samsung.service.entity.Category;
import Samsung.service.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {


    @Query("select m from Member m where m.id = :userId")
    Optional<Member> getMyExpenses(@Param("userId") Long userId);
    @Query("select avg(m.food) from Member m ")
    Optional<Integer> getSameAgeExpenseAverageFood();

    @Query("select avg(m.housing) from Member m ")
    Optional<Integer> getSameAgeExpenseAverageHousing();
    @Query("select avg(m.insurance) from Member m ")
    Optional<Integer> getSameAgeExpenseAverageInsurance();
    @Query("select avg(m.subscription) from Member m ")
    Optional<Integer> getSameAgeExpenseAverageSubscription();
    @Query("select avg(m.transportation) from Member m ")
    Optional<Integer> getSameAgeExpenseAverageTransportation();
    @Query("select avg(m.food) from Member m where m.income = :income")
    Optional<Integer> getSameIncomeAverageFood( @Param("income") Long income);

    @Query("select avg(m.housing) from Member m where m.income = :income")
    Optional<Integer> getSameIncomeAverageHousing(@Param("income") Long income);

    @Query("select avg(m.insurance) from Member m where m.income = :income")
    Optional<Integer> getSameIncomeAverageInsurance(@Param("income") Long income);

    @Query("select avg(m.subscription) from Member m where m.income = :income")
    Optional<Integer> getSameIncomeAverageSubscription(@Param("income") Long income);

    @Query("select avg(m.transportation) from Member m where m.income = :income")
    Optional<Integer> getSameIncomeAverageTransportation( @Param("income") Long income);

    Integer findIncomeById(Long userId);
}
