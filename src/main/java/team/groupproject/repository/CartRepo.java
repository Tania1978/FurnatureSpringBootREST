package team.groupproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import team.groupproject.entity.Cart;

@Repository
public interface CartRepo extends JpaRepository<Cart, Integer> {

    public Cart findById(int id);
    
    @Query(value = " delete from carts where myuser_id=?1", nativeQuery = true)
    public int deleteCart(Integer id);
    
}
