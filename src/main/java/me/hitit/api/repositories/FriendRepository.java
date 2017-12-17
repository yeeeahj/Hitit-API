package me.hitit.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.hitit.api.domains.Friend;
import me.hitit.api.domains.primary_keys.FriendPrimaryKey;

/**
 * FriendRepository interface.
 *
 * @author cheoljin_k
 */
@Repository
public interface FriendRepository extends JpaRepository<Friend, FriendPrimaryKey> {

}
