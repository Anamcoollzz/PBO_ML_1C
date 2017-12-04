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
public class YusufAuliya implements Player{

    protected String NICK_NAME;
    protected int MONEY;
    protected Player FRIENDS[];
    protected Hero[] PASUKAN;
    
    YusufAuliya(){
        NICK_NAME = "YUSUF AULIYA";
        MONEY = 2000;
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
        PASUKAN = new Hero[2];
        PASUKAN[0] = new Alice();
        PASUKAN[1] = new Alpha();
    }

    @Override
    public Hero[] getHeroes() {
        return PASUKAN;
    }
    
}
