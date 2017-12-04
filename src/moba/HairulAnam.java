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
public class HairulAnam implements Player{
    protected String NICK_NAME;protected int MONEY;
    protected Player[] FRIENDS;protected Hero[] HEROES;
    HairulAnam(){
        NICK_NAME = "HAIRUL ANAM";MONEY = 3000;
    }
    @Override
    public String getNickName() {
        return NICK_NAME;
    }
    @Override
    public int getMoney() {
        return MONEY;
    }
    @Override
    public void setFriend() {
        FRIENDS = new Player[1];
        FRIENDS[0] = new Adifia();
    }
    @Override
    public Player[] getFriends() {
        return FRIENDS;
    }
    @Override
    public void setHeroes() {
        HEROES = new Hero[3];
        HEROES[0] = new Akai();
        HEROES[1] = new Alice();
        HEROES[2] = new Alpha();
    }
    @Override
    public Hero[] getHeroes() {
        return HEROES;
    }
    
}
