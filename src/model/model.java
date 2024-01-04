package model;

import javax.swing.*;
import java.io.PushbackReader;
import java.util.*;

public class model {
    int balance = 0;
    String theme;
    int score = 0;
    String username;
    Map<String, Integer> users = new HashMap<>();
    String permited = "";
    boolean help = false;
    public boolean getHelp(){
        return help;
    }
    public void setHelp(boolean value){
        help = value;
    }
    public model(){

    }

    public void setBalance(Integer balanceNew) {
        balance = balanceNew;
        System.out.println(balance);
    }
    public int getBalance() {
        return balance;
    }


    public Object[] imageIcon(){
        int r = (int)Math.floor(Math.random() * 7);

        if(Objects.equals(theme, "halloween")){
            if(r == 0){
                Object[] result = new Object[2];
                result[0] = new ImageIcon(Objects.requireNonNull(getClass().getResource("/pictures/hallowen/Ghost4.png")));
                result[1] = r;
                return result;
            }
            else if(r == 1){
                Object[] result = new Object[2];
                result[0] =  new ImageIcon(Objects.requireNonNull(getClass().getResource("/pictures/hallowen/Signboard1.png")));;
                result[1] = r;
                return result;
            }
            else if(r == 2){
                Object[] result = new Object[2];
                result[0] =  new ImageIcon(Objects.requireNonNull(getClass().getResource("/pictures/hallowen/Signboard2.png")));
                result[1] = r;
                return result;
            }
            else if(r == 3){
                Object[] result = new Object[2];
                result[0] = new ImageIcon(Objects.requireNonNull(getClass().getResource("/pictures/hallowen/Spider2.png")));
                result[1] = r;
                return result;
            }else if(r == 4){
                Object[] result = new Object[2];
                result[0] =   new ImageIcon(Objects.requireNonNull(getClass().getResource("/pictures/Coin_01.png")));
                result[1] = r;
                return result;
            }
            else if(r == 5){
                Object[] result = new Object[2];
                result[0] = new ImageIcon(Objects.requireNonNull(getClass().getResource("/pictures/—Pngtree—bell icon_5092418.png")));
                result[1] = r;
                return result;
            }
            else{
                Object[] result = new Object[2];
                result[0] = new ImageIcon(Objects.requireNonNull(getClass().getResource("/pictures/hallowen/Bat1.png")));
                result[1] = r;
                return result;
            }

        }
        else{
            if(r == 0){
                Object[] result = new Object[2];
                result[0] = new ImageIcon(Objects.requireNonNull(getClass().getResource("/pictures/fruit/h10.png")));
                result[1] = r;
                return result;
            }
            else if(r == 1){
                Object[] result = new Object[2];
                result[0] =  new ImageIcon(Objects.requireNonNull(getClass().getResource("/pictures/fruit/h1.png")));
                result[1] = r;
                return result;
            }
            else if(r == 2){
                Object[] result = new Object[2];
                result[0] = new ImageIcon(Objects.requireNonNull(getClass().getResource("/pictures/fruit/h2.png")));
                result[1] = r;
                return result;
            }
            else if(r == 3){
                Object[] result = new Object[2];
                result[0] =new ImageIcon(Objects.requireNonNull(getClass().getResource("/pictures/fruit/h5.png")));
                result[1] = r;
                return result;
            }else if(r == 4){
                Object[] result = new Object[2];
                result[0] =   new ImageIcon(Objects.requireNonNull(getClass().getResource("/pictures/Coin_01.png")));
                result[1] = r;
                return result;
            }
            else if(r == 5){
                Object[] result = new Object[2];
                result[0] = new ImageIcon(Objects.requireNonNull(getClass().getResource("/pictures/—Pngtree—bell icon_5092418.png")));
                result[1] = r;
                return result;
            }
            else{
                Object[] result = new Object[2];
                result[0] = new ImageIcon(Objects.requireNonNull(getClass().getResource("/pictures/fruit/h3.png")));
                result[1] = r;
                return result;
            }
        }


    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void calculate(int n, int n1, int n2) {
        if (n == n1 && n2 == n1) {
            if (n1 == 5) {
                balance *= 10; // Bells match
                score += 5;
            } else if (n1 == 4) {
                balance += 50; // Coins match
                score += 2;
            } else {
                balance += 5; // Other matching
                score ++;
            }
        }else
            balance --;


    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public Integer getScore(){
        return score;
    }

    public void addBalance(Integer valueOf) {
        balance += valueOf;
        System.out.println("new balance");
    }

    public Map<String, Integer>  getUsers(){
        return users;
    }

    public void addResult(){
        users.put(username, score);
    }


    public void endGame() {
        addResult();
        balance = 0;
        score = 0;
        username = "";

    }

    public void SetPermit(String s) {
        permited = s;
    }

    public String getPermited(){
        return permited;
    }

}
