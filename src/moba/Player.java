/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moba;

/**
 *
 * @author Hairul Anam
 */
public interface Player {
    String getNickName();
    int getMoney();
    void setFriend();
    Player[] getFriends();
    void setHeroes();
    Hero[] getHeroes();
}
