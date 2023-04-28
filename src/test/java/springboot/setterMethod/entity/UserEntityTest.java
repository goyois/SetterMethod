package springboot.setterMethod.entity;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class UserEntityTest {

    @PersistenceContext
    EntityManager em;

    JPAQueryFactory queryFactory;


    @BeforeEach
    public void before() {
        queryFactory = new JPAQueryFactory(em);

        UserEntity user1 = new UserEntity(1L,"user1","dsad@naver.com","xcz1119",13);
        UserEntity user2 = new UserEntity(2L,"user1","dsa12d@naver.com","xcz1119",13);
        em.persist(user1);
        em.persist(user2);
    }

//    @Test
//    public void queryDsl() {
//        JPAQueryFactory queryFactory = new JPAQueryFactory(em);
//        return;
//    }

}